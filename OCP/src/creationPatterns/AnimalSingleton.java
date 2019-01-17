package creationPatterns;

/**
 * The instantiation blocks are self contained uncomment as needed for testing.
 * 
 * The first two instantiations are done at load time.
 *
 * The third instantiation is done the first time the getInstance method is called. 
 * Lazy instantiation is not thread safe unless it is made synchronized.
 * 
 * The forth instantiation is a double checked locking, a variation of the lazy instantiation.
 *  "volatile" This keyword prevents a subtle case where the compiler tries to optimize the code such that
 * the object is accessed before it is finished being constructed.
 * This solution is better than our previous version, 
 * as it performs the synchronization step only when the singleton does not exist.
 */
public class AnimalSingleton {
	
	private int age;
	private String name;
	
	////////////////////////////////////INSTANTIATION/////////////////////////////////////////////////////////
	
	/**
	private static AnimalSingleton instance = new AnimalSingleton(10,"sid"); // Direct instantiation
	public static AnimalSingleton getInstance(){
		return instance;
	}
	*/
	
	/**
	private static AnimalSingleton instance;
	static {
		instance = new AnimalSingleton(20, "clive");   // static instantiation
	}
	public static AnimalSingleton getInstance(){
		return instance;
	}
	*/
	
	/**
	private static AnimalSingleton instance;
	public static synchronized AnimalSingleton getInstance() {   // lazy instantiation
		if(instance == null) {
			instance = new AnimalSingleton(30, "steve");
		}
		return instance;
	}
	*/
	
	private static volatile AnimalSingleton instance;
	public static AnimalSingleton getInstance() {  // Double checked locking
		
		if(instance == null) {
			synchronized(AnimalSingleton.class){
				if(instance == null) {
					instance = new AnimalSingleton(40, "brett");
				}
			}
		}
		
		
		return instance;
	}
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	private AnimalSingleton(int age, String name) {
		this.setAge(age);
		this.setName(name);
	}

	public synchronized  int getAge() {
		return age;
	}

	public synchronized  void setAge(int age) {
		this.age = age;
	}

	public synchronized  String getName() {
		return name;
	}

	public synchronized  void setName(String name) {
		this.name = name;
	}

	
}
