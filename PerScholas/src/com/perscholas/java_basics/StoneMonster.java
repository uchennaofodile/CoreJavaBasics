package com.perscholas.java_basics;

public class StoneMonster  extends Monster{
	
	public StoneMonster(String name) {
		super(name);
	}	
	
	public StoneMonster() {
		super();
	}

@Override
	public String attack() {
		String attack = "Attack with stone!";
		return attack;
	}
}
