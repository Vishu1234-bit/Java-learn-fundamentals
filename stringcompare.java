
public class stringcompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		String s1 = "hello";
		System.out.println(s==s1);//True
	    String s2 = new String("hello");
		System.out.println(s==s2);//False
		System.out.println(s.equals(s2));//False
		System.out.println(s==s2.intern());//True
		
		String s3 = "Hello";
		System.out.println(s==s3);//False
		System.out.println(s.equals(s3));//False
		System.out.println(s.equalsIgnoreCase(s3));//True
		
		

	}

}
