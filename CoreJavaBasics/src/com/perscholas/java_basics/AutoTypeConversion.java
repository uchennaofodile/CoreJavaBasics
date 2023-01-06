package com.perscholas.java_basics;

import java.util.Arrays;

public class AutoTypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 20;
		double y = 40.5;
		long p  = 30L;
		float q = 10.60f;
		// int z = x+y;
		double z = x+y; 
		System.out.println("Sum of two numbers: " + z);
		
		//Long r = p - q; // // (2) // Error; cannot convert from float to long.
		float r = p-q;
		System.out.println("Substraction of two numbers: "+ r);
		byte b = 42;
	       char c = 'a';
	       short s = 1024;
	       int i = 50000;
	       float f = 5.67f;
	       double d = .1234;
	// Expression:
	       double result = (f * b) + (i / c) - (d * s);
	//Result after all the promotions are done.
	       System.out.println("result = " + result);
	       
	        d = 100.04;
	       // explicit type casting
	       long l = (long)d;
	       i = (int)l;
	       System.out.println("Double value "+d); // fractional part lost.
	       System.out.println("Long value "+l); // fractional part lost.
	       System.out.println("Int value "+i);

	byte t;
	int myR = 257;
	double dou = 323.142;
	System.out.println("Conversion of int to byte.");
	t = (byte) r;
	System.out.println("i = " + myR+ " myR = " + t);
	System.out.println("Conversion of double to int.");

	myR = (int) dou;

	System.out.println("d = " + dou + " myR = " + myR);
	System.out.println("Conversion of double to byte.");

	b = (byte) dou;
	System.out.println("d = " + dou + " myR = " + myR);

String str1 = "Java";
String str2 = "";
System.out.println(str1.length());
System.out.println(str2.length());
System.out.println("Java".length());
System.out.println("Java\n");
System.out.println("Java\n".length());
System.out.println("Learn Java".length());

String s1="";
String s2="hello";
System.out.println(s1.isEmpty());
System.out.println(s2.isEmpty());

String str3 = "      hey      ";
System.out.println(str3+"how are you");
System.out.println(str3.trim()+"how are you");

String string1 = "HELLO HOW Are You?";
String string1lower=string1.toLowerCase();
System.out.println(string1lower);

string1="hello how are you";
String string1upper = string1.toUpperCase();
System.out.println(string1upper);

	str1= "Learn ";	
	str2 = "Java";
	System.out.println(str1.concat(str2)); // "Learn Java"
	
	String s3 = "hello";
	String s4 = "Learners";
	
    //  String s5 = s3.concat(s4); or
	String s5 = s3+s4;
	System.out.print(s5);
	//both of the above statement will give you the same result
	
	String message = "Welcome " + "to " + "Java";
	
	String s11 = "Chapter" + 2; // s11 becomes Chapter2
	
	 s11 = "Supplement" + 'B'; // s11 becomes SupplementB
	
	//split()
	 String vowels = "a::b::c::d:e";
	 String [] result1 = vowels.split("::");
	 //String [] result1 = vowels.split("::",2); //would result in two substrings and only split the first value
	 System.out.println("result = "+ Arrays.toString(result1));
	 
	 //charAt()
	 message = "Welcome to Java";
	 System.out.println("The first character in the message is " + message.charAt(0));
	 
	 //compareTo() - compares letter by letter, would be good to sort a string of letters alphabetically
	 s1 = "hello";
	 s2 = "hello";
	 s3 = "helmo";
	 s4 = "flag";
	 System.out.println(s1.compareTo(s2)); // 0 because both are equal
	 System.out.println(s1.compareTo(s3));//-1 because "l" is only one time lower than "m" <
	 //<0 because lexographically less than the other
	 System.out.println(s1.compareTo(s4)); // 2 because "h" is 2 times greater than "f"
	 //>0 because lexographically greater than the number
	 
	 //substring()
str1 = "java is fun";

System.out.println(str1.substring(0,4));

result = str1.indexOf('s');
System.out.println(result);





//indexOf
str1 = "Java is fun";
result = str1.indexOf('s');//6

str1.lastIndexOf('J');//0

str1.lastIndexOf('a'); //3

str1.lastIndexOf('j');//-1

str1.lastIndexOf("ava");//1

str1.lastIndexOf("java");//-1


//contains()
str1="Learn Java";

str1.contains("Java");//true
str1.contains("Python");//false
str1.contains("");//true

//replace
str1 ="abc cba";

str1.replace('a','z');//replaces all occurences of 'a' is replaced with 'z'

"Lava".replace('L', 'J');//L is replaced with J

"Hello".replace('4',  'J'); //character not in string Output Hello

"aa bb aa zz".replace("aa", "zz"); //zz bb zz zz

"Java".replace("C++", "C");//substring not in string output Java
//Original string is returned if the substring/char is not in the string

//Java String compares
//1. equals() strict comparison of value
//2. ==
//3. compareTo() checks each character and returns a num

//equals() compares the value 
s1 ="PerScholas";
s2="PerScholas";
s3=new String("PerScholas");
s4="Teksystem";
s1.equals(s2);//true
s1.equals(s3);//true
s1.equals(s4);//false
var isEqual = s1==s2;//true 
var isNotEqual = s1==s3;//false because s1 is in pool memory while s3 refers to an instance in nonpool memory



	}

}
