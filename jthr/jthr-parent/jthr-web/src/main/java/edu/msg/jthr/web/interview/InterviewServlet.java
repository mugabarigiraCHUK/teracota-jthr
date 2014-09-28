package edu.msg.jthr.web.interview;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.msg.jthr.backend.model.Interview;
import edu.msg.jthr.backend.service.CandidateService;
import edu.msg.jthr.backend.service.InterviewService;

/**
 * Servlet implementation class InterviewServlet
 */
@WebServlet("/InterviewServlet")
public class InterviewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private InterviewService interviewService;
	@EJB
	private CandidateService candidateService;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InterviewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Interview> list = interviewService.getAllInterviews();
		request.setAttribute("list", list);
		
		String id = (String) request.getSession().getAttribute("candid");
		getServletContext().log("Inter Servlert cand ID : "+id);
		request.setAttribute("candidate", candidateService.getCandidateById(Long.valueOf(id)) );
		
		request.getRequestDispatcher("/WEB-INF/jsp/interview.jsp").forward(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
