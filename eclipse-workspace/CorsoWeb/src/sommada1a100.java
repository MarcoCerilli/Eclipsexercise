

import java.util.Scanner;

public class sommada1a100 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int scelta = 0;
		int somma = 0;
		do {
			System.out.println("Digita qualsiasi numero per continuare, 0 per terminare");
			scelta = input.nextInt();
			for (int i = 1; i <= 100; i++) {
				somma += i;
			}
			System.out.println("La somma dei numeri da 1 a 100 è: " + somma);
			somma = 0;
		} while (scelta != 0);
	}

}
