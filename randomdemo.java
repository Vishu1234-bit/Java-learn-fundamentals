import java.util.Random;
public class randomdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		System.out.println(r.nextInt());//anynum
		System.out.println(r.nextInt(100));//0to99
		System.out.println(r.nextInt(100)+5);//5to105
        int a = r.nextInt();
        int b = r.nextInt();
        int c = a+b;
        System.out.print(a+" + "+b+" = "+c);
	}

}
