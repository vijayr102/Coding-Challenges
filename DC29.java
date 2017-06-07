import java.util.regex.Pattern;


public class DC29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="12345";
		String s1="123456";	
		String s2="123.45";
		String p="\\d\\d\\d\\d\\d";
		System.out.println(Pattern.matches(p, s));
		System.out.println(Pattern.matches(p, s1));	
		System.out.println(Pattern.matches(p, s2));	
		
	}

}