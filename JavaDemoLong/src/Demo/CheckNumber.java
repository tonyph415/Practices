package Demo;

public class CheckNumber {
	public static void main(String[] args) {  
		  System.out.println("Armstrong Numbers 1 to 10000 >>");  
		  for (int i = 1; i <= 10000; i++) {  
		   if (Armstrong(i) == true) {  
		    System.out.print(i + " ");  
		   }  
		  }  
		  System.out.println("\nPalindrome Numbers 100 to 500 >>");  
		  for (int i = 100; i <= 500; i++) {  
		   if (Palindrome(i) == true) {  
		    System.out.print(i + " ");  
		   }  
		  }  
		  System.out.println("\nPrime Numbers up to 200 >>");  
		  for (int i = 1; i <= 200; i++) {  
		   if (Prime(i) == true) {  
		    System.out.print(i + " ");  
		   }  
		  }  
		 }  
		 public static boolean Armstrong(int num) {  
		  int num1 = num;  
		  /* Converting Integer to String. It'll help to find number of 
		  digits in the Integer by using length() */  
		  String str = Integer.toString(num);  
		  int rem;  
		  int result = 0;  
		  while (num > 0) {  
		   rem = num % 10;  
		   num = num / 10;  
		   result = result + ((int) Math.pow(rem, str.length()));  
		  }  
		  if (result == num1) {  
		   return true;  
		  } else {  
		   return false;  
		  }  
		 }  
		 public static boolean Palindrome(int num) {  
		  int num1 = num;  
		  int rem;  
		  int result = 0;  
		  while (num > 0) {  
		   rem = num % 10;  
		   num = num / 10;  
		   result = (result + rem) * 10;  
		  }  
		  result /= 10;  
		  if (result == num1) {  
		   return true;  
		  } else {  
		   return false;  
		  }  
		 }  
		 public static boolean Prime(int num) {  
		  if (num < 2) {  
		   return false;  
		  }  
		  int div = num / 2;  
		  for (int i = 2; i <= div; i++) {  
		   if (num % i == 0) {  
		    return false;  
		   }  
		  }  
		  return true;  
		 }  
		
}