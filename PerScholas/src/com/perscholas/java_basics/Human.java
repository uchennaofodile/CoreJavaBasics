
@FunctionalInterface
public interface Human {
//void say(); /*A single-abstract-method*/

void say(String message); //single abstract method	
	
	//String say(String message);
//------------default method one--------------------
default void sleep() {
	System.out.println("This is Default Method");
}

//------------static method--------------------

static void communication() {
	System.out.println("This is a static method");
}
//Lambda Expression

}
