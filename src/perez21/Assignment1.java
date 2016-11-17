package perez21;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Assignment1 {

	public static void main(String[] args) {
		//Creating a map called hashMap
		Map<Integer, String> hashMap = new HashMap<>();
		//Adding elements to the Map
		hashMap.put(35, "Kennedy");
		hashMap.put(36, "Johnson");
		hashMap.put(37, "Nixon");
		hashMap.put(38, "Ford");
		hashMap.put(39, "Carter");
		hashMap.put(40, "Reagan");
		hashMap.put(41, "Bush Sr.");
		hashMap.put(42, "Clinton");
		hashMap.put(43, "Bush Jr.");
		hashMap.put(44, "Obama");
		
		//Displaying the size of the Map
		System.out.println("Size of Map: " + hashMap.size());
				
		//Creating a set from this map
		Set<Map.Entry<Integer, String>> mySet = hashMap.entrySet();
			
		//Looping through the set elements 
		for (Object s: mySet) {
			System.out.println("President # " + s.toString() + " ");
		}
		
		//Creating a set to store integers
		Set<Integer> integerSet = new HashSet<>();

	}

}
