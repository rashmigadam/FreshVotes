package com.freshvotes.domain;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity

public class Votes {

	private Boolean upvote;

	private VoteID pk;

	@EmbeddedId
	public VoteID getPk() {
		return pk;
	}

	public void setPk(VoteID pk) {
		this.pk = pk;
	}

	public Boolean getUpvote() {
		return upvote;
	}

	public void setUpvote(Boolean upvote) {
		this.upvote = upvote;
	}

}
