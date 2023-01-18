

public class Student {

	private int age;
	private String name;
	private long social;

	public Student() {
//		age = 0;
//		name ="";
//		social=0;
//		System.out.println("Student with default values created!");
		this(0, "",0);
	System.out.println("Student with default values created!");
	}

	public Student(int age, String name, long social) {
		this.age = age;
		this.name = name;
		this.social =social;
	}

public Student(int age, String name) {
	this.age = age;
	this.name = name;
}	
	
public int getAge() {
	return this.age;
}

public void setAge(int age) {
	this.age = age;
}

public String getName( ) {
	return this.name;
}

public long getSocial() {
	return this.social;
}

public void setSocial(long social) {
	this.social = social;
}

public int happyBirthday() {
	this.age = 1+ this.getAge();
	return this.age;
}

@Override
public String toString(){
	return this.getName() +" "+ this.getAge()+" "+ this.getSocial();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student uchenna = new Student();
		uchenna.age = 29;
		uchenna.name = "Uchenna";
		uchenna.social =123L;
		System.out.println(uchenna.social);
		Student ifeoma = new Student(18, "Ifeoma");
		ifeoma.social =234L;
		System.out.println(ifeoma.social);
		System.out.println(ifeoma.getAge());
		ifeoma.setAge(21);
		System.out.println("Old age: "+ ifeoma.getAge());
		ifeoma.happyBirthday();
		System.out.println("New age:  "+ ifeoma.getAge());

	}

}
