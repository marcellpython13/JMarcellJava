// Kérjük be a felhasználó életkorát, majd döntsük el, hogy felnőtt–e (18 éves kortól már felnőtt)! 
package felnott_e;

import java.util.Scanner;

public class FelnottE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Életkor (év): ");
		int eletkor = Integer.parseInt(sc.nextLine());
		if (eletkor<18) {
			System.out.println("Gyerek.");
		} else if (eletkor>=18) {
			System.out.println("Felnőtt.");
		}
		sc.close();
	}
}