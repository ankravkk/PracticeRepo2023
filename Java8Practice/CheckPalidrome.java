package Java8Practice;

public class CheckPalidrome {


	public static boolean isPalidrome(int num) {
		boolean isPalidrome = false;

		int reverse = 0 ;
		int counter = 0 ; 
		int remender = 0 ;
		while(num!=0){
		    remender = num%10;
			reverse = remender+10*reverse;
			num=num/10;
		}
		if (reverse==num) {
			return true;
		}
		return isPalidrome;
	}
	public static boolean isPalidromeRecursive(int num) {
		
	if(num==0) {
		return true;
	}
		return isPalidrome(num/10);
	}
	
	

	public static void main(String[] args) {
       
		System.out.println(isPalidrome(121));
	}

}
