import java.util.Scanner;

public class MaxOut {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int i = 1, lasti = 0;
		
		while(i > 0) {
			lasti = i;
			i++;
		}
		
		System.out.println(lasti + " is the biggest int I can hold.");
		
		// largest double value
		System.out.print("1");
		for(int j = 0; j < 307; j++) {
			System.out.print("0");
		}

	}
}
