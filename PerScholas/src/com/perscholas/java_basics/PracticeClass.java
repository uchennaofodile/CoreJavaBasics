/**
 * 
 */
package com.perscholas.java_basics;

/**
 * @author Uchenna Ofodile
 *
 */
public class PracticeClass {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		
		
		
		//Declaration
		int intNum1, intNum2;
		double doubleNum1, doubleNum2;
		int intSum;
		double doubleSum;
		
		//Simple Addition
		intNum1 =3;
		intNum2 =4;
		doubleNum1 =1000;
		doubleNum2 = 2000;
		
		intSum = intNum1 + intNum2;
		doubleSum = doubleNum1 + doubleNum2;
		
		System.out.println("intSum: " + intSum);
		System.out.println("doubleSum: " + doubleSum);
		
		//Int + Double
		int num;
		double num2;
		double sum;
		num = 3;
		num2 = 4;
		
		sum = num + num2;
		
		System.out.println("sum: " + sum);
		
		//Divides larger number by smaller number
		double dividend; //changed from int to double
		int divisor;
		double quotient;//changed from int to double
		
		dividend = 10;
		divisor = 2;
		
		quotient = dividend/divisor;
		
		System.out.println("Quotient: " + quotient);
		
		//dividend = 5.55; Change to double
		
		dividend = 5.55;
		
		quotient = dividend/divisor;
		 
		
		System.out.println("Quotient: " + quotient);
		
		//Divides larger number by smaller number
		double number1; //changed from int to double
		double number2;
		double divided;//changed from int to double
				
		number1 = 10.67;
		number2 = 2.32;
				
		divided = number1/number2;
				
		System.out.println("Divided: " + divided);
		System.out.println("Divided Int Cast: " + (int)divided);
		
		
		//x & y
		int x = 5;
		int y = 6;

		int q = y/x;
		
		System.out.println("q: "+q);
		
		double myDouble = y;
		
		q = (int)myDouble;
		
		System.out.println("q is downcasted: "+ q);
		
		//CONST
		
		final int NEW_CONST = 5;
		
		int a =5;
		System.out.println("CONST Operation: " + a*NEW_CONST);
		
		
		//Coffee Shop
		double greenTea =5.99;
		double cafe = 7.99;
		double icedCoffee = 10.99;
		
		//Tax
		final double SALES_TAX = 1.65;
		
		//Order
		double subTotal;
		double totalSale;
		double tax;
		
		subTotal = 3*greenTea + 4*cafe + 2*icedCoffee;
		tax = subTotal * SALES_TAX;
		
		totalSale = tax + subTotal;
		
		double roundedTotalSale = Math.round(totalSale *100.0)/100.0;
		
		System.out.println("Your total will be: $" + roundedTotalSale);
		
		
		
		

	}

}
