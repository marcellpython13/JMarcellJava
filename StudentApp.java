// Készíts egy Tanulo nevű osztályt (vezetekNev, keresztNev, atlag)!
// a. Hozz létre 2 objektumpéldányt a felhasználótól érkező adatokkal!
// b. Készíts metódust, ami kiírja az adatokat egymás alá!
// c. Készíts metódust, ami eldönti, kell–e értesíteni a szülőt a tanuló rossz érdemjegye 
// miatt (2-es átlag alatt)!
// d. Készíts metódust, ami eldönti, kap–e dicséretet a tanuló (4,5-ös átlag felett jár)!

package student;

import java.io.IOException;

public class StudentApp {

	public static void main(String[] args) throws IOException {
		
		// a. feladat
		Student student1 = new Student();
		Student student2 = new Student();
		
		// b., c., d. feladat
		System.out.println("1. tanuló adatainak a bekérése");
		student1.dataInput();
		student1.notification(1.7);
		System.out.println("--------------------");
		System.out.println("2. tanuló adatainak a bekérése");
		student2.dataInput();
		student2.notification(4.7);
	}
}