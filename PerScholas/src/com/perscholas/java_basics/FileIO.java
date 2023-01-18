import java.io.*;
import java.util.Arrays;
public class FileIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aPath ="C:/Users/Uchenna Ofodile/Documents";
		String txtPath ="C:/Users/Uchenna Ofodile/Documents/hi.txt";
File myFile = new File(aPath);
boolean isAbsolute = myFile.isAbsolute();
System.out.println("Is absolute: "+ isAbsolute);
String [] list = myFile.list();
for (String item: list) {
	System.out.println(item);
}
System.out.println("\n");
	}

}
