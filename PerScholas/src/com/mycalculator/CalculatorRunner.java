package com.mycalculator;

public class CalculatorRunner {

	public static void main(String[] args) {
		Integer myInt = 5;
		Integer mySecondInt = 8;

		Double myDouble = 9.0;
		Double mySecondDouble = 3.0;

		Short myShort = 12;
		Short mySecondShort = 4;

		Float myFloat = 0.4f;
		Float mySecondFloat = 0.8f;

		//----------------Integer----------------
		System.out.println("//----------------Integer----------------//");
		MyCalculator <Integer>myCalc = new MyCalculator<>(myInt, mySecondInt);
		Number addResult = myCalc.add();
		System.out.println("Sum: "+ addResult);

		Number subResult = myCalc.subtract();
		System.out.println("Difference: "+subResult);

		Number mulResult = myCalc.multiply();
		System.out.println("Product: "+mulResult);

		Number divResult = myCalc.divide();
		System.out.println("Quotient: "+ divResult+"\n");
		
		//----------------Double----------------
		System.out.println("//----------------Double----------------//");
		MyCalculator<Double>myDoubleCalc = new MyCalculator<>(myDouble, mySecondDouble);

		addResult = myDoubleCalc.add();
		System.out.println("Sum: "+ addResult);

		subResult = myDoubleCalc.subtract();
		System.out.println("Difference: "+subResult);

		mulResult = myDoubleCalc.multiply();
		System.out.println("Product: "+mulResult);

		divResult = myDoubleCalc.divide();
		System.out.println("Quotient: "+ divResult+"\n");
		
		//----------------Short----------------
		System.out.println("//----------------Short----------------//");
		MyCalculator <Short>myShortCalc = new MyCalculator<>(myShort, mySecondShort);

		addResult = myShortCalc.add();
		System.out.println("Sum: "+ addResult);

		subResult = myShortCalc.subtract();
		System.out.println("Difference: "+subResult);

		mulResult = myShortCalc.multiply();
		System.out.println("Product: "+mulResult);

		divResult = myShortCalc.divide();
		System.out.println("Quotient: "+ divResult+"\n");
		
		//----------------Float----------------
		System.out.println("//----------------Float----------------//");
		MyCalculator<Float> myFloatCalc = new MyCalculator<>(myFloat, mySecondFloat);
		addResult = myFloatCalc.add();
		System.out.println("Sum: "+ addResult);

		subResult = myFloatCalc.subtract();
		System.out.println("Difference: "+subResult);

		mulResult = myFloatCalc.multiply();
		System.out.println("Product: "+mulResult);

		divResult = myFloatCalc.divide();
		System.out.println("Quotient: "+ divResult);
		
		mySecondFloat = 0.0f;
		myFloatCalc.setNum2(mySecondFloat);
		divResult = myFloatCalc.divide();
		System.out.println("Quotient: "+ divResult);


	}

}
