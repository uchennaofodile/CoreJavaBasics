
class NonGenericClass {

	private String name;
	
	String getName() {
		return this.name;
	}
	
	void setName(String name) {
		this.name = name;
	}

<T> void  printValues(T values) {
	System.out.println(values);
}

static <T> void staticDisplayData(T value) {
	System.out.println(value);
}

<E> void printArray(E[] elements) {
	for (E element: elements) {
		System.out.print(element+ " ");
	}
System.out.println();}

public static void main(String args[]) {
	NonGenericClass ng = new NonGenericClass();
	ng.printValues(3);
	ng.printValues(true);
	ng.printValues("Hi");
	ng.printValues(54.33);
	System.out.println("==========Static Methods===============");
	NonGenericClass.staticDisplayData("Bye");
	NonGenericClass.staticDisplayData(3);
	NonGenericClass.staticDisplayData(2132.21);
	System.out.println("==========Arrays===============");
	Integer [] intArray = {1,2,3,4,5,6};
	Character[] charArray = {'A', 'B', 'C', 'D', 'e'};
	ng.printArray(charArray);
	ng.printArray(intArray);
}


}
