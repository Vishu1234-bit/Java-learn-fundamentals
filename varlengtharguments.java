
public class varlengtharguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(1,2,34,5,6,4,3));

	}
	private static int sum(int... ints) {
		int sum=0;
		for(int i:ints) {
			sum+=i;
		}
		return sum;
	}

}
