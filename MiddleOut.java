
public class MiddleOut {

	public static void main(String[] args) {
		// the purpose of this exercise is to count from the middle to both ends
		
		int full = 5000;
		int mid = full / 2;
		
		for(int i = 0; i < mid; i++) {
			if(i != 0) {	
				System.out.println(mid-i);
			}
			System.out.println(mid+i);
		}
		
	}

}
