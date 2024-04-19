package com.javaex.javatest;

public class Customer extends User {

	
	private int point;
	
	
	public Customer (String id, String pw, String name,int point) {
		super(id,pw,name);
		this.point = point;
		
		System.out.println("아이디:" + id + "이름:" + pw + "이름:" + name + "포인트:" + point);
	
	}
	
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}


	
	@Override
	public String toString() {
		return  "포인트:" + point;
	}

	@Override
	public String showInfo() {
		return "포인트:" + point;
	}
	
}