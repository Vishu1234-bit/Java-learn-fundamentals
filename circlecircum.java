import java.util.Scanner;
import java.lang.Math;
public class circlecircum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter circle radius: ");
		
		int r = sc.nextInt();
        double circleCircumference = 2*Math.PI*r;
		System.out.println("Circle circumference is: " + circleCircumference);
	}

}
