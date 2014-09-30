package edu.msg.jthr.backend.service.bean;

import java.util.List;

import javax.ejb.DependsOn;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import edu.msg.jthr.backend.model.Comment;
import edu.msg.jthr.backend.model.Interview;
import edu.msg.jthr.backend.model.User;
import edu.msg.jthr.backend.repository.CommentRepository;
import edu.msg.jthr.backend.repository.InterviewRepository;
import edu.msg.jthr.backend.service.InterviewService;

@Stateless(name = "InterviewService", mappedName = "ejb/InterviewService")
@DependsOn({ "InterviewRepository", "CommentRepository" })
public class InterviewServiceBean implements InterviewService {
	@EJB
	private InterviewRepository repository;
	@EJB
	private CommentRepository commentRepository;

	@Override
	public Interview getInterviewById(Long id) {
		return repository.getById(id);
	}

	@Override
	public List<Interview> getAllInterviews() {
		return repository.getAll();
	}

	@Override
	public void addInterview(Interview interview) {
		for (User u: interview.getInterviewers()){
			Comment c = new Comment();
			c.setUser(u);
			c.setText("");
			Comment c1 = commentRepository.save(c);
			interview.getComments().add(c1);			
		}
		repository.save(interview);	
	}
	
	@Override
	public void editInterviewComment(Comment comment, Long positionId) {
		commentRepository.merge(comment);
	}

}
