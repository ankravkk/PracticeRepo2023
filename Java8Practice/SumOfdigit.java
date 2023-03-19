package Java8Practice;

public class SumOfdigit {

	public static int getSumOfDigit(int n ) {
		int sum = 0 ; 
		while(n>0) {
			sum = sum+n%10;
			n=n/10;
		}
		return sum ;
	}
	
	private static int  getSumOfDigitRecursively(int n) {
		if( n==0 ) {
			return n;
		}
		return n%10+getSumOfDigitRecursively(n/10);
		
	}
	
	public static void main(String[] args) {
		System.out.print(getSumOfDigit(2112311)+"\n");
		System.out.print(getSumOfDigit(2112311));
	}
}
