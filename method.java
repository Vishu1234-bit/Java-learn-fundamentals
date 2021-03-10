
public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double s = sum(8.9,6.8);
        printToConsole(s);
        printToConsole("Method demo");
        printToConsole(sum(7,45));
	}
	private static int sum(int a,int b) {
		return a+b;
	}
	private static double sum(double a,double b) {
		return a+b;
	}
	private static void printToConsole(int a) {
		System.out.println(a);
	}
	private static void printToConsole(double a) {
		System.out.println(a);
	}
	private static void printToConsole(String a) {
		System.out.println(a);
	}
	

}
