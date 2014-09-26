package edu.msg.jthr.backend.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractModel {
	@Column
	private String uuid;

	public AbstractModel() {
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getUuid() {
		if (uuid == null) {
			uuid = UUID.randomUUID().toString();
		}
		return uuid;
	}

	@Override
	public boolean equals(final Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof AbstractModel))
			return false;
		AbstractModel am = (AbstractModel) obj;
		return this.getUuid().equals(am.getUuid());
	}

	@Override
	public int hashCode() {
		return getUuid().hashCode();
	}
}
