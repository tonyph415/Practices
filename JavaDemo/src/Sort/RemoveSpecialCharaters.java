package Sort;

public class RemoveSpecialCharaters {

	public static void main(String[] args) {

		// Remove special character 
				String rs = "ABC123!@#$ Hello Bye";
				rs = rs.replaceAll("[^a-zA-Z0-9]", ""); 
				System.out.println(rs);

	}

}
