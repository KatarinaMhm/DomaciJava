package zadaci;

import java.util.Scanner;

public class IzvrsenjeZadataka {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("-----Izaberi zadatak za izvrsenje-----");
		System.out.println("     1 - Molekuli sumporne kiseline");
		System.out.println("     2 - Broj ploca na stazi");
		System.out.println("     3 - Okreni niz");
		System.out.println("     4 - Uporedi niz b sa nizom a");
		System.out.println("     5 - Prosti brojevi iz niza");
		System.out.println("     6 - Proizvodi i rate");
		
		int izbor = input.nextInt();

		switch (izbor) {
		case 1:
			H2SO4.SumpKis();
		case 2:
			StazaPloce.StazeIPloce();
		case 3:
			OkreniNiz.OkreniNiz();
		case 4:
			UporediNizove.UporediBA();
		case 5:
			NizProstihBrojeva.nizProstihBrojeva();
		case 6:
			BrojRata.Rate();
		}
	}

}
