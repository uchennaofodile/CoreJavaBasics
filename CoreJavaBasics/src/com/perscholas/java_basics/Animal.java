package com.perscholas.java_basics;

class Animal {
private String name;
private boolean isVertabrate;
private boolean canWalk;
private boolean canFly;

public Animal(String name, boolean isVertabrate, boolean canWalk, boolean canFly) {
	this.name = name;
	this.isVertabrate = isVertabrate;
	this.canWalk = canWalk;
	this.canFly = canFly;
	
}

public Animal() {
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public boolean isVertabrate() {
	return isVertabrate;
}

public void setVertabrate(boolean isVertabrate) {
	this.isVertabrate = isVertabrate;
}

public boolean isCanWalk() {
	return canWalk;
}

public void setCanWalk(boolean canWalk) {
	this.canWalk = canWalk;
}

public boolean isCanFly() {
	return canFly;
}

public void setCanFly(boolean canFly) {
	this.canFly = canFly;
}

public void makeNoise(String noise ) {
	System.out.println(noise); 
}


}
