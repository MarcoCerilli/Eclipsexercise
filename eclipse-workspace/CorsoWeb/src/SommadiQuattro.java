

import java.util.Scanner;

public class SommadiQuattro {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		Scanner input4 = new Scanner(System.in);
		System.out.print("Inserisci il primo numero: ");
		int somma = 0;
		int num = input.nextInt();
		somma += num;
		System.out.print("Inserisci il secondo numero: ");
		num = input2.nextInt();
		somma += num;
		System.out.print("Inserisci il terzo numero: ");
		num = input3.nextInt();
		somma += num;
		System.out.print("Inserisci il quarto numero: ");
		num = input4.nextInt();
		somma += num;
		System.out.println("La somma dei 4 numeri è: " + somma);
	}

}
