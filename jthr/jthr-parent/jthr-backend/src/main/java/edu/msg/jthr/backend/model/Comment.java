package edu.msg.jthr.backend.model;

import edu.msg.jthr.backend.model.BaseEntity;
import edu.msg.jthr.backend.model.User;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

@Entity
public class Comment extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Column
	private String text;
	
	@Column
	private User user;
	

	public Comment() {
		super();
	}   
	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}   
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}
   
}
