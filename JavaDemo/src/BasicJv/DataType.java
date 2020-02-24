package BasicJv;

public class DataType {

	public static void main (String[] args) {
	
		
		String s = "Hello Java";     	// String ""
		System.out.println(s);
		
		System.out.println("The primitive data types");
		
		int i = 1234567890; 			// Integer (whole number - max 10#)
		System.out.println(i);
		
		char c = 'D';         			// Character
		System.out.println(c);
		char c1 = 44, c2 = 55, c3 = 66;	// # of Character 
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		
		boolean b1 = true;       	// Boolean
		boolean b2 = false;
		System.out.println(b1);     // Outputs true
		System.out.println(b2);   	// Outputs false
		
		byte by = 123;				// max 3#
		System.out.println(by);
		
		short sh = 1234;			// max 4#
		System.out.println(sh);
		
		long l = 1234567890123456789L;	// max 19#+l
		System.out.println(l);
		
		float f = 123456789012345678901234567890123456789.00f; // Floating point number
		System.out.println(f);
		
		double d1 = 12.34d;
		double d2 = 12e2d;
		System.out.println(d1);
		System.out.println(d2);
		
//		===
		
		String x= "Good ";
		String y= "Morning ";
		System.out.println(x+y);
		
}
}
	
		
//		byte	1 byte	Stores whole numbers from -128 to 127
//		short	2 bytes	Stores whole numbers from -32,768 to 32,767
//		int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
//		long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//		float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//		double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
//		boolean	1 bit	Stores true or false values
//		char	2 bytes	Stores a single character/letter or ASCII values
	
//		Integer types stores whole numbers, positive or negative (such as 123 or -456), without decimals. 
//		Valid types are byte, short, int and long. Which type you should use, depends on the numeric value.
//
//		Floating point types represents numbers with a fractional part, containing one or more decimals.
//		There are two types: float and double.
//
//		Even though there are many numeric types in Java, the most used for numbers are int (for whole numbers)
//		and double (for floating point numbers). However, we will describe them all as you continue to read.
//	
