package com.instagram.models.share;

import java.time.LocalDateTime;

import com.instagram.models.account.Account;

public class Post extends Content {

	private String description;
	private Account[] likes;
	private String[] comments;
	
	public Post(int id, Account postOwner, String[] content, String profilePicture, LocalDateTime dateOfPosting, String description) {
		super(id, postOwner, content, profilePicture, dateOfPosting);
		this.description = description;
	}
	
	
}
