
public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cost = 78;
		int userhas = 89;
		if(cost<userhas) {
			System.out.println("Buy ");
		}
		else {
			System.out.println("Don't Buy ");
		}
		int i1=9;
		int i2=7;
		int i3 = 5;
		if(i1<i2) {
			if(i2<i3) {
				System.out.println("I2 is between I3 and I1 ");
			}
			else {
				System.out.println("I3 is smaller than both I2 and I1 ");
			}
		}
		else {
			System.out.println("I1 is greater than both I2 and I3 ");
		}
		cost+=35;
		if(cost<userhas) 
			System.out.println("Buy ");
		
		else 
			System.out.println("Don't Buy ");
		int i=90;
		if(i>100) {
			System.out.println("Greater than 100 ");

		}
		else if(i>50 && i<100){
			System.out.println("Num is between 50 and 100");
		}
		else if(i<50) {
			System.out.print("lesser than 50");
		}
				

	}

}
