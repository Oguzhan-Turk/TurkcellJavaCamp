package com.instagram.models.account;

import com.instagram.models.share.Content;

public abstract class Account {

	private int id;
	private String userName;
	private String eMail;
	private String phoneNumber;
	private short password;
	private String profilePicture;
	private Account[] followers;
	private Account[] followings;
	private Content[] sharedPosts;
	private Content[] savedPosts;
	private Content[] likedPosts;

	public Account(int id, String userName, String eMail, String phoneNumber, short password, String profilePicture) {
		super();
		this.id = id;
		this.userName = userName;
		this.eMail = eMail;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.profilePicture = profilePicture;
	}

//
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public short getPassword() {
		return password;
	}

	public void setPassword(short password) {
		this.password = password;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public Account[] getFollowers() {
		return followers;
	}

	public void setFollowers(Account[] followers) {
		this.followers = followers;
	}

	public Account[] getFollowings() {
		return followings;
	}

	public void setFollowings(Account[] followings) {
		this.followings = followings;
	}

	public Content[] getSharedPosts() {
		return sharedPosts;
	}

	public void setSharedPosts(Content[] sharedPosts) {
		this.sharedPosts = sharedPosts;
	}

	public Content[] getSavedPosts() {
		return savedPosts;
	}

	public void setSavedPosts(Content[] savedPosts) {
		this.savedPosts = savedPosts;
	}

	public Content[] getLikedPosts() {
		return likedPosts;
	}

	public void setLikedPosts(Content[] likedPosts) {
		this.likedPosts = likedPosts;
	}

}
