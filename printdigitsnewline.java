import java.util.Scanner;
public class printdigitsnewline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please, enter any integer: ");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		for(char dig : a.toCharArray()){
		    System.out.println(dig);
		}
    }

	}


