package com.perscholas.java_basics;

public class FireMonster extends Monster{
	
	public FireMonster(String name) {
		super(name);
	}

	public FireMonster() {
		super();
	}

	@Override
	public String attack() {
		String attack = "Attack with fire!";
		return attack;
	}
	
}
