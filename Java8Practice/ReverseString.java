package Java8Practice;

public class ReverseString {

	public static String getReverse(String str) {
		String reverseString ="";
		for(int i = str.length()-1;i>=0;i--) {
			reverseString = reverseString+str.charAt(i);
		}
		return reverseString;
	}

	
	public static String getRecursiveString(String str) {
		if(str.length()==1) {
			return str.charAt(str.length()-1)+"";
		}
		return str.charAt(str.length()-1)+getRecursiveString(str.substring(0,str.length()-1));
	}
	public static void main(String[] args) {
		//System.out.println(getReverse("String String"));
		System.out.println(getRecursiveString("Strinhjhjngfyt"));
	}
}
