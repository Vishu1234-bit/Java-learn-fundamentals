import java.util.Arrays;
import java.util.Scanner;

public class maxIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer numbers separated by space: ");
		int n=sc.nextInt();
		int[] intArray = new int[n];
	    for(int i =0;i<n;i++){
	        intArray[i]=sc.nextInt();
	    }
        
	    int maxInt = findMaxIntInArray(intArray);
		System.out.println("*** Initial Array ***");
		System.out.println(Arrays.toString(intArray));
		System.out.println("*** Max number in array ***");
		System.out.println(maxInt);

	}
	public static int findMaxIntInArray(int[] intArray) {
		int max=0;
		for(int i=0;i<intArray.length;i++) {
			if(intArray[i]>max) {
				max=intArray[i];
			}
		}
		return max;
	}

}
