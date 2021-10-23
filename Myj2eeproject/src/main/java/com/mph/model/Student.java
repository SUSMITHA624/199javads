package com.mph.model;

public class Student {
	private String name;
	private int stno;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int stno) {
		super();
		this.name = name;
		this.stno = stno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStno() {
		return stno;
	}

	public void setStno(int stno) {
		this.stno = stno;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", stno=" + stno + "]";
	}

}