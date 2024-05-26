// A postai küldeményeket súlyuk alapján árazzák (2 kg-ig 475 Ft, 20 kg-ig 3395 Ft, 40 kg-ig 
// 6415 Ft). Készíts alkalmazást, ami bekéri a küldemény súlyát, majd kiírja a fizetendő összeget! 
// 40 kg felett írja  ki, hogy nem vállalja a posta súlyos küldemény kézbesítését! (posta)

package posta;

import java.util.Scanner;

public class Posta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("A küldemény súlya (kg): ");
		float suly = Float.parseFloat(sc.nextLine());
		
		if (0<=suly && suly<=2) {
			System.out.println("A fizetendő összeg: 475 Ft.");
		} else if (2<=suly && suly<=20) {
				System.out.println("A fizetendő összeg: 3395 Ft.");
		} else if (20<=suly && suly<=40) {
			System.out.println("A fizetendő összeg: 6415 Ft.");
		} else if (suly>40) {
			System.out.println("Nem vállalja a posta súlyos küldemény kézbesítését!");
		} 
		sc.close();
	}
}