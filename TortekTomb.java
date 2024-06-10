// Hozz létre egy tömböt, amely a következő értékeket tárolja:
// 5.29, 6.71, 6.11, 9.5, 6.00, 4.5, 8.43, 9.31, 4.24, 4.55, 3.87.

package tortekTomb;

public class TortekTomb {
	
	public static double[] tomb = {5.29, 6.71, 6.11, 9.5, 6.00, 4.5, 8.43, 9.31, 4.24, 4.55, 3.87};

	public static void main(String[] args) {
		tombElemek();
		hatnalNagyobb();
		szamokPluszIndexeik();
		hetFelettiSzamokDarabszama();
		elemekOsszege();
		elemekAtlaga();
	}

	// a. Írd ki a tömb elemeit egymás mellé szóközzel elválasztva!
	private static void tombElemek() {
		System.out.println("a. feladat");
		for (int i = 0; i<tomb.length; i++) {
			System.out.print(tomb[i]+" ");
		}
	
		System.out.println();
		System.out.println();
	}
	
	// b. Írd ki a 6.00-nál nagyobb értékeket egymás alá!
	private static void hatnalNagyobb() {
		System.out.println("b. feladat");
		for (int i = 0; i<tomb.length; i++) {
			if (tomb[i]>6) {
				System.out.println(tomb[i]+" ");
			}
		}
		System.out.println();
	}
	
	// c. Írd ki a [4.55, 5.0] intervallumban lévő számokat indexükkel együtt!
	private static void szamokPluszIndexeik() {
		System.out.println("c. feladat");
		for (int i = 0; i<tomb.length; i++) {
			if (tomb[i]>=4.55 && tomb[i]<=5.0) {
			System.out.println("Szám: "+tomb[i]+", index: "+i);
			}
		}
		System.out.println();
	}
	
	// d. Hány db. 7.00 feletti szám van a tömbben?
	private static void hetFelettiSzamokDarabszama() {
		System.out.println("d. feladat");
		int darabszam = 0;
		for (int i = 0; i<tomb.length; i++) {
			if (tomb[i]>7.00) {
				darabszam++;
			}
		}
		System.out.println("7-nél nagyobb számok darabszáma: "+darabszam);
		System.out.println();
	}
	
	// e. Mennyi az elemek összege?
	private static double elemekOsszege() {
		System.out.println("e. feladat");
		double osszeg_1 = 0;
		for (int i = 0; i<tomb.length; i++) {
			osszeg_1 += tomb[i];
		}
		System.out.println("Az elemek összege: "+osszeg_1);
		System.out.println();
		return osszeg_1;
	}
	
	// f. Mennyi az elemek átlaga?
	private static double elemekAtlaga() {
		System.out.println("f. feladat");
		double osszeg_2 = 0;
		for (int i = 0; i<tomb.length; i++) {
			osszeg_2 += tomb[i];
		}
		double atlag = osszeg_2/tomb.length;
		System.out.println("Az elemek átlaga: "+atlag);
		return atlag;
	}
}