package com.perscholas.java_basics;
import java.util.*;
public class LoopsPractice {

	public static void main(String[] args) {
		System.out.println("----------1----------");
		 //Multiplication
	        int product;
	        
	        for (int i=1; i<13; i++){
	            for(int j=1; j<13; j++){
	                product = i*j;
	                System.out.print(product + " ");
	              
	            }
	        System.out.println();
	        }
	    	System.out.println("----------2----------");
	 //   GCD
	  Scanner input = new Scanner(System.in);

	    int n1;
	    int n2;
	System.out.println("Enter a positive integer: ");
	    n1 = input.nextInt();
	System.out.println("Enter another positive integer: ");
	    n2 = input.nextInt();

	    while(n1!=n2){
	      if(n1>n2){
	        n1 -=n2;
	      } else{
	        n2-=n1;
	      }
	    }
	    System.out.println("GCD: " + n1);

	System.out.println("----------3----------");
			double tuition=10000;
			int year=0;
			while(tuition<=20000) {
				tuition=tuition*1.07;
				year+=1;
	      System.out.printf("The tuition after year %d is %.2f%n", year, tuition);
	      if(tuition>=20000){break;}
			}
	    System.out.println("-----------------------------------------");
			System.out.println("The tuition will be doubled in: " +  year+ " years.");


	}

}
