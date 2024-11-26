
import java.util.Scanner;

public class SommaProdotto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il primo numero: ");
		int num1 = input.nextInt();
		Scanner input2 = new Scanner(System.in);
		System.out.println("Inserisci il secondo numero: ");
		int num2 = input2.nextInt();
		System.out.println("Somma: " + (num1 + num2));
		System.out.println("Prodotto: " + (num1 * num2));
	}

}
