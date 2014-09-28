package edu.msg.jthr.web.candidate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import edu.msg.jthr.backend.model.Candidate;
import edu.msg.jthr.backend.service.CandidateService;
import edu.msg.jthr.backend.service.InterviewService;

@MultipartConfig
public class AddCandidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private CandidateService candidateService;
	@EJB
	private InterviewService interviewService;

	public AddCandidateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/jsp/addCandidate.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String contentType = request.getContentType();
		if ((contentType.indexOf("multipart/form-data") >= 0)) {

		}
		String lastName = getValue(request.getPart("lastName"));
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

		// List<Interview> interviews = new ArrayList<Interview>();
		// Interview interview = new
		// Interview(request.getParameter("interview"));
		// interviews.add(interview);
		//
		// List<Comment> comments = new ArrayList<Comment>();
		// Comment comment = new Comment(request.getParameter("comment"));
		// comments.add(comment);
		//
		// lastName, firstName, telephone,
		// mobileTelephone, email, address, relocation, cv, interviews,
		// comments);

		Candidate candidate = new Candidate();
		candidate.setFirstName(firstName);
		candidate.setLastName(lastName);
		candidate.setTelephone(telephone);
		candidate.setMobTelephone(mobileTelephone);
		candidate.setEmail(email);
		candidate.setAddress(address);
		candidate.setRelocation(relocation);
		candidate.setCV(cv);

		request.getServletContext().log(candidate.toString());

		candidateService.addCandidate(candidate);

		response.sendRedirect(request.getContextPath() + "/candidate");
	}
	
	private static String getValue(Part part) throws IOException {
	    BufferedReader reader = new BufferedReader(new InputStreamReader(part.getInputStream(), "UTF-8"));
	    StringBuilder value = new StringBuilder();
	    char[] buffer = new char[1024];
	    for (int length = 0; (length = reader.read(buffer)) > 0;) {
	        value.append(buffer, 0, length);
	    }
	    return value.toString();
	}
}
