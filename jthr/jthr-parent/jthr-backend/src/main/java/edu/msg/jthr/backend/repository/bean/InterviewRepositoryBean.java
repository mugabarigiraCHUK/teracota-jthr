package edu.msg.jthr.backend.repository.bean;

import edu.msg.jthr.backend.model.Interview;
import edu.msg.jthr.backend.repository.InterviewRepository;

public class InterviewRepositoryBean extends
		BaseRepositoryBean<Interview, Long> implements InterviewRepository {

	public InterviewRepositoryBean() {
		super(Interview.class);
	}

}
