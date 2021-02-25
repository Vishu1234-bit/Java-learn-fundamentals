
public class logicaloperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(false && (5/0==0));
	    //System.out.println(true & (5/0==0)); //raises runtime exception
	    //System.out.println(false || (5/0==0));//raises runtime exception
	    //System.out.println(false | (5/0==0));//raises runtime exception
	    System.out.println(!true);
	    System.out.println(true || (5/0==0));
	    System.out.println(true^false);
	    System.out.println(false^false);
	}

}
