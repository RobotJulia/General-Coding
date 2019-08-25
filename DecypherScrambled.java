import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class DecypherScrambled {

	public static void main(String[] args) throws Exception {
		String cmp, dict;
		File wl = new File("wordlist.txt");
		File test = new File("tester.txt");
		Scanner sc  = new Scanner(wl);
		Scanner tt = new Scanner(test);
		ArrayList<String> list = new ArrayList<String>();
		
		while(sc.hasNext()) {
			list.add(sc.nextLine());
		}
		
		while(tt.hasNext()) {
			cmp = tt.nextLine();
			//if(!cmp.contentEquals("\t")) {

				for(int i = 0; i < list.size(); i++) {
					dict = list.get(i);
					if(cmp.length() == dict.length()) {
						if(dict.contains(cmp.charAt(0) + "")) {
							compareWords(cmp, dict);
						}	
					}
				}
		}
		sc.close();
		tt.close();
	}

	private static void compareWords(String cmp, String dict) {
		String left, right;
		// sort each word alphabetically
		left = arrangeWord(cmp);
		right = arrangeWord(dict);
		
		// compare using .equals()
		if(left.equals(right)) {
			System.out.println(dict);
		}
	}

	private static String arrangeWord(String str) {
		String answer = "";
		char[] letters = new char[str.length()];
		char temp = ' ';
		for(int i = 0; i < str.length(); i++) {
			letters[i] = str.charAt(i);
		}
		
		for(int i = 0; i < letters.length; i++) {
			for(int j = 0; j < letters.length; j++) {
				if(letters[i] < letters[j]) {
					temp = letters[i];
					letters[i] = letters[j];
					letters[j] = temp;	
				}
			}
		}
		
		for(int i = 0; i < letters.length; i++) {
			answer = answer + letters[i];
		}
		
		return answer;
	}

}


