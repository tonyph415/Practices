package Sort;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {
	public static void main(String args[]) {
		String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" }; 
		// Finding duplicates using brute force method 
		for (int i = 0; i < names.length; i++) { 
			for (int j = i + 1; j < names.length; j++) { 
				if (names[i].equals(names[j]) ) { 
					
		Set<String> store = new HashSet<>(); 
		for (String name : names) { 
			if (store.add(name) == false) {
				System.out.println("found a duplicate element in array : " + name);
			
	
				}
			}
		}
	}	
}}}
