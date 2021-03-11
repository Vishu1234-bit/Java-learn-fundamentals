import java.util.Scanner;
import java.util.Arrays;
public class filterArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any words separated by space: ");
		String userInput = sc.nextLine();
		System.out.print("Please, enter minumum word length to filter words: ");
		int minLength = sc.nextInt();
		
		String[] words = userInput.split("\\s+");
		String[] filteredWords = filterWordsByLength(minLength, words);
		System.out.println(Arrays.toString(filteredWords));
	}
	public static String[] filterWordsByLength(int minLength, String[] words) {
		String[] out = new String[words.length];
		int j=0;
		for(String i:words){
		    if(i.length() >=minLength){
		        out[j++]=i;
		    }
	
}
		out = filterNulls(out);
		return out;
	}
	public static String[] filterNulls(String[] out) {
		int len=0;
		for(String i:out) {
			if(i!=null) {
				len+=1;
			}
		}
		String[] filterArray =new String[len];
		int j =0;
		for(String i:out) {
			if(i!=null) {
				filterArray[j++]=i;
			}
		}
		return filterArray;
	}
}
