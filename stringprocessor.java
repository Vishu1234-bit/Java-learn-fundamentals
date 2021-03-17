
public class stringprocessor {
	 public static final String INPUT_DATA = "Login;Name;Email" + System.lineSeparator() +
				"peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator() +
				"james;Derek James;james@gmail.com" + System.lineSeparator() +
				"jackson;Walter Jackson;jackson@gmail.com" + System.lineSeparator() +
				"gregory;Mike Gregory;gregory@yahoo.com";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    
				System.out.println("===== Convert 1 demo =====");
				System.out.println(convert1(INPUT_DATA));
				
				System.out.println("===== Convert 2 demo =====");
				System.out.println(convert2(INPUT_DATA));
				
			}
			
			public static String convert1(String input) {
				//<write your code here>
				String results = "";
				String[] words = input.split(System.lineSeparator());
				for (int i=1;i<words.length;i++) {
					String[] wordsinline = words[i].split(";");
					results = results+ wordsinline[0]+" ==> "+wordsinline[2]+System.lineSeparator();
					
				}
				
			return results;
			}
			
			
			public static String convert2(String input) {
				//<write your code here>
				String results = "";
				String[] words = input.split(System.lineSeparator());
				for (int i=1;i<words.length;i++) {
					String[] wordsinline = words[i].split(";");
					results = results+ wordsinline[1]+" (email: "+wordsinline[2]+")"+System.lineSeparator();
					
				}
				
			return results;
			
			}

		


	}


