package edu.msg.jthr.backend.service.bean;

import java.util.List;

import javax.ejb.DependsOn;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import edu.msg.jthr.backend.model.Interview;
import edu.msg.jthr.backend.repository.InterviewRepository;
import edu.msg.jthr.backend.service.InterviewService;

@Stateless(name = "InterviewService", mappedName = "ejb/InterviewService")
@DependsOn({ "InterviewRepository" })
public class InterviewServiceBean implements InterviewService {
	@EJB
	private InterviewRepository repository;

	@Override
	public Interview getInterviewById(Long id) {
		return repository.getById(id);
	}

	@Override
	public List<Interview> getAllInterviews() {
		return repository.getAll();
	}

}
