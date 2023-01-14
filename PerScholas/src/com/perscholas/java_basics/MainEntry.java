import java.util.*;
import java.io.IOException.*;
public class MainEntry {

	Calc <Integer>calcObj = new Calc<>(){

		@Override public void compute(LinkedList<Integer>myIntArray) {
			Scanner input = new Scanner(System.in);
			int operation = myIntArray.getLast();
			myIntArray.removeLast();
			int result =0;
			//add
			if (operation==1) {
				for (int i=0; i<myIntArray.size(); i++) {
					result += myIntArray.get(i);
				}


			}
			//subtract
			if (operation==2) {
				result = myIntArray.getFirst();
				for(int i =1 ; i<myIntArray.size(); i++ ) {
					result-=myIntArray.get(i);

				}
			}

			//multiply
			if (operation==3) {
				result = myIntArray.getFirst();
				for(int i =1 ; i<myIntArray.size(); i++ ) {
					result*=myIntArray.get(i);

				}
			}
			//divide
			if (operation==4) {
				result = myIntArray.getFirst();
				result /= myIntArray.getLast();

			}
			System.out.println("Your answer is: "+ result);
			
			boolean isContinue = true;
			loop: while (isContinue) {
			    try {
			        System.out.println("Continue: Y/N ");
			        String answer = input.next();
			        if (answer.equalsIgnoreCase("N")) {
			            isContinue = false;
			            System.out.println("Thanks for playing!");
			            input.close();
			            System.exit(0);
			        } else if (!answer.equalsIgnoreCase("Y")) {
			            throw new IllegalArgumentException("Invalid input. Please enter Y or N.");
			        }
			        myIntArray = addNumsToIntArray();
			        calcObj.compute(myIntArray);
			    } catch (Exception e) {
			        System.out.println(e.getMessage());
			        continue loop;
			    }
			}

			

		}


	};



}
