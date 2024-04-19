package com.javaex.javatest;

import java.util.ArrayList;

import java.util.List;

public class UserApp {

	public static void main(String[] args) {
		
		ArrayList<User> lst = new ArrayList<>();		
		
		
		Staff a = new Staff("master", "m7788", "운영자", 3500000);
		Customer b = new Customer("jung-ws", "j1357913579", "정우성", 10000);
		Customer c = new Customer("LeeHR", "a123!!", "이효리",2500);
		Customer d = new Customer("ms-park", "y2345", "박명수", 1200);
		
		
		lst.add(a);
		lst.add(b);
		lst.add(c);
		lst.add(d);
		
		
//		for(int i = 1; i < lst.size(); i++) {
//			System.out.println(lst.get(i));
//			}
//		
		System.out.println();
		System.out.println("--------------------회원+운영자 전체리스트------------------");
		
		ArrayList<String> userList = new ArrayList<>();

        // 정보 추가
        userList.add("아이디:master, 이름:운영자, 월급:3500000");
        userList.add("아이디:jung-ws, 이름:정우성, 포인트:10000");
        userList.add("아이디:LeeHR, 이름:이효리, 포인트:2500");
        userList.add("아이디:ms-park, 이름:박명수, 포인트:1200");

        // ArrayList 출력
        System.out.println("회원 정보:");
        for (String userInfo : userList) {
            System.out.println(userInfo);
        }
		
		

	}

}
