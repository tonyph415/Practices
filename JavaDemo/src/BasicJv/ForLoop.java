package BasicJv;

public class ForLoop {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			  System.out.println(i);			// Outputs 0 1 2 3 4
			}
		
		
		for (int i = 0; i <= 10; i = i + 2) {
			  System.out.println(i);			// Outputs 2 4 6 8 10
			}
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars) {
		  System.out.println(i); 				// Outputs 	Volvo	BMW		Ford	Mazda
		}
		
		
		
		
	}

}
