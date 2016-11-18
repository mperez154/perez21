package perez21;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Assignment1 {

	public static void main(String[] args) {
		
		//global variables 
		int score = 0;
		
		//Creating scanner input
		Scanner input = new Scanner(System.in);
		
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
			System.out.println("President #" + s.toString() + " ");
		}
		
		//Creating a set to store integers
		Set<Integer> integerSet = new HashSet<>();
		
		//while loop that adds 5 random numbers between 35 and 44
		while(integerSet.size() < 5)
		{			
			integerSet.add((int) (35 + Math.random() * (44-35)));			
		}
								
		//Creating iterator that can ask questions, and track results	
		Iterator<Integer> iterator = integerSet.iterator();
		
		//Starting quiz using while loop
		System.out.println("Presidents Quiz\n\n");
		while (iterator.hasNext()) {
			int number = iterator.next();
			
			//Questions
			System.out.println("Who was president #" + number);			
			String answer = input.nextLine();
			
			//Validate results
			if(answer.equals(hashMap.get(number)))
			{
				score++;			
			}
		}
		
		//outputting score
		System.out.println("Your score was " + score);
		
		input.close();


	}

}
