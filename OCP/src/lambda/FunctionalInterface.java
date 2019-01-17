package lambda;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionalInterface {
	Map<String, String> map = new HashMap<String,String>();
	
	Supplier<StringBuilder> sb1 = StringBuilder::new;
	Supplier<StringBuilder> sb2 = () -> new StringBuilder();
	
	Supplier<LocalDate> ld1 = LocalDate::now;
	Supplier<LocalDate> ld2 = () -> LocalDate.now();
	
	Consumer<String> c1 = System.out::println;
	Consumer<String> c2 = (x) -> System.out.println(x);
	
	BiConsumer<String,String> bc1 = map::put; 
	BiConsumer<String,String> bc2 = (k,v) -> map.put(k,v);
	
	public void doStuff() {
		c1.accept("hello");
		c2.accept("world");
		
		bc1.accept("String Key", "String Value");
		bc2.accept("key", "value");
		
		
	}
	
}
