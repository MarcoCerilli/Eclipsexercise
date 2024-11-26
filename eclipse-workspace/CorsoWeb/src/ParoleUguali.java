

import java.util.Scanner;

public class ParoleUguali {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		System.out.println("Scegli la prima parola: ");
		String parola1 = input.next();
		System.out.println("Scegli la seconda parola: ");
		String parola2 = input2.next();
		if (parola1.equalsIgnoreCase(parola2)) {
			System.out.print("Sono uguali");
		} else
			System.out.print("Non sono uguali");

	}

}
