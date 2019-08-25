import java.util.Scanner;

public class AlphaTeleNumberTranslator {

	public static void main(String[] args) {

		translateNumber(new Scanner(System.in));
	}

	private static void translateNumber(Scanner kb) {
		String result = "";
		System.out.println("enter the phrase to be translated");
		String translate = kb.nextLine().toLowerCase();
		
		for(int i = 0; i < translate.length(); i++) {
			if(translate.charAt(i) == 'a' || translate.charAt(i) == 'b' || translate.charAt(i) == 'c') {
				result = result + "2";
			}
			else if(translate.charAt(i) == 'd' || translate.charAt(i) == 'e' || translate.charAt(i) == 'f') {
				result = result + "3";
			}
			else if(translate.charAt(i) == 'g' || translate.charAt(i) == 'h' || translate.charAt(i) == 'i') {
				result = result + "4";
			}
			else if(translate.charAt(i) == 'j' || translate.charAt(i) == 'k' || translate.charAt(i) == 'l') {
				result = result + "5";
			}
			else if(translate.charAt(i) == 'm' || translate.charAt(i) == 'n' || translate.charAt(i) == 'o') {
				result = result + "6";
			}
			else if(translate.charAt(i) == 'p' || translate.charAt(i) == 'q' || translate.charAt(i) == 'r' || translate.charAt(i) == 's') {
				result = result + "7";
			}
			else if(translate.charAt(i) == 't' || translate.charAt(i) == 'u' || translate.charAt(i) == 'v') {
				result = result + "8";
			}
			else if(translate.charAt(i) == 'w' || translate.charAt(i) == 'x' || translate.charAt(i) == 'y' || translate.charAt(i) == 'z') {
				result = result + "9";
			}
			else {
				result = result + translate.charAt(i);
			}
		}
		
		// pretty-print result
		for(int i = 0; i < 3; i++) {
			System.out.print(result.charAt(i));
		}
		System.out.print("-");
		for(int i = 3; i < 6; i++) {
			System.out.print(result.charAt(i));
		}
		System.out.print("-");
		for(int i = 6; i < result.length(); i++) {
			System.out.print(result.charAt(i));
		}
		System.out.println();
	}

}
