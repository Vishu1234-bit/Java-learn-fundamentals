import java.math.BigDecimal;
import java.math.RoundingMode;
public class floatingarithmetic {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        int a = 50;
        int b = 7;
        System.out.println(a/b);
        System.out.println((double)a/b);
        BigDecimal c = BigDecimal.valueOf(a).setScale(2);
        BigDecimal e = BigDecimal.valueOf(b);
        BigDecimal d =  c.divide(e,RoundingMode.HALF_UP);
        BigDecimal f =  c.divide(e,RoundingMode.HALF_DOWN);
        BigDecimal h =  c.divide(e,RoundingMode.HALF_EVEN);
        System.out.println(d);
        System.out.println(f);
        System.out.println(h);
        double bf = 9.5;
        double fg = 78.2;
        System.out.println(fg-bf);
        BigDecimal k = BigDecimal.valueOf(bf).setScale(2);
        BigDecimal l = BigDecimal.valueOf(fg).setScale(2);
        BigDecimal sub =  l.subtract(k);
        System.out.println(sub);
        
        
        
	}

}
