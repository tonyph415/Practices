package BasicJv;

public class Arrays {
	
	public static void main(String[] args) {
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		
		System.out.println(cars[1]);			// Outputs BMW
		
//		Change an Array Element
					// String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		cars[0] = "Opel";
		System.out.println(cars[0]);			// Now outputs Opel instead of Volvo
		
//	Array Length		
		System.out.println(cars.length);		// Outputs 4
		
// Loop Through an Array
		for (int i = 0; i < cars.length; i++) {
			  System.out.println(cars[i]);				
			}											// 	Opel	BMW		Ford	Mazda
// Loop Through an Array with For-Each		
		for (String i1 : cars) {
			  System.out.println(i1);
			  }											// 	Opel	BMW		Ford	Mazda
		
	// =====================	
		
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		int x = myNumbers[1][2];
		System.out.println(x); // Outputs 7 (This example accesses the third element (2) in the second array (1) of myNumbers)
		
		
		
		for (int i = 0; i < myNumbers.length; ++i) {
		      for(int j = 0; j < myNumbers[i].length; ++j) {
		        System.out.println(myNumbers[i][j]);			// Outputs 1 2 3 4 5 6 7
		      }
		}
		
		
		
	}
}
