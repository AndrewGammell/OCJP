package innerClasses;

/**
 * Can be declared public, private, or protected or use default access
 * Can extend any class and implement interfacesCan be abstract or final
 * Cannot declare static fields or methods
 * Can access members of the outer class including private members
 * Inner classes can have the same variable names as outer classes.
 * 
 * at compile time a class file is created for the inner class and the outer class
 *
 */

public class MemberOuterClass {
	
	private String greeting =  "Hello World";
	
	private class MemberInnerClass{ /** member inner classes can see variables for the outer class
										*/
		private int  repeat = 3;
		
		private void greet() {
			for(int i = repeat; repeat > 0; --repeat) {
				System.out.println(greeting);
			}
		}
		
	}
	
	public void callInner() {
		MemberInnerClass inner = new MemberInnerClass();
		inner.greet();
		//int i = repeat; the outer class can not see the variable from the inner class
	}

	public static void main(String[] args) {
		
		MemberOuterClass outerClass = new MemberOuterClass();
		outerClass.callInner();
		
		MemberInnerClass inner = outerClass.new MemberInnerClass();/** alternative way of reateing the inner class to access it's 
																		variables and methods
		 															*/
		inner.greet();
	}

}
