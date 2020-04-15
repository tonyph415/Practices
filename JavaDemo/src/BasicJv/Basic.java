package BasicJv;

public class Basic {

	 public static void main(String[] args) {
		 
//		 Widening Casting (automatically) - converting a smaller type to a larger type size
//		 byte -> short -> char -> int -> long -> float -> double
//
//		 Narrowing Casting (manually) - converting a larger type to a smaller size type
//		 double -> float -> long -> int -> char -> short -> byte
		 
		 int i1 = 123;
		 double d1 = i1; // Automatic casting: int to double
		 System.out.println(i1);      // Outputs 123
		 System.out.println(d1);   // Outputs 123.0
		 
		 double d2 = 10.88; 
		 int i2 = (int) d2;
		 System.out.println(i2);      // Outputs 10
		 System.out.println(d2);   // Outputs 10.88
		  
		 
// Java Booleans	 
		 int x1 = 12;
		 int y1 = 1;
		 System.out.println(x1 > y1); // returns true, because 10 is higher than 9  
		 int x2 = 5;
		 int y2 = 10;
		 System.out.println(x2 > y2); // returns true, because 10 is higher than 9	
		 
		 int x = 123;
		 System.out.println(x == 123);
		    
// Java Operators
		 int q = 100 + 50;
		 System.out.println(q);
		 int sum1 = 100 + 50;        // 150 (100 + 50)
		 System.out.println(sum1);
		 int sum2 = sum1 + 250;      // 400 (150 + 250)
		 System.out.println(sum2);
		 int sum3 = sum2 + sum2;     // 800 (400 + 400)
		 System.out.println(sum3);   
		    
		 int w = 10;
		 w += 5;
		 System.out.println(w); //15
		 
		 
		 int a1 =11;
		 int a2 =22;
		 int a3=a1+a2;
		 System.out.println(a3); // 33
		 
		 String b1 = "11";
		 String b2 = "22";
		 String b3 = b1+b2;
		 System.out.println(b3); // 1122
		 
				
		    
		   
//	String 
		 
		 String txt = "A123456789";
		 System.out.println("The length of the txt string is: " + txt.length()); 	// 10
		 
		 String t1 = "Hello Java";
		 System.out.println(t1.toUpperCase());   // Outputs "HELLO JAVA"
		 System.out.println(t1.toLowerCase());   // Outputs "hello java"
		 
		 String s1 = "Googd ";
		 String s2 = "Morning";
		 System.out.println(s1.concat(s2)); // Good Morning
		 
		 
// Math
		 System.out.println(Math.max(5, 10));   // 10
		 System.out.println(Math.min(5, 10));   // 5
		 System.out.println(Math.sqrt(64));  	// 8    (8*8=64)
		 System.out.println(Math.abs(-123.45)); // 123.45
		 System.out.println(Math.random());		// random #

		 
		  }
		
	

	
	}

