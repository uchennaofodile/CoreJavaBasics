import java.util.function.*;
public class CheckNumber {

	Predicate<Integer> isOdd = (n) -> (!(n%2==0));

	Predicate<Integer> isEven = (n) -> n%2==0 ;
		
	Predicate<Integer> isPrime = (n)->{
		// Corner case
		if (n <= 1)
		{ return false;}

		// Check from 2 to n-1
		for (int i = 2; i < n; i++){
		if (n % i == 0){
			return false;}
		}

		return true;
	};

	Predicate<Integer> isPalindrome = (n) ->{
		StringBuilder strN = new StringBuilder(n+"");
	
		String myString = strN.toString();
	
		StringBuilder reversed = new StringBuilder(strN.reverse());
		String secondString = reversed.toString();
		
		if(myString.equals(secondString)) {
			System.out.println(myString +":"+ secondString);
			return true;
		}
		else {
			System.out.println(myString +":"+ secondString);
			return false;
		}
	};

}
