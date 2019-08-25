import java.util.Scanner;

public class SimpleXor {

	public static void main(String[] args) {
		String message, key, result = "", verify = "";
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a message to xor:");
		message = kb.nextLine();
		System.out.println("Enter a key (of the same length for now):");
		key = kb.nextLine();
		
		for(int i = 0; i < message.length(); i++) {
			result = result + " " + (message.charAt(i) ^ key.charAt(i));
			
		}
		
		System.out.println(result);
		
		verifyXor(message, key, result);
	}

	private static void verifyXor(String message, String key, String r) {
		String[] cmpStr = r.split(" ");
		int num;
		char xorMe;
		String result = "";
		
		for(int i = 1; i < cmpStr.length; i++) {
			num = Integer.parseInt(cmpStr[i]);
			xorMe = key.charAt(i - 1);
			result = result + (char)(num ^ xorMe);
		}
		
		System.out.println(result);
	}

}
