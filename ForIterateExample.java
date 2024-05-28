package flowManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForIterateExample {

	public static void main(String[] args) throws IOException {
		// Ciklus - iteráció
		// Mikor használunk ciklust?
		// Amikor egy vagy több utasítást többször szeretnénk ismételni.
		// Mikor használunk FOR ciklust?
		// Amikor tudjuk pontosan, hogy hányszor kell ismételni.
		// Milyen részei vannak a ciklusnak? Kezdőértékadás, ciklusfeltétel, léptetés, ciklusmag
		// Példákban kulcsszavak: ismételd 5X, tömbkezeléses műveletek, intervallum vizsgálat
		// Adatszerkezet bejárására gyakrabban használjuk a foreach-et for ciklus helyett, ha nem kell az index
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Feladat01: Névbekérés - 5X kiírás: ");
		System.out.println("Kérem adja meg a nevét: ");
		String fullName = br.readLine();
		for (int i = 0; i < 5; i++) {
			//ciklusmag
			System.out.println((i+1)+".futás: "+fullName);
		}
		System.out.println();
		
		//ez is 5X fut le
//		for (int i = 1; i <= 5; i++) {
//			System.out.println(i+". futás: "+fullName);
//		}
		
		//ez is 5X fut le
//		for (int i = 1; i < 6; i++) {
//			System.out.println(i+". futás: "+fullName);
//		}
		
		//for (int i=5; i>0;i--)
		//for (int i=0; i<10;i=i+2)
		//for (int i=0; i<10;i+=2)
		
		//int i = 0; kezdőértékadás
		//i < 5 ciklusfeltétel
		//i++ ciklusváltozó növelése 
		/*
		 * 1. futás: i értéke 0 < 5 true - végrehajta, amit a ciklusmagban talál 
		 * 2. futás: i értéke 1 < 5 true - végrehajta, amit a ciklusmagban talál 
		 * 3. futás: i értéke 2 < 5 true - végrehajta, amit a ciklusmagban talál 
		 * 4. futás: i értéke 3 < 5 true - végrehajta, amit a ciklusmagban talál 
		 * 5. futás: i értéke 4 < 5 true - végrehajta, amit a ciklusmagban talál 
		 * 6. futás: i értéke 5 < 5 false - NEM hajtja végre, amit a ciklusmagban talál 
		 * 
		 */
		
		// Feladat02: Kérjünk be egy szöveget és egy ismétlésszámot, majd írjuk ki annyiszor 
		// a megadott szöveget, amilyen értéket a felhasználó megadott!
		System.out.println("Feladat02: szöveg - ismétlésszám:");
		System.out.println("Kérem adja meg a szöveget: ");
		String text = br.readLine();
		System.out.println("Kérem adja meg az ismétlésszámot (egész szám pld. 6): ");
		int count = Integer.parseInt(br.readLine());
		for (int i = 0; i < count; i++) {
			System.out.println((i+1)+".futás: "+text);
		}
		System.out.println();
		
		// Feladat03: Kérjünk be 10 db egész számot és mindegyikről külön-külön írjuk ki,
		// hogy osztható -e hárommal maradék nélkül! Tömb nélkül oldjuk meg!
		System.out.println("Feladat03: hárommal való m.n osztás - 10 szám:");
		int numberInput;
		for (int i = 0; i < 10; i++) {
			System.out.print("Kérem adja meg a(z) "+(i+1)+"/10. számot (egész szám): ");
			numberInput = Integer.parseInt(br.readLine());
			if (numberInput%3==0) {
				System.out.println("Hárommal m.n. osztható...");
			} else {
				System.out.println("Nem osztható hárommal m.n. ...");
			} //ide ér 
		}
		//System.out.println(numberInput); //hibás, mert a numberInput-nak nincs kezdőértéke
		System.out.println();
		
		// Feladat04: 10-től visszafelé 1-ig egymás mellé szóközzel 
		// elválasztva írjuk ki a számokat!
		System.out.println("Feladat04: 10-től visszafelé 1-ig egymás mellé szóközzel:");	
		for (int i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		
		
		// Feladat05: Kérjünk be egy kezdő és egy végértéket, majd írjuk ki az intervallumon
		// belül a hárommal és néggyel maradék nélkül osztható egész számokat egymás 
		// mellé szóközzel elválasztva!
		System.out.println("Feladat05: Intervallumban hárommal és néggyel m.n osztható számok: ");
		System.out.println("Kérem adja az intervallum alsó határát: ");
		int start = Integer.parseInt(br.readLine());
		System.out.println("Kérem adja az intervallum felső határát: ");
		int end = Integer.parseInt(br.readLine());
		boolean isAnyProperNumber = false;
		for (int i = start; i <= end; i++) {
			if (i%3==0 && i%4==0) {
				System.out.print(i + " ");
				isAnyProperNumber = true;
			}
		}
		//if (isAnyProperNumber==false) //ez is helyes
		if (!isAnyProperNumber) {
			System.out.println("Sajnálom nem volt ilyen érték :(");
		}
		System.out.println();
		System.out.println();
		
		//Feladat06: 500 és 600 között írjunk ki minden harmadik számot, egymás mellé
		// vesszővel elválaszva, de utolsó után ne legyen vessző!
		System.out.println("Feladat06: 500 és 600 között írjunk ki minden harmadik számot: ");
		for (int i = 500; i <= 600; i=i+3) {
			if (i>597) {
				System.out.print(i);
			} else {
				System.out.print(i + ", ");
			}
		}
		br.close();
	}
}