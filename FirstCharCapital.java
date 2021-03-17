import java.util.Scanner;
public class FirstCharCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner sc = new Scanner(System.in);
				System.out.print("Please, enter any text: ");
				String userInput = sc.nextLine();
				
				
				System.out.println(firstCharToTitleCase(userInput));
			}

			public static String firstCharToTitleCase(String string) {
				//<write your code here>
				char[] words = string.toLowerCase().toCharArray();
				boolean found = false;
				for(int i=0;i<words.length;i++) {
					//System.out.println(words[i]);
					if(!found && Character.isLetter(words[i])) {
						words[i]= Character.toUpperCase(words[i]);
						//System.out.println(words[i]);
						found=true;
					}
					else if (Character.isWhitespace(words[i])) {
						found=false;
					}
				}
				return String.valueOf(words);		
			}
		

	}


