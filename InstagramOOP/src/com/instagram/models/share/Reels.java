package com.instagram.models.share;

import java.time.LocalDateTime;

import com.instagram.models.account.Account;

public class Reels extends Content {

	private Account[] views;

	public Reels(int id, Account postOwner, String[] content, String profilePicture, LocalDateTime dateOfPosting) {
		super(id, postOwner, content, profilePicture, dateOfPosting);
	}

	public Account[] getViews() {
		return views;
	}

	public void setViews(Account[] views) {
		this.views = views;
	}

}
