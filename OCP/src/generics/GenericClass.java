package generics;
/**
 * without the generic param <T> in the class declaration, the class doesn't know what T as a type is.
 * 
 * if <T> is not in the interface declaration the interface will treat any reference to T as object.
 * meaning any implementation of print(T t) in this example will not be recognized and an error will be thrown for unimplemented methods. 
 * if <T> is not declared as a param for the GenericClass but is declared for the interface the same error occurs.
 * 
 * alternatively T can be replaced with a concrete class name.
 * @param <T>
 */
public class GenericClass<T> implements GenericInterface<T> {
	private T content;
	
	
	public T getContent() {
		return content;
	}
	
	public void setContent(T t) {
		content = t;
	}

	@Override
	public T print(T t) {
		System.out.println(t);
		return t;
	}
	
	public static <T> T getT(T t) {
		return t;
	}
	
/**	public static T getT(T t) { Compile error cause it is missing the formal <T> generic in the declaration.
		return t;				However the formal generic <T> declaration is only needed if the method is static.
	}
*/

}
