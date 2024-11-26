

import java.util.Scanner;

public class parida10a1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int scelta = 0;
		int num = 10;
		do {
			System.out.print("Scrivi qualsiasi numero, 0 per terminare: ");
			scelta = input.nextInt();
			if (num % 2 == 0) {
				System.out.print(num);
			}
			num--;

		} while (num >= 0 && scelta != 0);
	}

}
