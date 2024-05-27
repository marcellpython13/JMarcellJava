package arrayExample;

public class SimpleOneDimensionArray {

	public static void main(String[] args) {
		// Tömb: összetett adattípus
		// Több azonos típusú elem tárolására alkalmas, egy névvel lehet rá hivatkozni
		// (java-ban csak azonos tipus lehet pld. int vagy string, Employee)
		// Az egyes értékeket a tömb nevével és indexével érjük el.
		// Az indexelés 0-tól kezdődik, az első elem indexe 0.
		// Fontos kötöttségek: létrehozáskor meg kell adni, milyen tipusú elemeket
		// akarunk benne tárolni + meg kell adni a méretét (vagy az egyes elemeket)
		// Egydimenziós tömb - Vektor (Vector)

		// Feladat: heti max. hőmérsékletek tárolása
		// Hibás megközelítés - 7 db. változó felvétele
		// double mondayMaxTemperature = 30;
		// ...
		// double sundayMaxTemperature = 35;
		// Helyette megoldás a tömb.
		
		// Tömb deklaráció
		int[] firstNumberArray = {3, 6, 77, 22, 98, 11, 100};
		System.out.println("A 2-es indexen lévő elem: "+firstNumberArray[2]); // 77
		System.out.println("A 3-as indexen lévő elem: "+firstNumberArray[3]); // 22
		System.out.println("A 2. elem a tömbben: "+firstNumberArray[1]); // 6
		
		firstNumberArray[0] = 1; // elveszik a 3-as érték, belekerül az 1-es
		System.out.println("A 0. indexen lévő elem: "+firstNumberArray[0]);
		
		System.out.println(firstNumberArray[6]); // 100
		// System.out.println(firstNumberArray[7]); // ArrayIndexOutOfBounds - a tömb határán 
		// túlmutató indexre hivatkoztunk
		
		// innen folyt. Tömb méretének lekérdezése
	}
}