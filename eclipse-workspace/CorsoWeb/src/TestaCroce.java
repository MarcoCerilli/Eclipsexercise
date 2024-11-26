

import java.util.Scanner;

public class TestaCroce {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int random = (int) Math.round(Math.random());

		System.out.println("Scegli: testa 0 o croce 1 : ");
		int scelta = input.nextInt();

		if (scelta != 0 && scelta != 1) {
			System.out.println("Scelta non valida! Inserisci 0 per testa o 1 per croce.");
		} else {
			String risultato = "";
			if (random == 0) {
				risultato = "Testa";
			} else {
				risultato = "Croce";
			}

			System.out.println("Il risultato del lancio è: " + risultato);

			if (scelta == random) {
				System.out.println("Hai vinto!");
			} else {
				System.out.println("Hai perso!");
			}
		}

		input.close();
	}
}
