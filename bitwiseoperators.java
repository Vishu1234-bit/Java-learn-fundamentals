
public class bitwiseoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a =6;
        int b =4;
        System.out.println("a&b = "+(a&b));
        System.out.println("a|b = "+(a|b));
        System.out.println("a^b = "+(a^b));
        System.out.println("~a = "+ ~a );
        System.out.println(Integer.toBinaryString(a));
        System.out.println("~1 = " + ~1);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(-b));
        System.out.println((byte)0b1101010101010);
        System.out.println("a>>2 = "+(a>>2));
        System.out.println("a<<2 = "+(a<<2));
        System.out.println("1000000>>>2 = "+(0b1000000>>>2));
        System.out.println(Integer.toBinaryString(0b1000000>>>2));
        
	}

}
