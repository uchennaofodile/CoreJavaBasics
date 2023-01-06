package com.perscholas.java_basics;

public class Monster {
	private String name;

	public Monster(String name) {
		this.name =name;
	}

	public Monster() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String attack() {
		String attack = "!^_&^$@+%$* I don't know how to attack!";
		return attack;
	}

}
