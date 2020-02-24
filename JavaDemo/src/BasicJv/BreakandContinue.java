package BasicJv;

public class BreakandContinue {
	 public static void main(String[] args) {
		    for (int i = 0; i < 10; i++) {
		      if (i == 4) {
		        break;
		      }
		      System.out.println(i); 		// Outputs 0 1 2 3 
		    }  
		    
		    for (int s = 0; s < 10; s++) {
		    	  if (s == 4) {
		    	    continue;
		    	  }
		    	  System.out.println(s); // Outputs 0 1 2 3 4 5 6 7 8 9
		    	}
		    
//	Break and Continue in While Loop
		    int a = 0;
		    while (a < 10) {
		      System.out.println(a);
		      a++;
		      if (a == 4) {
		        break;
		      }
		    }						// Outputs 0 1 2 3 
		    
		    
		    int b = 0;
		    while (b < 10) {
		      if (b == 4) {
		        b++;
		        continue;
		      }
		      System.out.println(b);
		      b++;
		    }						 // Outputs 0 1 2 3 4 5 6 7 8 9
		    
		    
		    
		    
		  }
}
