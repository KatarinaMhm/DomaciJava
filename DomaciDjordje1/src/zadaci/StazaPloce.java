package zadaci;

import java.util.Scanner;

public class StazaPloce {

	public static void StazeIPloce() {

		Scanner input = new Scanner(System.in);

		System.out.println("Koliko metara je dugacka staza?");
		Double staza = input.nextDouble();

		System.out.println("Koliko metara je dugacka ploca?");
		Double ploca = input.nextDouble();

		int brojPloca = (int) (staza / ploca);

		System.out.print("Potreban broj celih ploca je " + brojPloca + ". ");

		Double ostatak = ploca - staza % ploca;
		if (ostatak != 0) {
			System.out.println("A potrebno je i " + ostatak + " metara od dodatne ploce.");
		}

		input.close();
	}

}
