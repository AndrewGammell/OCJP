package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class CollectionExamples {

	public static <T> void printList(List<T> list) {
		list.forEach(l -> System.out.println(l));
	}
	public static <K,V> void printMap(Map<K,V> map) {
		map.forEach((K,V)-> System.out.println(K+ "   " +V));
	}
	public static void replaceIntegers(List<Integer> list) {
		list.replaceAll(l -> l*8);
	}

	public static void removeFromList(List<String> list) {
		list.removeIf(l -> l.startsWith("A"));
	}
	public static void incrementValue(Map<String, Integer> map) {
		BiFunction<String, Integer, Integer> mapper = (k, v) -> v + 1;
		map.computeIfPresent("Andrew", mapper);
	}
	
	public static void absentFromMap(Map<String, Integer> map, String key, Integer value) {
		map.putIfAbsent(key, map.put(key, value));
	}
	
	public static void main(String[] args) {
		
		List<String> strings = getStrings();
		List<Integer> integers = getIntegers();
		Map<String,Integer> map = getMap();
		
		strings.removeIf(s -> s.contains("David"));
		replaceIntegers(integers);
		removeFromList(strings);
		incrementValue(map);
		absentFromMap(map,"Gammell", 50);
		
	
		
		
		
		
		
		
		
		
		printList(strings);
		printList(integers);
		printMap(map);
		


	}


	public static List<String> getStrings() {
		List<String> list = new ArrayList<String>();
		list.add("Andrew");
		list.add("Micheal");
		list.add("Stephen");
		list.add("David");
		list.add("Gammell");
		return list;
	}

	public static List<Integer> getIntegers(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		return list;
	}
	
	public static Map<String, Integer> getMap(){
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Andrew", 31);
		map.put("David", 30);
		return map;
	}
}


