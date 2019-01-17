package generics;

/**
The generic type doesn't need to be specified as a class param (e.g GenericClass<String>)
In this instance we tell the GenericClass to expect a string and all params in the 
GenericClass using T will treat T as a string.
*/
public class Main {

	public static void main(String[] args) {
		
	GenericClass<String> gen = new GenericClass<String>(); 
	
	gen.setContent("String");
	
	String str = gen.getContent();
	
	gen.print(str);
	
	}

}
