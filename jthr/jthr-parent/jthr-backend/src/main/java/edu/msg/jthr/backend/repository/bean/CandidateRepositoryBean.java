package edu.msg.jthr.backend.repository.bean;

import javax.ejb.Stateless;

import edu.msg.jthr.backend.model.Candidate;
import edu.msg.jthr.backend.repository.CandidateRepository;

@Stateless(name = "CandidateRepository", mappedName = "ejb/CandidateRepository")
public class CandidateRepositoryBean extends
		BaseRepositoryBean<Candidate, Long> implements CandidateRepository {

	public CandidateRepositoryBean() {
		super(Candidate.class);
	}

}
