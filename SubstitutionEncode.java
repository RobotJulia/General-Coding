import java.io.File;
import java.util.Scanner;

public class SubstitutionEncode {

	public static void main(String[] args) throws Exception {
		// this one we get the key from "key.txt"
		// and encode the message from input.
		char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		char[] key = new char[26];
		File file = new File("key.txt");
		Scanner fs = new Scanner(file);
		Scanner kb = new Scanner(System.in);	
		char temp = ' ';
		String result = "";
		
		System.out.println("Enter the message to be encoded");
		char[] message = kb.nextLine().toCharArray();
		kb.close();
		for(int i = 0; i < key.length; i++) {
			key[i] = fs.nextLine().charAt(4);
		}
		fs.close();
		for(int i = 0; i < message.length; i++) {
			for(int j = 0; j < alphabet.length; j++) {
				if(message[i] == alphabet[j]) {
					temp = key[j];
				}
				else if(message[i] == ' ') {
					temp = ' ';
				}
				
			}
			result = result + temp;
		}
		System.out.println(result);
	}

}
