package zadaci;

import java.util.Scanner;

public class OkreniNiz {

	public static void OkreniNiz() {
		Scanner input = new Scanner(System.in);
		System.out.println("Koliko clanova ima vas niz?");
		int n = input.nextInt();
		
		int niz[] = new int[n];
		int nizObrnuti[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Unesite " + (i + 1) + ". clan niza.");
			niz[i] = input.nextInt();
		}

		for (int i = 0; i < n; i++) {
			nizObrnuti[n - 1 - i] = niz[i];
		}
		
		System.out.println("Obrnuti niz:");
		for (int i = 0; i < n; i++) {
			System.out.print(nizObrnuti[i] + " ");
		}
	}
	
}
