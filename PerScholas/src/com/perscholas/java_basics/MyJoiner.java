@FunctionalInterface
public interface MyJoiner<T> {
String concantenate(T o1, T o2 );

//default method
default void display(T o1, T o2) {
	System.out.println(o1);
	System.out.println(o2);
}

}

