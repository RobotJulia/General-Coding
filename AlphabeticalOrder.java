import java.io.File;
import java.util.Scanner;

public class AlphabeticalOrder {

	public static void main(String[] args) {
		File file = new File("someWords.txt");
		String[] words = null; 
		String temp = "";
		Boolean doSwap = false;
		try {
			Scanner fs = new Scanner(file);
			while(fs.hasNext()) {
				words = fs.nextLine().split(",");		
			}
			
			
			for(int i = 0; i < words.length; i++) {	
				
				for(int j = 0; j < words.length; j++) {
					
					if(words[i].charAt(0) == words[j].charAt(0)) {
						doSwap = compareDepth(i, j, words);
						if(doSwap) {
							temp = words[i];
							words[i] = words[j];
							words[j] = temp;
						}
						doSwap = false;	
					}
					
					else if(words[i].charAt(0) < words[j].charAt(0)) {
						temp = words[i];
						words[i] = words[j];
						words[j] = temp;
					}
				}
			}
			
			fs.close();
			}
			catch (Exception e) {
				System.out.println("WHOOPS! -->" + e.getMessage());
			}
			
			
			// display results
			for(int i = 0; i < words.length - 1; i++) {
				System.out.print(words[i] + ", ");
			}
			System.out.print(words[words.length - 1]);
			System.out.println();
		
	}

	private static boolean compareDepth(int left, int right, String[] words) {
		// returns true if i > j
		for(int i = 0; i < words[i].length(); i++) {
			
			if(words[left].charAt(i) < words[right].charAt(i)) {
				return true;
			}	
			else if(words[left].charAt(i) == words[right].charAt(i)) {
				// let i increment
			}
			else {
				return false;
			}
		}
		
		return false;
	}
	

}
