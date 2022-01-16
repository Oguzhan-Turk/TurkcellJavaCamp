package com.instagram.models.share;

import java.time.LocalDateTime;

import com.instagram.models.account.Account;

public class Story extends Content {

	private boolean isForCloseFriends;

	public Story(int id, Account postOwner, String[] content, String profilePicture, LocalDateTime dateOfPosting,
			boolean isForCloseFriends) {
		super(id, postOwner, content, profilePicture, dateOfPosting);
		this.isForCloseFriends = isForCloseFriends;
	}

	public boolean isForCloseFriends() {
		return isForCloseFriends;
	}

	public void setForCloseFriends(boolean isForCloseFriends) {
		this.isForCloseFriends = isForCloseFriends;
	}

}
