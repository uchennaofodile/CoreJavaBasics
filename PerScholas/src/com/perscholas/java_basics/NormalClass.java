
public class NormalClass {
	/* Define an anonymous inner class implementing the interface.*/
	 /*Construct an instance and invoke the method. */
	/* anonymous constructor one */

	
	Human hObjone = new Human() {
		@Override
		public void say() {
			System.out.println("I am James");
		}
	};
	
	
	Human hObjTwo = new Human() {
		@Override
		public void say() {
			System.out.println("I am Tony");
		}
	};
	
	
	
}
