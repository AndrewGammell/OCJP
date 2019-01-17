package innerClasses;

import innerClasses.StaticOuterClass.StaticInnerClass;

/**
 * The anonymous inner class and the interface are used in the same way. Created with the new keyword and used as needed.
 * the third example created and instantiates the anonymous class.
 * 
 * Alternatively the anonymous inner class can be created in the parameter signature of a method call.
 *
 */

public class AnonymousOuterClass {
	private int height = 12;
	private String str, str3; // legal assignment
	
	////////////////////////HOW TO CREATE AN ANONYMOUS AS THEY ARE NEEDED WITHOUT MAKING IT CONCRETE///////////
	/**	
	abstract class AnonymousInnerClass{
	abstract int getWidth();
	}

	private int calculate(int height) {
		
		return height + new AnonymousInnerClass() {
			public int getWidth() {
				return 8;
			}
		}.getWidth();
	}
	*/
	///////////////////////HOW TO USE AN INTERFACE AS AN ANONYMOUY CLASS/////////////////////////////
	/**
	interface Anonymous{
		int getWidth();
	}
	
	private int calculate(int height) {
		
		return height + new Anonymous() {
			public int getWidth() {
				return 12;
			}
		}.getWidth();
	}
	*/
	
	/////////////////////HOW TO MAKE AN ANONYMOUS CLASS CONCRETE FOR USE IN A METHOD//////////////////////////////////////////////////////////
	abstract class AnonymousInnerClass{
		abstract int getWidth();
		}
	private int calculate(int height) {
		
		AnonymousInnerClass inner = new AnonymousInnerClass() {
			public int getWidth() {
				return -12;
			}
		};
		
		return inner.getWidth() + height ;
	}
	
	
	public static void main(String[] args) {
		
		AnonymousOuterClass outer = new AnonymousOuterClass();
	
		System.out.println(outer.calculate(outer.height));
		
		System.out.println(outer.calculate(new StaticInnerClass().getVar()));// same method call as above except using the 
																			//static inner class from another class

	}

}
