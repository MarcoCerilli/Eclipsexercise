

import java.util.Scanner;

public class Giudizio {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Inserisci il voto: ");
		int voto = input.nextInt();
		boolean sufficiente = false;
		if (voto < 0 || voto > 30) {
			System.out.print("Voto errato");
		} else if (voto >= 0 && voto <= 17) {
			System.out.print("Esame non superato");
		} else if (voto >= 18 && voto <= 21) {
			System.out.println("Giudizio: sufficiente");
			sufficiente = true;
		} else {
			System.out.println("Giudizio: buono");
			sufficiente = true;
		}
		if (sufficiente) {
			Scanner input2 = new Scanner(System.in);
			System.out.print("Digita 1 se vuoi registrare il tuo voto, altrimenti digita 0: ");
			int registra = input2.nextInt();
			if (registra == 1) {
				System.out.print("Voto accettato");
			} else if (registra == 0) {
				System.out.print("Voto rifiutato");
			} else {
				System.out.print("Non hai scelto un'opzione valida");
			}
		}

	}

}