package Practices_JVB;

public class RemoveChar {

	public static void main(String[] args) {
		String str = "M1y java8 Progr5am";
		//		deleteCharAt()

		StringBuilder build = new StringBuilder(str);
		System.out.println("Pre Builder : " + build);
		build.deleteCharAt(1);  // Shift the positions front.
		build.deleteCharAt(8-1);
		build.deleteCharAt(15-2);
		System.out.println("Post Builder : " + build);
		//		replace()

		StringBuffer buffer = new StringBuffer(str);
		buffer.replace(1, 2, ""); // Shift the positions front.
		buffer.replace(7, 8, "");
		buffer.replace(13, 14, "");
		System.out.println("Buffer : "+buffer);
		//		char[]

		char[] c = str.toCharArray();
		String new_Str = "";
		for (int i = 0; i < c.length; i++) {
		    if (!(i == 1 || i == 8 || i == 15)) 
		        new_Str += c[i];
		}
		System.out.println("Char Array : "+new_Str);


			// Remove a letter

		String tx = "abcdDCBA123";
		System.out.println("String after Removing 'a' = "+tx.replace("a", ""));
		System.out.println("String after Removing First 'a' = "+tx.replaceFirst("ab", ""));
		System.out.println("String after replacing all small letters = "+tx.replaceAll("([a-z])", ""));


		//Remove Special Charaters

		String rs = "ABC123!@#$ Hello Bye";
		rs = rs.replaceAll("[^a-zA-Z0-9]", ""); 
		System.out.println(rs);
		
	}
}