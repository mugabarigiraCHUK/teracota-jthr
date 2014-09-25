package edu.msg.jthr.backend.model;

import java.util.UUID;

import javax.persistence.MappedSuperclass;

public abstract class AbstractModel {
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
		return this.uuid.equals(am.uuid);
	}

	@Override
	public int hashCode() {
		return uuid.hashCode();
	}
}
