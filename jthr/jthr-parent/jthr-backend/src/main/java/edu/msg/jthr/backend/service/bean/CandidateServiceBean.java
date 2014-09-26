package edu.msg.jthr.backend.service.bean;

import java.util.List;

import javax.ejb.DependsOn;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import edu.msg.jthr.backend.model.Candidate;
import edu.msg.jthr.backend.repository.CandidateRepository;
import edu.msg.jthr.backend.service.CandidateService;

@Stateless(name = "CandidateService", mappedName = "ejb/CandidateService")
@DependsOn({ "CandidateRepository" })
public class CandidateServiceBean implements CandidateService {

	@EJB
	private CandidateRepository repository;

	@Override
	public void addCandidate(Candidate candidate) {
		repository.save(candidate);

	}

	@Override
	public void editCandidate(Candidate candidate) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCandidate(Candidate candidate) {
		// TODO Auto-generated method stub

	}

	@Override
	public Candidate getCandidateById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Candidate> getAllCandidates() {
		return repository.getAll();
	}
}
