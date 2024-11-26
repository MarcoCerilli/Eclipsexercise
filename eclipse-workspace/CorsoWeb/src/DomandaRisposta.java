

import java.util.Scanner;

public class DomandaRisposta {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Dimmi qualcosa: ");
		String frase = input.nextLine();
		char ultimo = frase.charAt(frase.length() - 1);

		if (ultimo == '!') {
			System.out.println("Hai proprio ragione!");
		} else if (ultimo == '?') {
			System.out.println("Non saprei...");
		} else {
			System.out.println("Mmmm, non mi convince...");
		}
		input.close();
	}
}