import java.util.Arrays;
public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = " hello Vishu ";
        System.out.println(s.length());
        System.out.println(s.contains("vish"));
        System.out.println(s.contains("Vish"));
        System.out.println(s.isEmpty());
        System.out.println(s.toUpperCase());
        System.out.println(s.startsWith(" "));
        System.out.println(s.endsWith("i"));
        System.out.println(s.replace("V","A"));
        System.out.println(s.trim());
        System.out.println(s.strip());
        System.out.println(s.substring(1,6));
        System.out.println(Arrays.toString(s.getBytes()));
        System.out.println(Arrays.toString(s.toCharArray()));
        System.out.println(s.charAt(7));
        System.out.println(Arrays.toString(s.split(" ")));
        System.out.println(s);
	}
	
}
