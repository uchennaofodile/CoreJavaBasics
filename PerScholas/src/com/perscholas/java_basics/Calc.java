import java.util.*;
import java.io.IOException.*;

@FunctionalInterface
public interface Calc<T> {
	void compute(LinkedList<T> intArr);


	//default add numbers to LinkedList
	default LinkedList<Integer> addNumsToIntArray () throws NumberFormatException, InputMismatchException {

		Scanner input = new Scanner(System.in);
		LinkedList<Integer> intArr = new LinkedList<>();
		
			System.out.println("Enter operation: ");
			System.out.println("Please use one of the following: +, -, *, or  / ");
			String operation = input.next();
			if (!operation.matches("[+\\-*/]")) {
				throw new InputMismatchException("Invalid operation, please enter a valid operaton, "
						+ "Please use one of the following: +, -, *, or  /");
			}
			int count = 0;
			while(true) {
			    try {
			        System.out.println("Enter the numbers you would like to use and type '=' when complete: ");
			        System.out.println("For 'divide' only two numbers are allowed : ");
			       
			        while (input.hasNext()) {
			            String nextInput = input.next();
			            if (nextInput.equalsIgnoreCase("=")) {
			                break;
			            }
			            int number = Integer.parseInt(nextInput);
			            intArr.add(number);
			            count++;
			            if (operation.equalsIgnoreCase("/") && count == 2) {
			                break;
			            }
			        }
			        break;
			    } catch (NumberFormatException e) {
			    	count =0;
			        System.out.println("Invalid input, please enter a number");
			    }
			}

			if (operation.equalsIgnoreCase("+")) {
				intArr.addLast(1);
			}
			else if (operation.equalsIgnoreCase("-")) {
				intArr.addLast(2);
			}
			else if (operation.equalsIgnoreCase("*")) {
				intArr.addLast(3);
			}
			else if (operation.equalsIgnoreCase("/")) {
				intArr.addLast(4);
			}
		return intArr;
	}

}
