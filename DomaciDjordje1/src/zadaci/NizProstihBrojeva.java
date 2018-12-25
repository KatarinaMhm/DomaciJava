package zadaci;

import java.util.Scanner;

public class NizProstihBrojeva {

//	Napraviti funkciju koja za zadati ceo broj ispituje da li je prost ili ne. U glavnom delu programa (MAIN) ucitati niz celih brojeva, pa potom od njega kreirajte novi niz od elemenata koji su prosti.
//	   Ispisati novodobijeni niz.

	public static Boolean prostBroj(int n) {

		boolean prostBroj = false;

		if (n == 1 || n == 2 || n == 3) {
			return true;
		}

		int pola = n / 2;

		for (int i = 2; i <= pola; i++) {
			if (n % i != 0) {
				if (i == pola) {
					prostBroj = true;
				}
			} else if (n % i == 0) {
				prostBroj = false;
				break;
			}

		}
		return prostBroj;
	}

	public static void nizProstihBrojeva() {
		Scanner input = new Scanner(System.in);
		System.out.println("Koliko je brojeva u vasem nizu?");
		int nizBr = input.nextInt();

		int nizBrojeva[] = new int[nizBr];

		for (int i = 0; i < nizBr; i++) {
			System.out.println("Unesite " + (i + 1) + ". broj.");
			nizBrojeva[i] = input.nextInt();
		}

		int nizProstihBrojeva[] = new int[nizBr];
		int k = 0;

		for (int i = 0; i < nizBr; i++) {
			if (prostBroj(nizBrojeva[i]) == true) {
				nizProstihBrojeva[k++] = nizBrojeva[i];
				System.out.println("prost broj je " + nizBrojeva[i]);
			}
		}

		for (int i = 0; i < nizBr; i++) {
			System.out.print(nizProstihBrojeva[i] + " ");
		}

	}

}
