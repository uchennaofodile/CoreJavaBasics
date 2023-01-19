package com.mycalculator;

class MyCalculator<N extends Number> {
	private N num1;
	private N num2;
	Number result;

	//---------Constructors---------
	public MyCalculator(N num1, N num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public MyCalculator() {}

	//--------Getters & Setters---------

	public N getNum1(){
		return num1;
	}

	public void setNum1(N num1) {
		this.num1 = num1;
	}

	public N getNum2() {
		return num2;
	}

	public void setNum2(N num2) {
		this.num2 = num2;
	}

	//--------Methods---------
	public Number add() {

		if(num1 instanceof Integer && num2 instanceof Integer) {
			result = num1.intValue()+num2.intValue();
		}

		else	if(num1 instanceof Double && num2 instanceof Double) {
			result = num1.doubleValue()+num2.doubleValue();
		}

		else if(num1 instanceof Short && num2 instanceof Short) {
			result = num1.shortValue()+num2.shortValue();
		}

		else if(num1 instanceof Float && num2 instanceof Float) {
			result = num1.floatValue()+num2.floatValue();
		}

		return result;

	}

	Number subtract() {
		if(num1 instanceof Integer && num2 instanceof Integer) {
			result=	num1.intValue()-num2.intValue();
		}
		else if(num1 instanceof Double && num2 instanceof Double) {
			result = num1.doubleValue()-num2.doubleValue();
		}
		else if(num1 instanceof Short && num2 instanceof Short) {
			result = num1.shortValue()-num2.shortValue();
		}
		else if(num1 instanceof Float && num2 instanceof Float) {
			result = num1.floatValue()+num2.floatValue();
		}
		return result;
	}
	Number multiply() {
		if(num1 instanceof Integer && num2 instanceof Integer) {
			result = num1.intValue()*num2.intValue();
		}
		else if(num1 instanceof Double && num2 instanceof Double) {
			result = num1.doubleValue()*num2.doubleValue();
		}
		else if(num1 instanceof Short && num2 instanceof Short) {
			result = num1.shortValue()*num2.shortValue();
		}
		else if(num1 instanceof Float && num2 instanceof Float) {
			result = num1.floatValue()*num2.floatValue();
		}
		return result;

	}

	Number divide() {

		if(num1 instanceof Integer && num2 instanceof Integer) {
			if (num2.intValue() ==0) {
				return 0;
			}
			result = num1.intValue()/num2.intValue();
		}
		if(num1 instanceof Double && num2 instanceof Double) {
			if (num2.doubleValue() ==0) {
				return 0;
			}
			result = num1.doubleValue()/num2.doubleValue();
		}
		if(num1 instanceof Float && num2 instanceof Float) {
			if (num2.floatValue() ==0.0f) {
				return 0;
			}
			result = num1.floatValue()/num2.floatValue();
		}
		if(num1 instanceof Short && num2 instanceof Short) {
			if (num2.shortValue() ==0) {
				return 0;
			}
			result = num1.shortValue()/num2.shortValue();
		}
		return result;		



	}
	
	public String toString() {
		String output = "Number 1: " + num1+ " | Number 2: " + num2+ "\n";
		output+= "Addition: " + add()+ "\n";
		output+= "Subtraction: " + subtract()+ "\n";
		output+= "Mulitplicaton: " + multiply()+ "\n";
		output+= "Division: " + divide()+ "\n";
		return output;
	}
	

}
