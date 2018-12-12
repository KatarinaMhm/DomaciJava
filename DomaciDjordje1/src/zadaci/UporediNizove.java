package zadaci;

import java.util.Scanner;

public class UporediNizove {

	public static void UporediBA() {
		Scanner input = new Scanner(System.in);
		System.out.println("Broj clanova niza:");
		int brojClanova = input.nextInt();

		int nizA[] = new int[brojClanova];
		int nizB[] = new int[brojClanova];

		System.out.println("Unesite niz a:");
		for (int i = 0; i < brojClanova; i++) {
			System.out.println("Clan " + (i + 1) + ":");
			nizA[i] = input.nextInt();
		}

		System.out.println("Unesite niz b:");
		for (int i = 0; i < brojClanova; i++) {
			System.out.println("Clan " + (i + 1) + ":");
			nizB[i] = input.nextInt();
		}

		int brojac = 0;

		for (int i = 0; i < brojClanova; i++) {
			for (int j = 0; j < brojClanova; j++) {
				if (nizB[i] == nizA[j]) {
					brojac++;
				}
			}
		}

		if (brojac == brojClanova) {
			System.out.println("Svi clanovi niza b su zastupljeni u nizu a.");
		} else {
			System.out.println("Nisu svi clanovi niza b zastupljeni u nizu a.");
		}
	}
}
