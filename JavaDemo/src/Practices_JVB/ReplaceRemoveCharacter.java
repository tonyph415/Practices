package Practices_JVB;

public class ReplaceRemoveCharacter {

	public static void main(String[] args) {
		// replace all of a given character :
		System.out.println("H!E@L#L$O%1 2^&3()-[]".replaceAll("\\D", ""));
	

		// To remove a character :
	
//	public static void main(String args[]) { 
		// 1st example: You can use substring() method to remove first 
		// and the last character from String in Java. 
		
		String text = "Google"; 
		String withoutFirstCharacter = text.substring(1); // index starts at zero 
		String withoutLastCharacter = text.substring(0, text.length() - 1); 
		System.out.println("Using SubString() method: "); 
		System.out.println("input string: " + text); 
		System.out.println("without first character: " + withoutFirstCharacter); 
		System.out.println("without last character: " + withoutLastCharacter); 
		
		// 2nd Example - You can use StringBuffer or StringBuilder to remove 
		// first or last character from String in Java 
		
		String fb = "FaceBook"; // converting String to StringBuilder 
		StringBuilder builder = new StringBuilder(fb); 
		// removing first character builder.deleteCharAt(0); 
		System.out.println("Using StringBuilder deleteCharAt() method: "); 
		
		System.out.println("input string: " + fb); 
		System.out.println("String after removing first character: " + builder.toString());
		// creating another StringBuilder builder = new StringBuilder(iStore); 
		// removing last character from String 
		builder.deleteCharAt(fb.length() - 1); 
		System.out.println("String after removing last character: " + builder.toString());
		
	
//	public static void main(String[] args) {
		  
	      StringBuilder str = new StringBuilder("Java lang package");
	      System.out.println("string = " + str);

	      // deleting character from index 4 to index 9
	      str.delete(4, 9);
	      System.out.println("After deletion = " + str);

	      str = new StringBuilder("amit");
	      System.out.println("string = " + str);
	      
	      // deleting character at index 2
	      str.deleteCharAt(2);
	      System.out.println("After deletion = " + str);
	   }

	}

		
		
		
	


