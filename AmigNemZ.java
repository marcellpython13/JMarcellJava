// Kérjünk be karaktereket mindaddig, amíg a megadott karakter nem a 'z' betű!

package amig_nem_z;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AmigNemZ {

	public static void main(String[] args) throws IOException {
		System.out.println("Karakterek bekérése mindaddig, amíg a megadott karakter nem a 'z' betű.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String character;
		do {
			System.out.println("Kérek egy új karaktert!");
			character = br.readLine();
			
		} while(!character.equals("z"));
		
		if (character.equals("z")) {
			System.out.println("Kiléptem, mert a megadott karakter a 'z' betű volt.");
		}
	}
}
