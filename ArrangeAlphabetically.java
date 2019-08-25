
public class ArrangeAlphabetically {

	public static void main(String[] args) {
		String answer = "";
		String str = "gfedcaba"; // abcdefg backwords + a
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
				else {
					// do nothing
				}
			}
		}
		
		for(int i = 0; i < letters.length; i++) {
			answer = answer + letters[i];
		}
		
		System.out.println(answer);
	}

}
