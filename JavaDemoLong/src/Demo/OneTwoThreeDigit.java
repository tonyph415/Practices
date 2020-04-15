package Demo;
import java.util.Scanner;

public class OneTwoThreeDigit {
	
	static int[] findSum(int[] a){
	    int count2d=0, count3d=0, count;
	 
	    for(int i=0; i<a.length; i++){
	      int num = a[i];
	      count = 0;
	 
	      //finding the total digits in the number
	      while(num!=0){
	        num /= 10;
	        count++;
	      }
	 
	      if(count == 2) count2d += a[i];
	      else if (count == 3) count3d += a[i];
	    }
	 
	    return (new int[] {count2d, count3d});
	  }
	 
	 
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	 
	    //Taking inputs from the user
	    System.out.print("How many numbers you want to enter: ");
	    int n = scan.nextInt();
	    int[] arr = new int[n];
	 
	    System.out.printf("Enter %d numbers: \n", n);
	    for(int i=0; i<n; i++){
	      arr[i] = scan.nextInt();
	    }
	 
	    //Calling findSum method
	    int[] result = findSum(arr);
	    System.out.printf("Total of all two digit numbers = %d\n", result[0]);
	    System.out.printf("Total of all Three digit numbers = %d\n", result[1]);
	  }
	 
	}

