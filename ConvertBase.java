import java.util.Scanner;

public class ConvertBase {

	public static void main(String[] args) {
		int option = 0;
		Scanner kb = new Scanner(System.in);
		
		while(option != 5) {
			option = displayMenu(kb);
			if(option == 1) {
				binaryConvert(kb);
			}
			if(option == 2) {
				octalConvert(kb);
			}
			if(option == 3) {
				hexConvert(kb);
			}
			if(option == 4) {
				selectBase(kb);
			}
		}
		
		System.out.println("goodbye");
	}

	private static void selectBase(Scanner kb) {
		int base = 0;
		int num = 0, rem = 0;
		String result = "";
		// max 36
		char alphaAra[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};		
		System.out.println("What base would you like to convert to?");
		base = Integer.parseInt(kb.nextLine());
		System.out.println("What number would you like to convert?");
		num = Integer.parseInt(kb.nextLine());
		
		while(num > 0) {
			rem = num % base;
			result = alphaAra[rem] + result;
			num = num / base;
		}
		System.out.println(result);
		
	}

	private static void hexConvert(Scanner kb) {
		int num = 0, rem = 0;
		char hexAra[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		String result = "";
		System.out.println("What number would you like to convert?");
		num = Integer.parseInt(kb.nextLine());
		
		while(num > 0) {
			rem = num % 16;
			result = hexAra[rem] + result;
			num = num / 16;
		}
		System.out.println(result);
	}

	private static void octalConvert(Scanner kb) {
		int num = 0, rem = 0;
		String result = "";
		System.out.println("What number would you like to convert?");
		num = Integer.parseInt(kb.nextLine());
		
		while(num > 0) {
			rem = num % 8;
			result = rem + result;
			num = num / 8;
		}
		System.out.println(result);
	}

	private static void binaryConvert(Scanner kb) {
		int num = 0, rem = 0;
		String result = "";
		System.out.println("What number would you like to convert?");
		num = Integer.parseInt(kb.nextLine());
		
		while(num > 0) {
			rem = num % 2;
			result = rem + result;
			num = num / 2;
		}
		System.out.println(result);
	}

	private static int displayMenu(Scanner kb) {
		int choice = 0;
		System.out.println("Choose from the following conversion methods: ");
		System.out.println("1. Binary");
		System.out.println("2. Octal");
		System.out.println("3. Hex");
		System.out.println("4. Base N");
		System.out.println("5. Quit");;
		choice = Integer.parseInt(kb.nextLine());
		return choice;
		
	}

}
