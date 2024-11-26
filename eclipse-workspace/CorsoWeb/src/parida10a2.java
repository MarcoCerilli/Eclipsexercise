

import java.util.Scanner;

public class parida10a2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int scelta = 0;
		do {
			System.out.print("Scrivi qualsiasi numero, 0 per terminare");
			scelta = input.nextInt();
			for (int i = 10; i >= 0; i--) {
				if (i % 2 == 0) {
					System.out.println(i);
				}
			}

		} while (scelta != 0);
	}

}
