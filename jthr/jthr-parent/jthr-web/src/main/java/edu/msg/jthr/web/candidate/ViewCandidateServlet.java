package edu.msg.jthr.web.candidate;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.msg.jthr.backend.model.Candidate;
import edu.msg.jthr.backend.model.Comment;
import edu.msg.jthr.backend.model.Interview;

/**
 * Servlet implementation class ViewCandidateServlet
 */
@WebServlet("/ViewCandidateServlet")
public class ViewCandidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewCandidateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("submitComment") != null) {
			return;
		} else if (request.getParameter("editComment") != null) {
			return;
		} else if (request.getParameter("updateComment") != null) {
			return;
		} else if (request.getParameter("deleteComment") != null) {
			return;
		} else {
			getServletContext().log(
					"VIEW candidate id: "
							+ request.getParameter("candidate_id"));
			Long id = Long.valueOf(request.getParameter("candidate_id"));

			// TODO - get position with id from request and put it in session
			Candidate c = new Candidate(id, "lastName", "firstName", "telephone",
					"mobTelephone", "email", "address", false, "cv",
					new ArrayList<Interview>(), new ArrayList<Comment>());

			request.setAttribute("id", c.getId());
			request.setAttribute("lastName", c.getLastName());
			request.setAttribute("firstName", c.getFirstName());
			request.setAttribute("telephone", c.getTelephone());
			request.setAttribute("mobTelephone", c.getTelephone());
			request.setAttribute("email", c.getEmail());
			request.setAttribute("address", c.getAddress());
			request.setAttribute("relocation", c.getRelocation());
			request.setAttribute("cv", c.getCV());
			request.setAttribute("interviews", c.getInterviews());
			request.setAttribute("comments", c.getComments());


			// TODO - redirect to editPosition.jsp
			request.getRequestDispatcher("/WEB-INF/jsp/viewCandidate.jsp")
					.forward(request, response);
			return;
		}
	}
}
