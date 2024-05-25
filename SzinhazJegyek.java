// A magyar kultúra napján 3 program közül választhatnak a diákok. A színházi jegy ára 2500 Ft-ba 
// kerül, a komolyzenei koncert jegyének ára 2200 Ft, a népzenei koncert jegyének ára pedig 2400 
// Ft. Olvasd be, hogy az iskolából melyik programra hányan jelentkeznek, és add meg, hogy 
// összesen mennyibe fognak a jegyek kerülni! (szinhaz_jegyek)

package szinhaz_jegyek;

import java.util.Scanner;

public class SzinhazJegyek {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("A színházra jelentkezők száma: ");
		int szinhazra_jelentkezok_szama = Integer.parseInt(sc.nextLine());
		System.out.print("A komolyzenei koncertre jelentkezők száma: ");
		int komolyzenei_koncertre_jelentkezok_szama = Integer.parseInt(sc.nextLine());
		System.out.print("A népzenei koncertre jelentkezők száma: ");
		int nepzenei_koncertre_jelentkezok_szama = Integer.parseInt(sc.nextLine());
		
		int szinhazi_jegyek_ara = szinhazra_jelentkezok_szama*2500;
		int komolyzenei_koncertes_jegyek_ara = komolyzenei_koncertre_jelentkezok_szama*2200;
		int nepzenei_koncertes_jegyek_ara = nepzenei_koncertre_jelentkezok_szama*2400;
		
		System.out.println("A jegyek ára összesen: "+(szinhazi_jegyek_ara
				+komolyzenei_koncertes_jegyek_ara+nepzenei_koncertes_jegyek_ara+" forint."));
		sc.close();
	}
}