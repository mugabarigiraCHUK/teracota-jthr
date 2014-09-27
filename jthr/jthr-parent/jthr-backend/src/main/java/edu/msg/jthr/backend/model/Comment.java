package edu.msg.jthr.backend.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;

@Entity
public class Comment extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column
	private String text;

	@JoinColumn
	private User user;

	public Comment() {
		super();
	}

	public Comment(String text) {
		this.text = text;
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

	@Override
	public String toString() {
		return text;
	}

}
