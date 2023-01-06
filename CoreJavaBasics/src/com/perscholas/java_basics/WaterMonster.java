package com.perscholas.java_basics;

public class WaterMonster extends Monster {
	
	public WaterMonster(String name) {
		super(name);
	}
	
	public WaterMonster() {
		super();
	}

	@Override
	public String attack() {
		String attack = "Attack with water!";
		return attack;
	}
}
