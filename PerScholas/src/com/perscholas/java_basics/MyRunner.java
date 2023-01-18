import java.io.IOException;
import java.util.*;

import com.perscholas.java_basics.Student;
public class MyRunner {
	public static void main(String[] args) throws IOException{
		//	Human HMsg = () ->{
		//		System.out.println("Hello, It's me again, James");
		//	};
		//	HMsg.say();
		//	Human HMsg1 = () -> System.out.println("Hello, It's me again, James");
		//	HMsg1.say();

		//	Human HMsg = st -> System.out.println(st + " It's me Tony");
		//	HMsg.say("Hello | ");
		//	
		//	
		Human HMsg_two = (st) -> System.out.println(st + " It's me Tony");
		HMsg_two.say("Hello | ");

		Human HMsg_three = (st) -> {
			System.out.println(
					st+ " It's me Tony"
					);
		};
		HMsg_three.say("Hello | ");


		//Example 3 - One Parameter and Return Type
		//Option One:
		//n → { return n; }; or  (n) → { return n; }; 

		Human2 obj = (st) -> {
			String a = "Hello Tony ";
			return a + st;
		};

		System.out.println(obj.say("How are you doing?"));


		//Option Two:
		//	n →  expression;
		Human2 obj2 = st -> st +"How are you doing";
		System.out.println(obj2.say("Hello Tony "));


		//Example 4: Lambda expression - Multiple Parameters
		//Option One: ( p, x ) → System.out.println ( p + x )  
		MultipleParameterDemo sObj1 = (st1, st2, st3) -> System.out.println(st1 + st2+ st3);
		sObj1.concatString("hello ", "java ", "students");

		//Option Two: ( p, x ) → { System.out.println ( p + x ); }; 
		MultipleParameterDemo sObj2 = (st1, st2, st3) -> {System.out.println(st1+st2+st3);};
		sObj2.concatString("hello ", "java "  ,"students");

		//Example 5: Lambda expression - Multiple Parameters and a Return Statement
		//Option One: ( p, x ) →{ return statement;  };
		MultipleDemo addObj = (a,b,c) -> {return (a + b + c);};
		double result = addObj.calculator(3,4,5); 
		System.out.println(result);

		//Option Two: ( p, x ) →  statement / expression; 
		MultipleDemo addObj2 = (a,b,c) ->  a+b+c;
		result = addObj.calculator(3,4,5); 
		System.out.println(result);

		//Option Three: ( p, x ) →  (p, x) → { system.out.println(p); return (p+x);};
		//multiple statements
		MultipleDemo addObj3 = (a,b,c) -> {
			double d = a+b;
			double myResult = d + c;
			return myResult;
		};
		
		result = addObj3.calculator(3, 4, 5);
		System.out.println(result);
		
		

		//	NormalClass mObj = new NormalClass();
		//	mObj.hObjone.say();
		//	mObj.hObjTwo.say();
		//	mObj.hObjone.sleep();
		//	mObj.hObjTwo.sleep();
		//	
		//	System.out.println("------------------Calculator Example------------------");
		//	Calculator mCal = new Calculator();
		//	System.out.println("Result abstract method: "+mCal.Fobj.sum(3,5));
		//	System.out.println("Result default method: "+mCal.Fobj.multiply(3,5));
		//	
		//	System.out.println("------------------Compare Example------------------");
		//	MyComparingClass compareObj = new MyComparingClass ();
		//	int resultInteger = compareObj.compareTwoVar.compare(45,32);
		//	System.out.println(resultInteger);
		//	
		//	String resultString = compareObj.stCompare.compare("h", "H");
		//	System.out.println(resultString);
		//	
		MainEntry meObj = new MainEntry();
		//LinkedList<Integer> myIntArray =  meObj.calcObj.addNumsToIntArray();
	//	meObj.calcObj.compute(myIntArray);


		List<String> names = new ArrayList<>();
		names.add("Larry");
		names.add("Tim");
		names.add("John");
		names.forEach(name -> { System.out.println(name);    }     );
		
	MyJoiner <Student>mj = (o1, o2)->{ return o1 + " and " + o2;
	};
	
	MyJoiner<Student> mj2 = (o1,o2)->{
		String and = " and ";
		return o1 + and + o2;
	};
	
	Student student1 = new Student(23, "Uc", 213L);
	Student student2 = new Student(43, "Karen", 213L);
	
	String myStr = mj.concantenate(student1, student2);
	String myStr2 = mj2.concantenate(student1, student2);
	System.out.println(myStr);
	System.out.println(myStr2);
	mj.display(student1, student2);
	
	CheckNumber cn = new CheckNumber();
	boolean isEven = cn.isEven.test(2);
	boolean isOdd = cn.isOdd.test(15);
	boolean isPrime = cn.isPrime.test(37);
	boolean isPalindrome = cn.isPalindrome.test(32982038);
	System.out.println("isEven: "+ isEven );
	System.out.println("isOdd: "+ isOdd );
	System.out.println("isPrime: "+ isPrime );
	System.out.println("isPalindrome: "+ isPalindrome );
	
	}
}
