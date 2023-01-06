//package com.perscholas.java_basics;

import java.util.*;

public class ArrayPractice {

  public static void main(String[] args) {
    // int[] myArray = { 1, 2, 3 };
    // for (int value : myArray) {
    //   System.out.println(value);
    // }
    //	    int[] arr = {13,5,7,68,2};
    //	    System.out.println("The middle element is: "+ arr[2]);
    //
    //
    //	    String[] colors = {"red", "green", "blue", "yellow"};
    //	System.out.println(colors.length);
    //	    String[] colors2 = colors.clone();
    //	    System.out.println(Arrays.toString(colors2));
    //
    //	   // 4.
    //	    int[] intArr = {1,2,3,4,5};
    //	    System.out.println("First: "+intArr[0]);
    //	    System.out.println("Last: "+intArr[intArr.length-1]);
    //	    System.out.println("Last: "+intArr[intArr.length]);//Error: indexOutofBounds
    //	    System.out.println("Last: "+intArr[5]);//Error: indexOutofBounds
    //
    //	  //  5.
    //	    intArr = new int[5];
    //	    for(int i =0; i<intArr.length; i++){
    //	      intArr[i] = i;
    //
    //	    }
    //	    System.out.println(Arrays.toString(intArr));
    //	  }
    //
    //	  //6
    //	   intArr = new int[5];
    //	    for(int i = 1; i<=intArr.length; i++){
    //	      intArr[i-1] = i*2;
    //
    //	    }String(intArr));
    //	  }

    //7
    // int[] intArr = new int[5];
    // for(int i =0; i<intArr.length; i++){
    // 	intArr[i]=i;
    // 	if (i==2){continue;}
    // 	else{
    // 		System.out.print(intArr[i] + " " );}
    // }
    // System.out.println();
    // //8
    // String [] str = {"Hello",  "How", "Are", "You","Doing"};
    // String middleStr = str[str.length/2];
    // String firstStr = str[0];
    // str[0] = middleStr;
    // str[str.length/2] = firstStr;

    // //9
    // int[] ascendingIntArr = {4,2,9,13,1};
    // for(int i =0; i<ascendingIntArr.length; i++) {
    // 	for(int j=0; j<ascendingIntArr.length; j++) {
    //compare each element with the next
    /*
				 * get the first element and compare it to the next element
				 * if it is less than the next element
				 *set the current element to the next element
				 *set the next element to the greater number
				 *if it is greater 

				 * 
				 * {     4,            2                     }
				 *       i              j
				 * 
				 * */

    // if(ascendingIntArr[j]>ascendingIntArr[i]) {
    // 	int temp1 = ascendingIntArr[i];//get i
    // 	int temp = ascendingIntArr[j];//get j
    // 	ascendingIntArr[i] = temp; //put j where i is
    // 	ascendingIntArr[j]=temp1; //put i in j

    // 		}

    // 	}

    // }
    // System.out.println(Arrays.toString(ascendingIntArr));
    // System.out.println(ascendingIntArr[0]);
    // System.out.println(ascendingIntArr[ascendingIntArr.length-1]);

    //10
    Integer myInt = 3;
    Double myDouble = 4.5;
    Object[] mixedArray = { myInt, myDouble, "hi", "bye", "why" };
    for (Object object : mixedArray) {
      System.out.print(object + " ");
    }
    System.out.println();
    //11

    // Scanner input = new Scanner(System.in);
    // System.out.println("How many favorite things do you have? ");
    // int numOfFavs = input.nextInt();
    // input.nextLine();
    // String [] favs = new String[numOfFavs];
    // for(int i =0; i<numOfFavs; i++) {
    // 	System.out.print("Enter your thing: ");
    // 	favs[i] = input.nextLine();
    // 	System.out.println();
    // }
    // input.close();
    // System.out.println("Your favorite things are: ");
    // for(String things: favs) {
    // 	System.out.print(things +" ");
    // }

  }
}
