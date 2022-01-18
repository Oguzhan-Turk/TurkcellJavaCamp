package com.oguzhanturk.entity;

public class Student {
	private int id;
	private int identityNumber;
	private String name;
	private String surname;

	public Student() {

	}

	public Student(int id, int identityNumber, String name, String surname) {
		super();
		this.id = id;
		this.identityNumber = identityNumber;
		this.name = name;
		this.surname = surname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(int identityNumber) {
		this.identityNumber = identityNumber;
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
}
