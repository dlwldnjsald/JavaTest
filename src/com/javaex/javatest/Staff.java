package com.javaex.javatest;

public class Staff extends User {

	
	private int salary;
	
	
	public Staff(String id, String pw, String name, int salary) {
		super(id,pw,name);
		this.salary = salary;
		
		System.out.println("아이디:" + id + "비번:" + pw + "이름:" + name + "월급:" + salary);
	}
	
	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}



	
	@Override
	public String toString() {
		return "월급:" + salary ;
	}

	@Override
	public String showInfo() {
		return "월급:" + salary ;
	}

}