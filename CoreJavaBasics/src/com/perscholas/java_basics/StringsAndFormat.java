//package com.perscholas.java_basics;

//comment out package when running in vs code
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringJoiner;

public class StringsAndFormat {

  public static void main(String[] args) {
    // System.out.println("Welcome to Online IDE!! Happy Coding :)");
    int intValue;
    double doubleValue;
    String stringValue;
    Scanner input = new Scanner(System.in);
    //System.out.print("Enter a string: ");
    // stringValue = input.nextLine();
    // //intValue = Integer.parseInt(stringValue);
    // intValue = Integer.valueOf(stringValue);
    // System.out.println("The converted string is: "+intValue+"\n");
    // System.out.print("Enter an integer: ");
    // intValue = input.nextInt();
    // doubleValue = intValue; //upgraded
    // short shortValue =  (short)doubleValue;//downgraded
    // stringValue = Short.toString(shortValue);
    // System.out.println("The stringValue is: " + stringValue);

    //---------------------------------------

    //-----StringBuffer--------
    //-----insert-------
    //     StringBuffer s = new StringBuffer("Java");
    //     int sLength = s.length();
    //     int sCapacity = s.capacity();
    //     System.out.println("sLength: "+ sLength);
    //     System.out.println("sCapacity: " + sCapacity);
    //     s.insert(3, "language");//inserts at a specified index,
    //     //must be within range of insertee, no deletion
    //     System.out.println(s);

    //     s.append("Python");//adds to the end
    //     System.out.println("s: " + s);

    //     StringBuffer firstName = new StringBuffer("Uchenna ");
    //     StringBuffer lastName = new StringBuffer("Ofodile");
    //     StringBuffer fullName = new StringBuffer();
    //     fullName = firstName.append(lastName);
    //     System.out.println(fullName);

    //   //---reverse----
    //     fullName.reverse();
    //     System.out.println(fullName);

    //     //---replace----
    //     fullName.replace(1,4, "Hello");//removes indices inclusive and deletes them
    //     System.out.println(fullName);

    //     System.out.println(fullName.indexOf("a"));

    //     fullName.insert(3,":");
    //     fullName.insert(5,":");
    //     fullName.insert(9,":");
    //     System.out.println(fullName);
    //     String myString = fullName.toString();
    //     String[] stringArr = myString.split(":",3);
    //     System.out.println(Arrays.toString(stringArr));

    //StringJoiner
    // StringJoiner joinString = new StringJoiner(",");
    // joinString.add("Orlando, FL");
    // joinString.add("New York, NY");

    // System.out.println(joinString);

    // StringJoiner joinString2 = new StringJoiner("-", "<", "]");
    // joinString2.add("Tiger");
    // joinString2.add("Chicken");
    // System.out.println(joinString2);

    // StringJoiner joinString3 = new StringJoiner("/", "(", "}");
    // joinString3.add("Zebra");
    // joinString3.add("Camel");

    // joinString2.merge(joinString3);//keeps delimiters from joinString2
    // System.out.println(joinString2);

    //----format-----
    // long n = 461012;
    // System.out.format("%d%n", n);
    // System.out.format("%07d%n",n);//zero adds a leading zero
    // //7 specifies how long the result must be, must be greater than length to add a zero
    // System.out.format("%+8d%n",n);//leading space and + sign , 8 characters long
    // System.out.format("%,d%n", n);//separates with comma for nums > 1000
    // System.out.format("%+,8d%n%n",n);

    // double pi = Math.PI;
    // System.out.format("%f%n",pi);
    // System.out.format("%.3f%n",pi);//decimal three characters long on floating point nums
    // System.out.format("%10.3f%n",pi);//10 characters long(right aligned) 3 decimal points
    // System.out.format("%-10.3f%n", pi);// - is left justify, default is righ justify
    // //exactly the same as the above but it moves it to left margin

    // Calendar c = Calendar.getInstance();
    // System.out.format("%tB %te %tY%n",c,c,c);// month day year
    // System.out.format("%tl:%tM %tp%n", c,c,c);// time including am or pm, 5 hours ahead
    // System.out.format("%tD%n",c); //two digit date with back slashes current date

    // System.out.printf("Hello %s", "Uchenna");
    // System.out.printf("Hello %s", "Bridget");
    // System.out.printf("Hello %s", "Obi");
    // System.out.printf("Hello %s%n", "Uchenna");
    // System.out.printf("Hello %s%n", "Bridget");
    // System.out.printf("Hello %s%n", "Obi");
    // System.out.println();
    // String data = "Hello World!";
    // System.out.printf("Printing a string: %s\n", data);
    // System.out.printf("Printing a string in uppercase: %S\n", data);
    // int x = 100;
    // System.out.printf("Printing a decimal: %d\n", x);
    // int hours = 100;
    // double days = 100 / 24.0; //used 24.0 to avoid integer division
    // System.out.print("days: ");
    // System.out.printf("%.3f", days);
    //--------------Specifying Width------------
    // %[argument_index$][flags][width][.precision]conversion
    // System.out.printf("%-10.2f%f%n", 18.0, 5.00); //left aligned -
    // System.out.printf("%10.2f%n", 20.0); //right aligned default
    // System.out.printf("%10.3f", 10.2); //no text
    // System.out.printf("%n"); //only %n
    // System.out.printf("%-13.10f%f%n", 3.3, 1.0); //visualizing width
    // System.out.printf("%10.2f%5d%n", 15.7, 3);
    // System.out.printf("%10.2f%d%n", 15.7, 3); //no space before 3
    // System.out.printf("%10.2f", 15.7);
    // System.out.printf("%n%10.2f%n%5d%n", 11.3, 8);
    // System.out.printf("%s is %d years old.%n", "Uchenna", 29);
    // LocalDate ldNow = LocalDate.now();
    // System.out.printf(
    //   "%1$tB %1$td, %1$tY is %2$s's birth day. Let's go and celebrate.%n",
    //   ldNow,
    //   "Uchenna"
    // );

    //String format --> the advantage of is
    //it returns a string that can be used later
    // %c – Character,
    // %d – Integer
    // %s – String
    // %f – Floating number
    // %h – hash code of a value

    // String s = "Per Scholas";
    // float n = 74.47f;

    // String str1 = String.format(
    //   "My company name is %s.",
    //   s
    // ), str2 = String.format("My age is %.8f.", n);
    // System.out.println(str1 + " " + str2);

    // String pattern = "###,###.###";
    // double number = 123456789.123;
    // DecimalFormat numbeFormat = new DecimalFormat(pattern);
    // System.out.println(number);
    // System.out.println(numbeFormat.format(number));

    //money program

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter dollars: ");
    int dollars = scan.nextInt();
    System.out.println("Enter cents: ");
    int cents = scan.nextInt();
    int displayCents = cents;
    scan.close();
    int quarters = 0;
    int dimes = 0;
    int nickels = 0;
    int pennies = 0;
    //solves less than 25
    if (cents >= 25) {
      quarters = cents / 25;
      int remainderQuarters = cents % 25;

      if (remainderQuarters < 5 && remainderQuarters >= 1) {
        pennies = remainderQuarters;
      }
      //
      else if (remainderQuarters >= 5) {
        dimes = remainderQuarters / 10;
        int remainderDimes = remainderQuarters % 10;
        if (remainderDimes < 5 && remainderDimes >= 1) {
          pennies = remainderDimes;
        } else {
          nickels = remainderDimes / 5;
          int nickelsRemainder = remainderDimes % 5;
          pennies = nickelsRemainder;
        }
      }
    } else if (cents < 25) {
      dimes = cents / 10;
      int remainderDimes = cents % 10;
      if (remainderDimes < 5 && remainderDimes >= 1) {
        pennies = remainderDimes;
      } else {
        nickels = remainderDimes / 5;
        pennies = remainderDimes % 5;
      }
    }

    System.out.format(
      "You have %d dollars, and  %d cent(s) and the cent(s) equals %d quarter(s), %d dime(s), %d nickel(s), %d penny(s).",
      dollars,
      displayCents,
      quarters,
      dimes,
      nickels,
      pennies
    );
  }
}
