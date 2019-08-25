import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordSeperator {

	public static void main(String[] args) throws FileNotFoundException {
		File dict = new File("dictionary.txt");
		Scanner ds = new Scanner(dict);
		Scanner kb = new Scanner(System.in);
		String root, checkMe = "";
		ArrayList<String> words = new ArrayList<String>();
		
		while(ds.hasNext()) {
			words.add(ds.nextLine());
		}
		
		
		System.out.println("Enter the phrase to seperate the words from: ");
		root = kb.nextLine();
		
		while(root.length() > 0) {
			checkMe = "";
			for(int i = 0; i < root.length(); i++) {
				checkMe = checkMe + root.charAt(i);
				
				for(int j = 0; j < words.size(); j++) {
					if(checkMe.contentEquals(words.get(j))) {
						System.out.println(checkMe);
						root = removeElement(checkMe, root);
						
					}
				}
			}
		 
		}
	}

	private static String removeElement(String checkMe, String root) {
		int chomp = checkMe.length();
		
		return root.substring(chomp, root.length());
		
	}
}
