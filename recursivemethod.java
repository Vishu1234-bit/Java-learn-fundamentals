
public class recursivemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//callmymethod();
		System.out.println(factorial(5));
        System.out.println(iterativefactorial(7));
	}
	private static void callmymethod() {
		callmymethod();
	}
	private static int factorial(int a) {
		if(a>0) {
		return a*factorial(a-1);
		}
		else {
			return 1;
		}
		
	}
	private static int iterativefactorial(int a) {
		int factorial=1;
		if(a<0) {
			return -1;
		}
		else if(a==0) {
			return 1;
		}
		else {
           for(int i=1;i<=a;i++) {
		      factorial = factorial*i;
		}
		return factorial;
		}
		
	}

}
