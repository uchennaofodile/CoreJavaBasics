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
		
		System.out.println(myCalc.toString());
		
		//----------------Double----------------
		System.out.println("//----------------Double----------------//");
		MyCalculator<Double>myDoubleCalc = new MyCalculator<>(myDouble, mySecondDouble);
		
		System.out.println(myDoubleCalc.toString());
		
		//----------------Short----------------
		System.out.println("//----------------Short----------------//");
		MyCalculator <Short>myShortCalc = new MyCalculator<>(myShort, mySecondShort);
		
		System.out.println(myShortCalc.toString());
		
		//----------------Float----------------
		System.out.println("//----------------Float----------------//");
		MyCalculator<Float> myFloatCalc = new MyCalculator<>(myFloat, mySecondFloat);
		
		System.out.println(myFloatCalc.toString());
		
		mySecondFloat = 0.0f;
		myFloatCalc.setNum2(mySecondFloat);
		System.out.println();
		System.out.println(myFloatCalc.toString());


	}

}
