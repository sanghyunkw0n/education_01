package com.sinc.human;

public class Student extends Human {

	private int number;
	private String major;

	public Student() {
		super();
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Student(String name, int age, int height, int weight, int number, String major) {
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}

	public String printInformation() {

		return super.printInformation() + "\t" + this.getNumber() + "\t" + this.getMajor();

	}

}
