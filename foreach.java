
public class foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		int sum=0;
		for (int i : arr) {
			System.out.println("i : "+i);
            sum+=i;
		}
        System.out.println("Sum:"+sum);
	}

}
