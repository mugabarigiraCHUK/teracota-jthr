package edu.msg.jthr.web.interview;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.msg.jthr.backend.model.Candidate;
import edu.msg.jthr.backend.model.Interview;
import edu.msg.jthr.backend.model.User;
import edu.msg.jthr.backend.service.CandidateService;
import edu.msg.jthr.backend.service.InterviewService;
import edu.msg.jthr.backend.service.UserService;

/**
 * Servlet implementation class AddInterviewServlet
 */
@WebServlet("/AddInterviewServlet")
public class AddInterviewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private UserService userService;
	@EJB
	private CandidateService candidateService;
	@EJB
	private InterviewService interviewService;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddInterviewServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("submit") == null) {

			String s = (String) request.getSession().getAttribute("candid");
			Candidate cand = candidateService.getCandidateById(Long.valueOf(s));

			List<User> users = userService.getAllUsers();
			Map<Long, String> m = new HashMap<>();

			for (User u : users) {
				m.put(u.getId(), u.getFirstName() + " " + u.getLastName());
			}

			request.setAttribute("interviewList", m);
			request.setAttribute("candidate",cand.getFirstName() + " " + cand.getLastName());
			
			
			request.getRequestDispatcher("/WEB-INF/jsp/addInterview.jsp")
					.forward(request, response);
		} else {
			
			Interview interview = new Interview();
			interview.setDate(request.getParameter("date"));
			getServletContext().log("New Interview Date : "+request.getParameter("date"));
			
			String str = request.getParameter("interSelected");
			String[] str2 = str.split(",");

			List<String> usersSelected = Arrays.asList(str2);
			getServletContext().log("New Interview Selected Users : "+usersSelected);
			List<User> dbAllUsers = userService.getAllUsers();
			
			for (String s : usersSelected) {
				for (User u : dbAllUsers) {
					if (s.equals(u.getFirstName() + " " + u.getLastName())) {
						
						getServletContext().log("In Fors  : "+s+" = "+u.getFirstName() + " " + u.getLastName());

						interview.getInterviewers().add(userService.getUserById(u.getId()));
					}
				}
			}
			
			getServletContext().log("FINAL Interview  : "+interview);
			interviewService.addInterview(interview);
			
			String s = (String) request.getSession().getAttribute("candid");
			Candidate cand = candidateService.getCandidateById(Long.valueOf(s));
			getServletContext().log("Candidate interviewed  : "+cand);
			
			cand.getInterviews().add(interview);
			getServletContext().log("Candidate after int add : "+cand);
			candidateService.editCandidate(cand);
			
			/*request.getSession().removeAttribute("candid");
			getServletContext().log("Sessioned Cleared ?  : "+request.getSession().getAttribute("candid"));*/
			
			response.sendRedirect(request.getContextPath() + "/interview");
			
		}
	}

}
