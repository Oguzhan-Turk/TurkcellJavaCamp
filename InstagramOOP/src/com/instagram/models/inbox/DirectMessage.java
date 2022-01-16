package com.instagram.models.inbox;

import com.instagram.models.account.Account;
import com.instagram.models.share.Content;

public class DirectMessage {

	private int id;
	private String[] messages;
	private Content[] posts;
	private Account user;

	public DirectMessage(int id, String[] messages, Content[] posts, Account user) {
		this.id = id;
		this.messages = messages;
		this.posts = posts;
		this.user = user;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMessages(String[] messages) {
		this.messages = messages;
	}

	public void setPosts(Content[] posts) {
		this.posts = posts;
	}

	public void setUser(Account user) {
		this.user = user;
	}

}
