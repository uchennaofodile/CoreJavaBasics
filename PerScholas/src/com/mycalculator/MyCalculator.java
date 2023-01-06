package com.mycalculator;

class MyCalculator<N extends Number> {
	N num1;
	N num2;
	Number result;

	//---------Constructors---------
	public MyCalculator(N num1, N num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public MyCalculator() {}

	//---------Methods---------

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

	Number division() {
			
			try {
				if(num1 instanceof Integer && num2 instanceof Integer)
				
				
				
			}
			catch(ArithmeticException e) {
				System.out.println(0);
			}
			
	}

}
