package Practice1;

import java.util.Scanner;

	public class TernarryOperator {
		private static Scanner sc;
		public static void main(String[] args) {
			int age;
			sc = new Scanner(System.in);
			System.out.println("Please enter your Age: ");
			age = sc.nextInt();
			String message = (age >=18)? "You are eligible to vote" : "You are not eligible to vote" ;
			System.out.println(message);
		}


	}


