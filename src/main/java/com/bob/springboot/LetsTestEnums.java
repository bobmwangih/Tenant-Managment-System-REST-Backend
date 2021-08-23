package com.bob.springboot;

public class LetsTestEnums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		for (TestEnums enums : TestEnums.values()) {
			System.out.println(enums.getCar1()+"   ");
			System.out.println(enums.getCar2()+"   ");
			System.out.println(enums.getCar3()+"   ");
		}
	}

}
