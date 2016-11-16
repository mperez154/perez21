package perez21;

import java.util.HashMap;
import java.util.Map;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hashMap = new HashMap<>();
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
		
		System.out.println("Size of Map: " + hashMap.size());
		
		System.out.println(hashMap.get(35));
		System.out.println("President #" + hashMap.entrySet());

	}

}
