package edu.msg.jthr.backend.service;

import java.util.List;

import javax.ejb.Local;

import edu.msg.jthr.backend.model.Interview;

@Local
public interface InterviewService {

	void addInterview(Interview interview);
	
	Interview getInterviewById(Long id);

	List<Interview> getAllInterviews();
}
