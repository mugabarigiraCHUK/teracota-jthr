package edu.msg.jthr.web.candidate;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.msg.jthr.backend.model.Candidate;
import edu.msg.jthr.backend.model.Comment;
import edu.msg.jthr.backend.service.CandidateService;
import edu.msg.jthr.backend.service.UserService;

@WebServlet("/ViewCandidateServlet")
public class ViewCandidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private CandidateService candidateService;
	@EJB
	private UserService userService;

	public ViewCandidateServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("submitComment") != null) {

			Comment c = new Comment();
			c.setText(request.getParameter("comment_text"));
			c.setUser(userService.getUserById((Long) request.getSession()
					.getAttribute("user_id")));
			candidateService.addCandidateComment(c,
					Long.valueOf(request.getParameter("candidate_id")));
			request.setAttribute("submitComment", null);
		} else if (request.getParameter("editComment") != null) {

			getServletContext()
					.log("text to be saved: "
							+ request.getParameter("comment_text"));

			String commentId = request.getParameter("comment_id");
			String candidateId = request.getParameter("candidate_id");
			Candidate candidate = candidateService.getCandidateById(Long
					.parseLong(candidateId));

			Comment com = null;
			for (Comment comment : candidate.getComments()) {
				if (comment.getId().equals(Long.parseLong(commentId))) {
					com = comment;
				}
			}
			if (com != null) {
				com.setText(request.getParameter("comment_text"));
				candidateService.editCandidateComment(com,
						Long.parseLong(candidateId));
			}
		} else if (request.getParameter("deleteComment") != null) {
			String commentId = request.getParameter("comment_id");
			Long candidateId = Long.valueOf(request
					.getParameter("candidate_id"));
			Candidate candidate = candidateService
					.getCandidateById(candidateId);

			Comment com = null;
			for (Comment comment : candidate.getComments()) {
				if (comment.getId().equals(Long.parseLong(commentId))) {
					com = comment;
				}
			}
			if (com != null) {
				candidateService.deleteCandidateComment(com, candidateId);
			}
		}
		getServletContext().log(
				"IN VIEW ID iI :  " + request.getParameter("candidate_id"));
		Long id = Long.valueOf(request.getParameter("candidate_id"));

		Candidate candidate = candidateService.getCandidateById(id);
		request.setAttribute("candidateId", candidate.getId());
		request.setAttribute("lastName", candidate.getLastName());
		request.setAttribute("firstName", candidate.getFirstName());
		request.setAttribute("telephone", candidate.getTelephone());
		request.setAttribute("mobTelephone", candidate.getTelephone());
		request.setAttribute("email", candidate.getEmail());
		request.setAttribute("address", candidate.getAddress());
		request.setAttribute("relocation", candidate.getRelocation());
		request.setAttribute("cv", candidate.getCV());
		request.setAttribute("interviews", candidate.getInterviews());
		request.setAttribute("comments", candidate.getComments());

		request.getRequestDispatcher("/WEB-INF/jsp/viewCandidate.jsp").forward(
				request, response);
		return;

	}
}
