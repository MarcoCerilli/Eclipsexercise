

import java.util.Scanner;

public class Pappagallo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String frase = "";
		do {

			System.out.println("Dimmi qualcosa: ");
			frase = input.next();
			System.out.println(frase);

		} while (!frase.equals(""));
	}

}
