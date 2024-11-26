
import java.util.Scanner;

public class Calcolatrice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		System.out.print("Scrivi il primo numero: ");
		double num1 = input.nextDouble();
		System.out.print("Scrivi il secondo numero: ");
		double num2 = input2.nextDouble();
		System.out.print("Scegli operazione: 1 per sommare, 2 per sottrarre, 3 per moltiplicare e 4 per dividere: ");
		int op = input2.nextInt();
		if(op == 1) {
			System.out.print("La somma dei due numeri è: " + (num1 + num2));
		} else if(op == 2) {
			System.out.print("La sottrazione dei due numeri è: " + (num1 - num2));
		} else if(op == 3) {
			System.out.print("Il prodotto dei i due numeri è: " + (num1 * num2));
		} else if (op == 4) {
			System.out.print("Il quoziente dei i due numeri è " + (num1 / num2));
		}
	}

}
