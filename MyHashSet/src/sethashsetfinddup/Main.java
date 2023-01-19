package sethashsetfinddup;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
	
//Set up test data
		
		String[] name = {
				new String("Sang"), 
				new String("Shin"),
				new String("Boston"),
				new String("Shin")
		};
		
		//Create a HashSet object instance and 
		//assign it to a variable of Set type.
		Set<String> s = new HashSet<>();
		for(int i =0; i<name.length; i++) {
			if(!s.add(name[i])) {
				System.out.println("Duplicate deteced: "+ name[i]);
				
				
				System.out.println(s.size() + " distinct word detected: "+s);
			} 
		}
	}

}
