package edu.msg.jthr.backend.repository.bean;

import javax.ejb.Stateless;

import edu.msg.jthr.backend.model.Comment;
import edu.msg.jthr.backend.repository.CommentRepository;

@Stateless(name = "CommentRepository", mappedName = "ejb/CommentRepository")
public class CommentRepositoryBean extends BaseRepositoryBean<Comment, Long> implements CommentRepository {

	public CommentRepositoryBean() {
		super(Comment.class);
	}

}
