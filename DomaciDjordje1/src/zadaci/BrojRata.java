package zadaci;

import java.util.Scanner;

public class BrojRata {

	public static void Rate() {
	 
	 Scanner input = new Scanner(System.in);
	 
	 System.out.println("Unesite cenu proizvoda.");
	 int cena = input.nextInt();
	 
	 double cenaBezUcesca = cena - (cena / 10);
	 int brojRata = 0;
	 
	 if (cenaBezUcesca % 1000 == 0) {
		 brojRata = (int) cenaBezUcesca / 1000;
	 } else {
		 brojRata = ((int) cenaBezUcesca / 1000) + 1;
	 }
	 
	 double rata = cenaBezUcesca / brojRata;
	 
//	 System.out.println("Ucesce: " + (cena / 10));
//	 System.out.println("Cena bez ucesca: " + cenaBezUcesca);
	 System.out.println("Broj rata: " + brojRata);
	 System.out.println("Mesecna rata: " + rata);
	 
 }

}
