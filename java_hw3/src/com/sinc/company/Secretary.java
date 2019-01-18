package com.sinc.company;

public class Secretary extends Employee {

	public Secretary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double tax() {

		return getSalary() * 0.1;
	}

	@Override
	public void incentive(int pay) {
		
//		getSalary()*1.2;

	}

}
