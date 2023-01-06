package com.perscholas.java_basics;

public class TestMonster {

	public static void main(String[] args) {
//	Monster m1 = new FireMonster("Charmander");//upcast
//	Monster m2 = new WaterMonster("Squirttle");//upcast
//	Monster m3 = new StoneMonster("Onyx");//upcast
//	
//	System.out.println(m1.attack());
//	System.out.println(m2.attack());
//	System.out.println(m3.attack());
//	
//	m1 = new StoneMonster("Geodude");//upcast
//	System.out.println("Critical Hit! Down goes Charmander! Sending out " + m1.getName());
//	
//	System.out.println(m1.attack());
//	
//	Monster m4 = new Monster("Magikarp");
//	System.out.println(m4.attack());

		Monster m1 = new StoneMonster();
		
		m1.setName("onyx");
		System.out.println(m1.getName());
		
	}

}
