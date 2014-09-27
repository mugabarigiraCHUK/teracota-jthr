package edu.msg.jthr.web.position;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.msg.jthr.backend.model.Candidate;
import edu.msg.jthr.backend.model.Comment;
import edu.msg.jthr.backend.model.Position;
import edu.msg.jthr.backend.service.PositionService;
import edu.msg.jthr.backend.service.UserService;

/**
 * Servlet implementation class ViewPositionServlet
 */
@WebServlet("/ViewPositionServlet")
public class ViewPositionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	private PositionService positionService;
	@EJB
	private UserService userService;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewPositionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("submitComment") != null) {
			Comment c = new Comment();
			c.setText(request.getParameter("comment_text"));
			c.setUser(userService.getUserById((Long) request.getSession().getAttribute("user_id")));
			positionService.addPositionComment(c, Long.parseLong(request.getParameter("position_id")));
			request.setAttribute("submitComment", null);
		} else if (request.getParameter("editComment") != null) {
			getServletContext().log("text to be saved: " + request.getParameter("comment_text"));
			
			String commentId = request.getParameter("comment_id");
			String positionId = request.getParameter("position_id");
			Position p = positionService.getPositionById(Long.parseLong(positionId));

			Comment com = null;
			for (Comment c : p.getComments()) {
				if (c.getId().equals(Long.parseLong(commentId))) {
					com = c;
				}
			}
			if (com != null) {				
				com.setText(request.getParameter("comment_text"));
				positionService.editPositionComment(com, Long.parseLong(positionId));
			}
		} else if (request.getParameter("deleteComment") != null) {
			String commentId = request.getParameter("comment_id");
			String positionId = request.getParameter("position_id");
			Position p = positionService.getPositionById(Long.parseLong(positionId));

			Comment com = null;
			for (Comment c : p.getComments()) {
				if (c.getId().equals(Long.parseLong(commentId))) {
					com = c;
				}
			}
			if (com != null) {
				positionService.deletePositionComment(com, Long.parseLong(positionId));
			}
		} else if (request.getParameter("closePosition") != null){
			getServletContext().log("close position with id: " + request.getParameter("position_id"));
			positionService.closePosition(Long.parseLong(request.getParameter("position_id")));
			
		} else if (request.getParameter("approvePosition") != null){
			getServletContext().log("approve position with id: " + request.getParameter("position_id"));
			positionService.approvePosition(Long.parseLong(request.getParameter("position_id")));
			
			/* --------------------------------CANDIDATE------------------------------------- */
		} else if (request.getParameter("viewCandidate") != null){
			getServletContext().log("view candidate with id: " + request.getParameter("candidate_id"));
			getServletConfig().getServletContext().getRequestDispatcher("/viewcandidate").forward(request, response);
		}else if (request.getParameter("removeCandidate") != null){
			getServletContext().log("remove candidate with id: " + request.getParameter("candidate_id"));
			positionService.removeCandidateFromPosition(Long.parseLong(request.getParameter("candidate_id")), Long.parseLong(request.getParameter("position_id")));
		}else if (request.getParameter("acceptCandidate") != null){
			getServletContext().log("accept candidate with id: " + request.getParameter("candidate_id"));
			positionService.acceptCandidateToPosition(Long.parseLong(request.getParameter("candidate_id")), Long.parseLong(request.getParameter("position_id")));
		}
		
		getServletContext().log("view position with id: " + request.getParameter("position_id"));
		String id = request.getParameter("position_id");

		Position p = positionService.getPositionById(Long.parseLong(id));
		request.setAttribute("positionId", p.getId());
		request.setAttribute("positionName", p.getName());
		request.setAttribute("positionDepartment", p.getDepartment().getDepartName());
		request.setAttribute("positionDepartment", p.getDepartment());
		request.setAttribute("positionProject", p.getProject().getProjectName());
		request.setAttribute("positionRequirements", p.getRequirements());
		request.setAttribute("positionResponsibilities", p.getResponsibilities());
		request.setAttribute("positionNrOfPlaces", p.getNrOfPlaces());
		request.setAttribute("positionCandidates", p.getCandidates());
		request.setAttribute("positionAcceptedCandidates", p.getAcceptedCandidates());
		request.setAttribute("comments", p.getComments());
		request.setAttribute("isApproved", p.getIsApproved());
		request.setAttribute("isClosed", p.getIsClosed());

		// TODO - redirect to editPosition.jsp
		request.getRequestDispatcher("/WEB-INF/jsp/viewPosition.jsp").forward(request, response);
		return;

	}

}
