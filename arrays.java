import java.util.Arrays;

public class arrays {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[];
		int[] arr1;
	    int arr2[]= new int[10];
	    System.out.println(arr2.length);
	    double[] arr3 = new double[10];
	    boolean arr4[] = new boolean[10];
	    System.out.println(arr2[0]);
	    System.out.println(arr3[0]);
	    System.out.println(arr4[0]);
	    int[] arr5 = {4,6,3};
	    int[][] matrix = new int[10][10];
	    int[][] matrix1 = {
	    		          {3,2,1},
	    		          {4,5,1},
	                      };
	    System.out.println(matrix1[0][2]);
	    System.out.println(Arrays.toString(arr5));
	    Arrays.sort(arr5);
	    System.out.println(Arrays.toString(arr5));
	    
	    
	}
}

