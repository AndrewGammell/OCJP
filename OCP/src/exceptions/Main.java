package exceptions;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * try catch are effectively final meaning you can reassign variables in the catch block *Note that this is a bad idea and not convention but legal.
 * Multi try catch does not allow for reassigning variables in the catch block.
 *  
 * @author AGAMMELL
 *
 */
public class Main {

	public static void main(String[] args) throws CustomExceptionChecked {
		
	int caseID = -1;
	Exception ex;

		try {
			
			switch(caseID) {
			case 1: throw new CustomExceptionChecked(new NullPointerException());
			case 2: throw new CustomExceptionChecked("Custom Checked Exception");
			case 3: throw new CustomExceptionUnchecked(new NullPointerException());
			case 4: throw new CustomExceptionUnchecked("Custom Unchecked Exception") ;
			default: System.out.println("please type something");;
			}
			
		} catch(CustomExceptionChecked | CustomExceptionUnchecked e) { // multi catch block
			e.printStackTrace();
			// ex = e; will not compile illegal reassignment 
		}
		
		/** catch(FileNotFoundException | IOException e) { won't compile because FileNotFoundException is a child of IOException and will say FNFE is caught by IOE
		} catch(Exception1 e | Exception2 e | Exception3 e) { won't compile because the variable name appears three times
		} catch(Exception1 e1 | Exception2 e2 | Exception3 e3){ won't compile because there is three different variable names present
		} catch(Exception1 e | Exception2  | Exception3 ){ won't compile because the variable name must to declared after the last exception being caught 
		}**/
		
		/**
		 * This try catch will not compile for a number of reasons 
		 * 1) Exceptions can't be caught twice or declared in two different catch block for the same try
		 * 2) Exceptions must be declared from most specific to most general so is this example the single Exception and NullPointerException must be swapped
		try {
			throw new NullPointerException();
		} catch(NullPointerException | FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace(s);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		**/
		
		
		/**
		 *  Remember that only a try-with-resources statement is permitted to omit both the catch and finally blocks.
		 *   A traditional try statement must have either or both.
		 */
		
		//try with resources example
		try(Scanner scan = new Scanner(System.in)){
			String str = scan.nextLine();
			System.out.println("You typed: " + str);
		}
	}

}
