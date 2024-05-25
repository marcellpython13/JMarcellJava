// Írj programot, amely bekér a felhasználótól egy helységnevet, valamint ennek a helységnek a 
// lélekszámát, és a megadott lélekszámtól függően kiírja, hogy az adott helység milyen 
// településtípusba tartozik. (telepules)
// - ha a lélekszám kevesebb, mint 5000, akkor község
// - ha a lélekszám legalább 5000, de kevesebb, mint 20 000, akkor kisváros
// - ha a lélekszám legalább 20 000, de kevesebb, mint 100 000, akkor középváros
// - ha a lélekszám legalább 100 000, de kevesebb, mint 1 000 000, akkor nagyváros
// - ha a lélekszám legalább 1 000 000, akkor metropolisz
// - ha a felhasználó 0 vagy annál kisebb számot ad meg, a program írja ki, hogy "Hibás adatbevitel!"!

package telepules;

import java.util.Scanner;

public class Telepules {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Helységnév: ");
		String helysegnev = sc.nextLine();
		System.out.print("Lélekszám: ");
		int lelekszam = Integer.parseInt(sc.nextLine());
		
		if (lelekszam>0 && lelekszam<5000) {
			System.out.println(helysegnev+" egy község.");
		} else if (lelekszam>=5000 && lelekszam<20000) {
			System.out.println(helysegnev+" egy kisváros.");
		} else if (lelekszam>=20000 && lelekszam<100000) {
			System.out.println(helysegnev+" egy középváros.");
		} else if (lelekszam>=100000 && lelekszam<1000000) {
			System.out.println(helysegnev+" egy nagyváros.");
		} else if (lelekszam>=1000000) {
			System.out.println(helysegnev+" egy metropolisz.");
		} else if (lelekszam<=0) {System.out.println("Hibás adatbevitel!");
		sc.close();
		}
	}
}