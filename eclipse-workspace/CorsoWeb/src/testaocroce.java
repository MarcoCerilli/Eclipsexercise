

import java.util.Scanner;

public class testaocroce {
	
	
	public static void main(String[] args) {
		
		Scanner input= new Scanner (System.in);
		
			int range = (0 - 1 ) + 1;
	 
			int random= (int) ((range * Math.random()) + 0);
			
			System.out.println(" Scegli 0 per Testa  o 1 per Croce: "); 
			
		    int num= input.nextInt();
		
			if  (num  == random) {
				System.out.println ("Hai vinto");
			}
		
			else { 
				
			System.out.println("Hai Perso: ");
			}
				
				
				

		

	}

}
