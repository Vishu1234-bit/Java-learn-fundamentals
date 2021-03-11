import java.util.Scanner;
import java.util.Arrays;
public class amountOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
	    String s = sc.nextLine();
	    int amountOfWords = getWordsAmount(s);
		System.out.println("Amount of words in your text: " + amountOfWords);

	}
	private static int getWordsAmount(String text) {
		//System.out.print(text);
		String[] s = text.split(" ");
		//System.out.print(Arrays.toString(s));
		return s.length;
	}

}
