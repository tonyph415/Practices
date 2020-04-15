package Demo;
	import java.util.*;

	public class palindrome {
		
												//		Decimal to Binary using Stack
//		public static void main(String[] args) { 
//	    Scanner in = new Scanner(System.in);
//	 
//	    // Create Stack object
//	    Stack<Integer> stack = new Stack<Integer>();
//	 
//	    // User input 
//	    System.out.println("Enter decimal number: ");
//	    int num = in.nextInt();
//	 
//	    while (num != 0)
//	    {
//	      int d = num % 2;
//	      stack.push(d);
//	      num /= 2;
//	    } 
//	 
//	    System.out.print("\nBinary representation is:");
//	    while (!(stack.isEmpty() ))
//	    {
//	      System.out.print(stack.pop());
//	    }
//	    System.out.println();
//	  }
//		
//	
		
		
		// function to reverse bits of a number 
	    public static long reverseBits(long n) 
	    { 
	        long rev = 0; 
	  
	        // traversing bits of 'n'  
	        // from the right 
	        while (n > 0)  
	        { 
	            // bitwise left shift 'rev' by 1 
	            rev <<= 1; 
	  
	            // if current bit is '1' 
	            if ((n & 1) == 1) 
	                rev ^= 1; 
	  
	            // bitwise right shift 'n' by 1 
	            n >>= 1; 
	        } 
	  
	        // required number 
	        return rev; 
	    } 
	  
	    // function to check a number 
	    // is palindrome or not 
	    public static boolean isPalindrome(long n) 
	    { 
	        // get the number by reversing 
	        // bits in the  binary 
	        // representation of 'n' 
	        long rev = reverseBits(n); 
	  
	        return (n == rev); 
	    } 
	      
	    // Driver function  
	    public static void main(String argc[]) 
	    { 
	        long n = 9; 
	        if (isPalindrome(n)) 
	            System.out.println("Yes"); 
	        else
	            System.out.println("No"); 
	    } 
	      
		
		
		
		
	}
	

