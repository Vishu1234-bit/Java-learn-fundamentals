import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class emailaddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gmailaddress = "[a-zA-z-\\d]+@gmail\\.com";
		String sampletext = "This is my email address. Pls contact to this email-   rvishali1610@gmail.com";
		Pattern p = Pattern.compile(gmailaddress);
		Matcher m = p.matcher(sampletext);
		m.find();
		String Email = m.group();
		System.out.println("The email address detected is:"+Email);
		String para = "Need more than one sentence? You can specify how many sentences you need by changing the last number in the Rand statement. For example, if you needed five sentences, you could type this–\n =Rand(1,5) ";
		String[] sentence = para.split("[\\.!,?=]");
		System.out.println(Arrays.toString(sentence));
		

	}

}
