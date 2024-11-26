
import java.util.Scanner;

public class Festività {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		System.out.print("Inserisci il giorno: ");
		int giorno = input.nextInt();
		System.out.print("Inserisci il mese: ");
		int mese = input2.nextInt();
		if (giorno == 1 && mese == 1) {
			System.out.print("Capodanno");
		} else if (giorno == 6 && mese == 1) {
			System.out.print("Epifania");
		} else if (giorno == 15 && mese == 8) {
			System.out.print("Ferragosto");
		} else if (giorno == 25 && mese == 12) {
			System.out.print("Natale");
		} else {
			System.out.print("Non è una festività");
		}
	}

}
