import java.util.Scanner;

public class IsBinary {

	public static void main(String[] args) {
		String testMe = "";
		Scanner kb = new Scanner(System.in);
	
		System.out.println("Enter a number to check if it is binary or not:");
		
		testMe = kb.nextLine();
		
		binaryTest(testMe);
	}

	private static void binaryTest(String num) {
		char[] ara = num.toCharArray();
		char c = ' ';
		for(int i = 0; i < ara.length; i++) {
			c = ara[i];
			if(c != '1' && c != '0') {
				System.out.println("Not a binary number");
				System.exit(0);
			}
		}
		//else 
		System.out.println("It is a binary number");
		
	}
}
