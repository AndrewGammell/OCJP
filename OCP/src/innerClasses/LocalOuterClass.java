package innerClasses;

/**
 *	They do not have an access specifier.
	They cannot be declared static and cannot declare static fields or methods.
	They have access to all fields and methods of the enclosing class.
	They do not have access to local variables of a method unless those variables are final or effectively final. More on this shortly.
 *
 */
public class LocalOuterClass {
	
	private int length = 10;
	
	private void calculate() {
		
		class LocalInner{
			private int width = 20;
			private int multiply() {
				
				return width * length;
			}
		}
		
		LocalInner inner = new LocalInner();
		System.out.println(inner.multiply());
	}

	public static void main(String[] args) {
		LocalOuterClass outer = new LocalOuterClass();
		outer.calculate();
	}

}
