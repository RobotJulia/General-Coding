import java.util.Scanner;

public class ceasarCipher {

	public static void main(String[] args) {
		int choice = 0;
		Scanner kb = new Scanner(System.in);
		
		while(choice != 3) {
			choice = displayMenu(kb);
			if(choice == 1) {
				encodeString(kb);
			}
			else if(choice == 2) {
				decodeString(kb);
			}
		}
		System.out.println("goodbye");
	}

	private static void decodeString(Scanner kb) {
		System.out.println("enter the text to decypher");
		String decodeMe = kb.nextLine(), result = "";
		int rotateBy = 0;
		char rotateMe = ' ';
		for(int j = 1; j <= 25; j++) {
			rotateBy = j;
			result = "";
			for(int i = 0; i < decodeMe.length(); i++) {
					rotateMe = decodeMe.charAt(i);
					if(rotateMe == ' ') {
						// leave spaces alone
					}
					
					else if(((int)(rotateMe + rotateBy)) >= 123) {
						rotateMe = (char)(rotateMe - 26 + rotateBy);
					}
					
					else {
						rotateMe = (char)(rotateMe + rotateBy);
					}
					result = result + rotateMe;
				}
				
				System.out.println(result);
		}
		System.out.println();
	}

	
	
	private static void encodeString(Scanner kb) {
		String text = "", result = "";
		int rotateBy;
		char temp = ' ';
		char[] textAra;
		
		System.out.println("Enter the phrase you would like to have encoded:");
		text = kb.nextLine();
		System.out.println("How many letters would you like to rotate by? (1-25)");
		rotateBy = Integer.parseInt(kb.nextLine());
		
		textAra = new char[text.length()];
		for(int i = 0; i < text.length(); i++) {
			textAra[i] = text.charAt(i);
		}
		
		for(int i = 0; i < textAra.length; i++) {
			
			if(textAra[i] != ' ') {
				
				if(((int)(textAra[i] + rotateBy)) >= 123) {
					textAra[i] = (char)(textAra[i] - 26 + rotateBy);
				}
				
				else {
					textAra[i] = (char)(textAra[i] + rotateBy);
				}			
			}
		}
		
		for(int j = 0; j < textAra.length; j++) {
			result = result + textAra[j];
		}
		System.out.println(result);
		
	}

	private static int displayMenu(Scanner kb) {
		int option = 0;
		System.out.println("Welcome to another ceasar cracker, what would you like to do?");
		System.out.println("1. ceaser encode");
		System.out.println("2. ceaser decode");
		System.out.println("3. quit");
		option = Integer.parseInt(kb.nextLine());
		return option;
	}

}
