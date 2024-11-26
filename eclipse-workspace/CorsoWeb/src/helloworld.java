 // nome della cartella, è sempre diverso
import java.util.Scanner; // importiamo l'oggetto Scanner, che sarebbe prompt di javascript
public class helloworld { // nome della classe

	public static void main(String[] args) {  // qui dentro va il codice
 
 
		System.out.println("Ciao mondo!!!"); // è uguale a console.log("Ciao mondo!!!")	
 
		// variabili numeriche in java
	    // numeri interi
		int num = 5;
 
		// numeri con la virgola
		double num1 = 5.3;
		
		// le costanti final
		final int  num2 = 6;
 
 
		// le stringhe
		String parola = "ciao";
 
		/*
		 * 
		 * sono un commento su più lineee
		 */
 
 
		// booleani
		boolean ok = true;
 
		System.out.println(num + " " + num1 + " " + num + " " + parola);
 
		// System.out.print è equivalente a println ma non va a capo
 
 
 
		System.out.print(ok);
		System.out.print("ciao");
		System.out.println("");
		
		// Creiamo un oggetto Scanner che ci permetterà di leggere l'input dell'utente
		Scanner input = new Scanner(System.in);

		// Mostriamo un messaggio all'utente, chiedendogli di scrivere il suo nome
		System.out.println("Scrivi il tuo nome: "); 

		// Usiamo il metodo next() dell'oggetto Scanner per leggere una parola scritta dall'utente (fino a uno spazio o invio)
		// Il valore inserito viene memorizzato nella variabile di tipo String chiamata 'nome'
		String nome = input.next(); 

		// Stampiamo un messaggio di benvenuto concatenando la stringa "Benvenuto" con il nome fornito dall'utente
		System.out.println("Benvenuto " + nome);
 
 
 
 
	}
}
