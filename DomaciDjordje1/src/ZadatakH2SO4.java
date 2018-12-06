import java.util.Scanner;

public class ZadatakH2SO4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Koliko je molekula vodonika?");
		Integer h = input.nextInt();

		System.out.println("Koliko je molekula sumpora?");
		Integer s = input.nextInt();
		
		System.out.println("Koliko je molekula kiseonika?");
		Integer o = input.nextInt();
		
		Integer brojMolekula = 0;
		
		while (h >= 2 && s >= 1 && o >= 4) {
			brojMolekula++;
			h = h - 2;
			s = s - 1;
			o = o - 4;
		}
		
		System.out.println("Broj molekula sumporne kiseline je " + brojMolekula + ".");

		if (h == 0) {
			System.out.println("Nije ostalo atoma vodonika.");
		} else {
			System.out.println("Ostalo je " + h + " atoma vodonika.");
		}
		
		if (s == 0) {
			System.out.println("Nije ostalo atoma sumpora.");
		} else {
			System.out.println("Ostalo je " + s + " atoma sumpora.");
		}
		
		if (o == 0) {
			System.out.println("Nije ostalo atoma kiseonika.");
		} else {
			System.out.println("Ostalo je " + o + " atoma kiseonika.");
		}
		
		input.close();
	}

}
