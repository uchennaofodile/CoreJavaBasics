import java.io.*;
import java.util.Arrays;
import java.util.*
;public class FileIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aPath ="C:/Users/Uchenna Ofodile/Documents";
		String txtPath ="C:/Users/Uchenna Ofodile/Documents/hi.txt";
File myFile = new File(aPath);
File txtFile = new File(txtPath);

//Reading File Content
try {
	Scanner input = new Scanner(txtFile);
	//char h = input.next().charAt(0);
	//String hi = input.nextLine();
	//String myNameIs = input.nextLine();
	//System.out.println(h);
	//System.out.println(hi);
	//System.out.println(myNameIs);
	
	//Reading the entire file
	//hasNext() verifies if the files has another line
	String data = "";
	while(input.hasNext()) {
		data =input.nextLine();
		System.out.println(data);
		
	}
	
} catch (FileNotFoundException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}

//isAbsolute - returns T/F whether path name is absolute or not
boolean isAbsolute = myFile.isAbsolute();
System.out.println("Is absolute: "+ isAbsolute);

//Returns contents of directory as a string array
//String [] list = myFile.list();
//for (String item: list) {
//	System.out.println(item);
//}
System.out.println("\n");

//returns absolute path
System.out.println("Get Absolute Path: "+txtFile.getAbsolutePath());

System.out.println("Get Parent File: "+txtFile.getParentFile());

System.out.println("to URI:"+ txtFile.toURI());

System.out.println("Is file: "+txtFile.isFile());

System.out.println("Is directory: "+myFile.isDirectory());

System.out.println("File exists: "+txtFile.exists());

System.out.println("Can Read: "+txtFile.canRead());

System.out.println("Can Write: "+txtFile.canWrite());

//myFile.delete(); //deletes file

//File already exists
try {if(txtFile.createNewFile()) {
	System.out.println("File created: "+ txtFile.getName());
} else {
	System.out.println("File already exists.");
}
}
catch(IOException e) 
{System.out.println(e.getMessage());}


//Creating a new file
File myObj = new File("C:/Users/Uchenna Ofodile/Documents/cool.txt");


try {if(myObj.createNewFile()) {
	System.out.println("File created: "+ myObj.getName());
} else {
	System.out.println("File already exists.");
}
}
catch(IOException e) 
{System.out.println(e.getMessage());}

System.out.println("File size: "+ myObj.length() +" Bytes");

File directory = new File("C:/Users/Uchenna Ofodile/Documents/CoolDirectory");
directory.mkdir();
System.out.println("Get free space: "+txtFile.getFreeSpace());

//returns a file array each item is of type File
//File [] files = myFile.listFiles();
//try{ 
//
//for(int i= 0; i<files.length; i++) {
//	System.out.println(files[i].getName());
//}
//}
//catch(Exception e) {
//	System.out.println(e.getMessage());
//}



//Reading a delimited file
//a delimited file is a file that has been separated into columns and rows (e.g. a table)
//the character separating each column is known as a "delimiter" and each row is on a new line
	}
	
	

}
