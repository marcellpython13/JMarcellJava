package flowManagement;

public class WhileIterateExample {

	public static void main(String[] args) {
		// While ciklus
		// Mikor használjuk?
		// Nem tudjuk, hogy hányszor kell ismételni.
		// Elöltesztelős ciklus
		// Elöször megnézi a ciklusfeltételt, ha igaz, akkor végrehajtja, amit a ciklusmagban
		// talál. Lehet, hogy egyszer sem fut le (a ciklusfeltétel false).
		// Végtelen ciklus - nem áll le a ciklus (a ciklusfeltétel mindig igaz)
		// A ciklusváltozó léptetése manuálisan történik.
		// Példákban: amíg, addig, ismételd addig, amíg.
		// Feladattípusok: pl. fájlkezelésnél (amíg EOF), DB-ből rekord kiolvasás
		// Adatszerkezetben való keresésnél, addig keresem, amíg meg nem találom az értéket
		// Programozás tétel: eldöntés tétele
		// Ritkábban használjuk, mint a FOR-ciklust
//		while (feltétel) {
//			// ciklusmag
//		}
		// amíg a feltétel igaz, addig bemegy a ciklusmagba
		// Feladat01: Addig vegyünk számokat 0-tól egyesével, amíg a 7-tel osztható számok 
		// összege meg nem haladja a 100-at!
		
		int counter = 0; 
		int sum = 0;
		while (sum<100) {
			// Addig fut, amíg a ciklusfeltétel igaz
			if (counter%7==0) {
				sum+=counter; // ua. sum = sum + counter;
				System.out.println(counter);
			}
			counter++;
		}
		System.out.println("A számláló értéke: "+(counter-1));
		System.out.println("Az összeg értéke: "+sum);
	}
}