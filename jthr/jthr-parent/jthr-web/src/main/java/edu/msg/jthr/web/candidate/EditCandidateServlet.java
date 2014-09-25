package edu.msg.jthr.web.candidate;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.msg.jthr.backend.model.Candidate;

/**
 * Servlet implementation class EditCandidateServlet
 */
@WebServlet("/EditCandidateServlet")
public class EditCandidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditCandidateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/jsp/editCandidate.jsp").forward(
				request, response);
		response.sendRedirect("/WEB-INF/jsp/editCandidate.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		getServletContext().log("edit candidate id: "+request.getParameter("candidate_id"));
		getServletContext().log(
				"EDIT candidate id: "
						+ request.getParameter("candidate_id"));
		Long id = Long.valueOf(request.getParameter("candidate_id"));

		// TODO - get position with id from request and put it in session
		Candidate c = new Candidate(id, "lastName", "firstName",
		"telephone","mobTelephone", "email", "address", false, "cv",
		 "date");

		request.setAttribute("id", c.getId());
		request.setAttribute("lastName", c.getLastName());
		request.setAttribute("firstName", c.getFirstName());
		request.setAttribute("telephone", c.getTelephone());
		request.setAttribute("mobTelephone", c.getTelephone());
		request.setAttribute("email", c.getEmail());
		request.setAttribute("address", c.getAddress());
		request.setAttribute("relocation", c.getRelocation());
		request.setAttribute("cv", c.getCV());
		request.setAttribute("date", c.getDate());

		// TODO - redirect to editPosition.jsp
		request.getRequestDispatcher("/WEB-INF/jsp/editCandidate.jsp").forward(
				request, response);

	}
}
