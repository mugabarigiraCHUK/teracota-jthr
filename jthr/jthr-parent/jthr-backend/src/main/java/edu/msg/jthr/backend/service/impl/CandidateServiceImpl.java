package edu.msg.jthr.backend.service.impl;

import java.util.List;

import javax.ejb.EJB;

import edu.msg.jthr.backend.model.Candidate;
import edu.msg.jthr.backend.repository.CandidateDAO;
import edu.msg.jthr.backend.service.CandidateService;

public class CandidateServiceImpl implements CandidateService {
	@EJB 
	private CandidateDAO candidateDAO;
	
	@Override
	public void add(Candidate user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void edit(Candidate user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Candidate getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Candidate> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
