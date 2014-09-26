package edu.msg.jthr.backend.repository.bean;

import java.util.List;

import javax.ejb.Stateless;

import edu.msg.jthr.backend.model.Position;
import edu.msg.jthr.backend.model.User;
import edu.msg.jthr.backend.repository.PositionRepository;

@Stateless (name="UserRepository", mappedName="ejb/UserRepository")
public class PositionRepositoryBean extends BaseRepositoryBean<Position, Long> implements PositionRepository {

	public PositionRepositoryBean(Class<Position> clazz) {
		super(clazz);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<User> getPositionbyFilter(String pattern) {
		// TODO Auto-generated method stub
		return null;
	}

}
