import java.util.ArrayList;
import java.util.Scanner;

public class BingoCaller {

	public static void main(String[] args) {
		int[] bingo = new int[100];
		Scanner kb = new Scanner(System.in);

		// load the list with numbers 1-99
		for(int i = 0; i < 100; i++) {
			bingo[i] = i+1;
		}
		
		
		System.out.println("Let's play bingo! Press enter for next number.");
		
		shuffleList(bingo);
			
		displayNums(bingo, kb);
		
	}

	private static void shuffleList(int[] bingo) {
		int temp, rand;
		for(int i = 0; i < bingo.length; i++) {
			
			rand = (int)(Math.random()*bingo.length);			
			temp = bingo[i];
			bingo[i] = bingo[rand];
			bingo[rand] = temp;
			
		}

	}

	private static void displayNums(int[] bingo, Scanner kb) {
			int num = 0;
		for(int i = 0; i < bingo.length; i++) {
			num = bingo[i];
			// B
			if(num <= 19) {
				System.out.println("B-" + num);
			}
			// I
			if(num <= 39 && num > 19) {
				System.out.println("I-" + num);
			}
			// N
			if(num <= 59 && num > 39) {
				System.out.println("N-" + num);
			}
			// G
			if(num <= 79 && num > 59) {
				System.out.println("G-" + num);
			}
			// O
			if(num <= 99 && num > 79) {
				System.out.println("O-" + num);
			}
			kb.nextLine();
		}
		System.out.println("Someone must have a BINGO! All the numbers have been called!");
		kb.close();
	}

}
