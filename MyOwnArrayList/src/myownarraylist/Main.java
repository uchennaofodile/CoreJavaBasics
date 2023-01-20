package myownarraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
	
ArrayList<Object> al = new ArrayList<>();

//adding objects
al.add(new String("Hi"));
al.add(new MyOwnClass());
al.add(Integer.parseInt("65"));

//Iterating through ArrayList
Iterator it = al.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}

Object [] a = al.toArray();
//Creating object array
for(int i =0; i<a.length; i++) {
	System.out.println(a[i]);
}


	}

}
