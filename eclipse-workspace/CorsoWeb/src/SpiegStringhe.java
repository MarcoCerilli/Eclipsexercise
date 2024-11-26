

public class SpiegStringhe {

	public static void main(String[] args) {
		String parola = "Carlo";

		// il metodo length ritorna il numero di caratteri presenti in una stringa
		int num = parola.length();

		System.out.println(num);
		// andiamo a stampare il carattere in posizone 3
		System.out.println(parola.charAt(3));

		//
		System.out.println(parola.indexOf("z"));

		// IMPORTANTE : il metodo di confronto equals serve a confrontare due stringhe
		System.out.println("carlo".equals(parola));

		System.out.println("carlo".equalsIgnoreCase(parola));

		String testo = "ciao,sono,Carlo";
		// con lo split otteniamo un array dalla parola splittata secondo un separatore
		String[] lista = testo.split(",");

		for (int i = 0; i < lista.length; i++) {

			System.out.println(lista[i]);
		}

	}

}
