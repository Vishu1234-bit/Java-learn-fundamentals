import java.util.Arrays;

public class parameterPassing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=9;
		changeValue(i);
		System.out.println(i);
		i=changeintValue(i);
		System.out.println(i);
		int[] arr = {1,2,3};
		arraychange(arr);
		System.out.println(Arrays.toString(arr));
		cleararray(arr);
		System.out.println(Arrays.toString(arr));

	}
	private static void changeValue(int i) {
		i+=7;
	}
	private static int changeintValue(int i) {
		i+=7;
		return i;
	}
	private static void arraychange(int[] arr) {
		arr[1]+=7;
	}
	private static void cleararray(int[] arr) {
		arr = null;
	}
	

}
