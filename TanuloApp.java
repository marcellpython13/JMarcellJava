// Készíts egy Tanulo nevű osztályt (vezetekNev, keresztNev, atlag)!
// a. Hozz létre 2 objektumpéldányt a felhasználótól érkező adatokkal!
// b. Készíts metódust, ami kiírja az adatokat egymás alá!
// c. Készíts metódust, ami eldönti, kell–e értesíteni a szülőt a tanuló rossz érdemjegye 
// miatt (2-es átlag alatt)!
// d. Készíts metódust, ami eldönti, kap–e dicséretet a tanuló (4,5-ös átlag felett jár)!

package tanulo;

import java.io.IOException;

public class TanuloApp {

	public static void main(String[] args) throws IOException {
		// c., d. feladatot hogy kell külön metódusokban megcsinálni a Tanulo osztályban?
		// Mert az adatbekeresEsKiiras() metódus alatt létrehozott ertesites() és dicseret() metódusok az 
		// atlag változót nem látják, és hibát ír ki a program.
		
		// a. feladat
		Tanulo tanulo1 = new Tanulo();
		Tanulo tanulo2 = new Tanulo();
		
		// b. feladat
		System.out.println("1. tanuló adatai");
		tanulo1.adatbekeresEsKiiras();
		System.out.println("--------------------");
		System.out.println("2. tanuló adatai");
		tanulo2.adatbekeresEsKiiras();
		
		// c. feladat
		tanulo1.ertesites();
		tanulo2.ertesites();
		
		// d. feladat
		tanulo1.dicseret();
		tanulo2.dicseret();
	}
}