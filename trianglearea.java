import java.util.Scanner;
import java.lang.Math;
public class trianglearea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				Scanner sc = new Scanner(System.in);
				
				System.out.print("Please, enter A side of a triangle: ");
				int a = sc.nextInt();
				
				System.out.print("Please, enter B side of a triangle: ");
				int b=sc.nextInt();
				
				System.out.print("Please, enter C side of a triangle: ");
				int c =sc.nextInt();
				
				int p =(a+b+c)/2;
				int area = p*(p-a)*(p-b)*(p-c);
				double triangleArea = Math.sqrt(area);
				
				System.out.println("Triangle area is: " + triangleArea);
				
			}

		


	

}
