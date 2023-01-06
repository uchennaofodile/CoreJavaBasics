package com.perscholas.java_basics;

class Tiger extends Animal {

	private boolean isEndangered;
	
	
	Tiger(String name, boolean isVertabrate, boolean canWalk, boolean canFly, boolean isEndangered){
		super(name, isVertabrate, canWalk, canFly);
		this.isEndangered = isEndangered;
	}
	
	public Tiger() {
		super();
		//isEndangered auto set to false
	}
	
	public boolean getIsEndangered() {
		return this.isEndangered;
	}
	
	public void setIsEndangered(boolean isEndangered) {
		this.isEndangered = isEndangered;
	}

	@Override
	public void makeNoise(String noise) {
		System.out.println(noise);
	}
	
}
