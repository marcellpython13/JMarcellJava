package tanulo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tanulo {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public void adatbekeresEsKiiras() throws IOException {
		System.out.print("Vezetéknév: ");
		String vezetekNev = br.readLine();
		System.out.print("Keresztnév: ");
		String keresztNev = br.readLine();
		System.out.print("Átlag: ");
		double atlag = Double.parseDouble(br.readLine());
		System.out.println();
		System.out.println("vezetéknév: "+vezetekNev);
		System.out.println("keresztnév: "+keresztNev);
		System.out.println("átlag: "+atlag);

		if (atlag < 0 || atlag > 5) {
			System.out.println("Hibás értéket adott meg.");
		}
	}
	
	public void ertesites() {
		if (atlag < 2) {
			System.out.println("Értesíteni kell a szülőt.");
		}
	}
	
	public void dicseret() {
		if (atlag > 4.5) {
			System.out.println("Dicséretet kap.");
		}
	}
}