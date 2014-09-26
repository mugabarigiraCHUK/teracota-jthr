package edu.msg.jthr.web.candidate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.msg.jthr.backend.model.Candidate;
import edu.msg.jthr.backend.model.Comment;
import edu.msg.jthr.backend.model.Interview;
import edu.msg.jthr.backend.service.CandidateService;

@WebServlet("/AddCandidateServlet")
public class AddCandidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private CandidateService service;

	public AddCandidateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/jsp/addCandidate.jsp").forward(
				request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String lastName = request.getParameter("lastName");
		String firstName = request.getParameter("firstName");
		String telephone = request.getParameter("telephone");
		String mobileTelephone = request.getParameter("mobileTelephone");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		Boolean relocation;
		if (request.getParameter("relocation") == null)
			relocation = false;
		else
			relocation = true;
		String cv = "myCV";
		List<Interview> interviews = new ArrayList<Interview>();
		List<Comment> comments = new ArrayList<Comment>();
		Candidate candidate = new Candidate(lastName, firstName, telephone,
				mobileTelephone, email, address, relocation, cv, interviews,
				comments);
		service.addCandidate(candidate);
		response.sendRedirect(request.getContextPath() + "/candidate");
	}

}
