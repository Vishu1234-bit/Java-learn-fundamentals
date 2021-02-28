import java.util.Arrays;

public class comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =128;
		int i1 = 128;
		System.out.println(i==i1);
		Integer i2 = 127;
		Integer i3 = 127;
		System.out.println(i2==i3);
		Integer i4 = 128;
		Integer i5 = 128;
		System.out.println(i4==i5);
		System.out.println(i4.equals(i5));
		Integer i6 = new Integer(178);
		Integer i7 = new Integer(178);
		System.out.println(i6==i7);
		Integer i8 = Integer.valueOf(176);
		Integer i9 = Integer.valueOf(176);
		System.out.println(i8==i9);
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		System.out.println(arr1==arr2);
		System.out.println(arr1.equals(arr2));
		System.out.println(Arrays.equals(arr1, arr2));
		arr1=arr2;
		System.out.println(arr1==arr2);
		}
		

	}


