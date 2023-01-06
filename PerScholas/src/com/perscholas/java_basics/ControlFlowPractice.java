package com.perscholas.java_basics;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ControlFlowPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.
		//int x = 14;
		//if(x<10) System.out.print("Less than 10");
		//	

		//2.
		//	x=222;
		//		if(x<10) 
		//			System.out.print("Less than 10");
		//		else 
		//			System.out.print("Greater than 10");

		//3.
		//		if(x<10) 
		//			System.out.println("Less than 10");
		//		else if(x>10 && x<20 )
		//			System.out.println("Between 10 and 20");
		//		else if(x>=20)
		//			System.out.println("Greater than or equal to 20");
		//4.
		//		if(x<10 || x>20) 
		//			System.out.println("Out of range");
		//		else if(x>=10 && x<=20 )
		//			System.out.println("Between 10 and 20");

		//5.
		//Scanner input = new Scanner(System.in);
		//		System.out.print("Enter your grade: ");
		//		input.close();
		//		int score = input.nextInt();
		//		if(score < 0 || score > 100) 
		//			System.out.println("Score out of range");
		//		else if(score>=90 && score<=100 )
		//			System.out.println("A");
		//		else if(score>=80 && score<=89)
		//			System.out.println("B");
		//		else if(score>=70 && score<=79 )
		//			System.out.println("C");
		//		else if (score>=60 && score<=69)
		//			System.out.println("D");
		//		else if (score<60)
		//			System.out.println("F");

		//.6
		//		x = 6;
		//				switch(x) {
		//			case 1: System.out.println("Monday"); break;
		//			case 2: System.out.println("Tuesday"); break;
		//			case 3: System.out.println("Wednesday"); break;
		//			case 4: System.out.println("Thursday"); break;
		//			case 5: System.out.println("Friday"); break;
		//			case 6: System.out.println("Saturday"); break;
		//			case 7: System.out.println("Sunday"); break;
		//			default: System.out.println("Out of range");
		//				}



		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your income: ");
		int income = input.nextInt();
		System.out.print("Please enter your filing status: ");
		input.nextLine();
		String filingStatus = 	input.nextLine().trim();
		input.close();
		DecimalFormat decFormat = new DecimalFormat("#%");

		if(filingStatus.equalsIgnoreCase ("Single") ){
			if(income<=8530 ) System.out.println(decFormat.format(0.10));
			if(income>=8351 && income<=33950) System.out.println(decFormat.format(0.15));
			if(income>=33951 && income<=82250) System.out.println(decFormat.format(0.25));
			if(income>=82251 && income<=171550) System.out.println(decFormat.format(0.28));
			if(income>=171551 && income<=372950) System.out.println(decFormat.format(0.33));
			if(income>=372951) System.out.println(decFormat.format(0.35));
		}
		else if(filingStatus.equalsIgnoreCase( "Married Filing Jointly" )|| filingStatus.equalsIgnoreCase("Qualifying Widow") || filingStatus.equalsIgnoreCase("Qualifying Widower" )) {
			if(income<=16700 ) System.out.println(decFormat.format(0.10));
			if(income>=16701 && income<=67900) System.out.println(decFormat.format(0.15));
			if(income>=67901 && income<=137050) System.out.println(decFormat.format(0.25));
			if(income>=137051 && income<=208850) System.out.println(decFormat.format(0.28));
			if(income>=208851 && income<=372950) System.out.println(decFormat.format(0.33));
			if(income>=372951) System.out.println(decFormat.format(0.35));
		}
		else if(filingStatus .equalsIgnoreCase( "Married Filing Separately" )) {
			if(income<=8530 ) System.out.println(decFormat.format(0.10));
			if(income>=8351 && income<=33950) System.out.println(decFormat.format(0.15));
			if(income>=33951 && income<=68525) System.out.println(decFormat.format(0.25));
			if(income>=68526 && income<=104425) System.out.println(decFormat.format(0.28));
			if(income>=104426 && income<=186475) System.out.println(decFormat.format(0.33));
			if(income>=186476) System.out.println("35%");
		}
		else if(filingStatus.equalsIgnoreCase("Head of Household" )) {
			if(income<=11950 ) System.out.println(decFormat.format(0.10));
			if(income>=11951 && income<=45500) System.out.println(decFormat.format(0.15));
			if(income>=45501 && income<=117450) System.out.println(decFormat.format(0.25));
			if(income>=117451 && income<=190200) System.out.println(decFormat.format(0.28));;
			if(income>=190201 && income<=372950) System.out.println(decFormat.format(0.33));
			if(income>=372951) System.out.println(decFormat.format(0.35));
		}


	}

}
