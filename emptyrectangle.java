import java.util.Scanner;
public class emptyrectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter height of rectangle: ");
		int height = sc.nextInt();
		System.out.print("Please, enter width of rectangle: ");
		int width = sc.nextInt();
		
		drawRectangle(height, width);

	}
	public static void drawRectangle(int height, int width) {
       for(int i =0;i<width;i++) {
    	   System.out.print("*");
       }
       System.out.println();
       for(int i =0;i<(height-2);i++) {
    	   System.out.print("*");
    	   for(int j=0;j<(width-2);j++) {
    		   System.out.print(" ");
    	   }
    	   System.out.print("*");
    	   System.out.println();
       }
       for(int i =0;i<width;i++) {
    	   System.out.print("*");
       }
       
    		   
    	   }
       
	}

