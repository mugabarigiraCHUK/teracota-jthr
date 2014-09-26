package edu.msg.jthr.backend.service;

import java.util.List;

import edu.msg.jthr.backend.model.Interview;

public interface InterviewService {

	Interview getInterviewById(Long id);

	List<Interview> getAllInterviews();
}
