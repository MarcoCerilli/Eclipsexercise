
import java.util.Scanner;
public class Divisione {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		System.out.print("Inserisci primo numero: ");
		int num = input.nextInt();
		System.out.print("Inserisci secondo numero: ");
		int num2 = input.nextInt();
		System.out.print("Il quoziente dei due numeri è " + (num / num2) + " col resto di " + (num % num2) + ".");

	}

}
