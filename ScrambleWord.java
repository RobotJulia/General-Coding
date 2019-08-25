import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScrambleWord {

	public static void main(String[] args) throws Exception {
		int number = 0;
		String word = "", result = "";	
		File file = new File("wordlist.txt");
		Scanner sc = new Scanner(file);
		ArrayList<String> list = new ArrayList<String>();
		
		while(sc.hasNext()) {
			list.add(sc.nextLine());
		}
		
		for(int i = 0; i < 10; i++) {
			number = (int) (list.size() * Math.random());
			word = list.get(number);
			result = shuffle(word);
			System.out.println(result);
		}
		
	}

	
	
	
	
	private static String shuffle(String word) {
		String[] letters = new String[word.length()];
		String temp = "", result = "";
		int number = 0;
		
		for(int i = 0; i < letters.length; i++) {
			letters[i] = "" + word.charAt(i);
		}
		
		for(int i = 0; i < letters.length; i++) {
			number = (int) (letters.length * Math.random());
			temp = letters[number];
			letters[number] = letters[i];
			letters[i] = temp;
		}
		
		for(int j = 0; j < letters.length; j++) {
			result = result + letters[j];
		}
		
		return result;
	}

}
