
public class switchdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		switch(i) {
		case 1:
			System.out.println("one");
		case 10:
			System.out.println("ten");
		case 3:
			System.out.println("three");
		case 4:
			System.out.println("four");
		default:
			System.out.println("default statement");
		}
        int j=1;
		switch(j) {
		case 1:
			System.out.println("one");
			break;
		case 10:
			System.out.println("ten");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		default:
			System.out.println("default statement");
		}
		String s ="*";
		switch(s) {
		case "*":
			System.out.println("star");
			break;
		case "{":
			System.out.println("curly braces");
			break;
		case "]":
			System.out.println("square braces");
			break;
		case "&":
			System.out.println("and");
			break;
		default:
			System.out.println("default statement");
		}
        
        
	}

}
