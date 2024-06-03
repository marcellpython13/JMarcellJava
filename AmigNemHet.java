// Hozzunk létre véletlen számokat 1-10 között mindaddig, amíg 7-es nem lesz!

package amig_nem_7;

import java.util.Random;

public class AmigNemHet {

	public static void main(String[] args) {
		System.out.println("Véletlen számok 1-10 között mindaddig, amíg 7-es nem lesz.");
		Random r = new Random();
		
		int new_number;
		
		do {
			new_number = r.nextInt(10)+1;
			System.out.println(new_number);
		} while(new_number!=7);
	}
}