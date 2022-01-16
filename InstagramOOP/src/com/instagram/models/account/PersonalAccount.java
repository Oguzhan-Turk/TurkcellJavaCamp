package com.instagram.models.account;

public class PersonalAccount extends Account {

	private String name;
	private String surname;
	private String gender;
	private String birthday;
	private Account[] closeFriends;

	public PersonalAccount(int id, String userName, String eMail, String phoneNumber, short password,
			String profilePicture, String name, String surname, String gender, String birthday) {
		super(id, userName, eMail, phoneNumber, password, profilePicture);
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Account[] getCloseFriends() {
		return closeFriends;
	}

	public void setCloseFriends(Account[] closeFriends) {
		this.closeFriends = closeFriends;
	}

}
