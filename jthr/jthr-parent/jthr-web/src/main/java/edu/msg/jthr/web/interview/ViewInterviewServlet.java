package edu.msg.jthr.web.interview;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.msg.jthr.backend.model.Candidate;
import edu.msg.jthr.backend.model.Interview;
import edu.msg.jthr.backend.service.CandidateService;
import edu.msg.jthr.backend.service.InterviewService;

/**
 * Servlet implementation class ViewInterviewServlet
 */
@WebServlet("/ViewInterviewServlet")
public class ViewInterviewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private CandidateService candidateService;
	@EJB
	private InterviewService interviewService;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewInterviewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		getServletContext().log("View interview with id: " + request.getParameter("cand_id"));
		String candid = request.getParameter("cand_id");
		String interid = request.getParameter("inter_id");
		
		Candidate cand = candidateService.getCandidateById(Long.valueOf(candid));
		Interview inter = interviewService.getInterviewById(Long.valueOf(interid));
		
		request.setAttribute("interviewers", inter.getInterviewers() );
		request.setAttribute("data", inter.getDate());
		request.setAttribute("candidate", cand.getFirstName()+" "+cand.getLastName());
		

		request.getRequestDispatcher("/WEB-INF/jsp/viewInterview.jsp").forward(request, response);
	}

}
