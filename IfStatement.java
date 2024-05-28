package flowManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfStatementExample {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*****************************************************/
		/*************** Elágazás - Szelekció ***************/
		/***************************************************/

		// Mikor használjuk?
		// Egy vagy több feltételtől függően, különböző irányokba szeretnénk vezérelni
		// a programunkat! A feltétel csak igaz vagy hamis lehet!!!
		// Pl. Bejelentkezés
		// Milyen fajtái vannak? Egyirányú, kétirányú és többirányú.
		

		/********************** 1. Egyirányú elágazás ********************/
		// A feltétel (condition) igaz ágával foglalkozunk csak kizárólag.
		// Általános szintakszis:
//		if (condition) {
//			utasitas;
//		}
		
		/********************** 2. Kétirányú elágazás ********************/
		// Ha a feltétel hamis, akkor is végez valamit az program, nem csak az igaz ágnál.
		// Általános szintakszis:
//		if (condition) {
//			utasitas1;
//		} else {
//			utasitas2;
//		}

		/********************** 3. Többirányú elágazás ********************/
		// Mikor használjuk? Ha kettőnél is több irányra van szükség.
		// else if-es akárhányszor szerepelhet
		// else ág (legvégén) nem kötelező része
		// Általános szintakszis:
//		if (condition1) {
//			utasitas1; // condition1 igaz
//		} else if (condition2){
//			utasitas2; // condition2 igaz
//		} else if (conditon3){
//			utasitas3; // condition3 igaz
//		} else { // egyik sem igaz
//			utasitas4;
//		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Feladat01: Kérjük be a kinti hőmérsékletet, majd döntsük el, hogy fagy-e
		// odakint
		// (0 alatt fagy)! Csak abban az esetben írjuk ki eredményt, ha 0 alatt van!
		System.out.println("Feladat01: Fagypont vizsgálat - Egyirányú elágazás");
		System.out.print("Kérem adja meg a kinti hőmérsékletet (egész szám): ");
		int temperature = Integer.parseInt(br.readLine());
		if (temperature<0) {
			System.out.println("Fagy odakint...");
		}
		System.out.println();
		
		// Feladat02: Kérjük be a termék raktármennyiségét, majd ha 0-nál nagyobb, akkor
		// állítsuk át az elérhetőségét igazra!
		// Logikai tipus false kezdőértékkel, csak akkor állítjuk át igazra, ha megfelel
		// egy feltételnek.
		System.out.println("Feladat02: Raktárkészlet - Egyirányú elágazás");
		System.out.print("Kérem adja meg a raktármennyiséget (egész szám): ");
		int stockAmount = Integer.parseInt(br.readLine());
		boolean available = false;
		if (stockAmount>0) {
			available = true;
		}
		System.out.println("Elérhető -e a termék (true-igen, false-nem): "+available);
		// if (available==true) { // logikai tipus önmagában a available
		if (available) {
			System.out.println("Elérhető :)");
		} else {
			System.out.println("Nem elérhető :(");
		}
		
		// Feladat03: Kérjünk be egy pozitiv egész számot, majd döntsük el róla, hogy
		// páros vagy páratlan!
		System.out.println("Feladat03: páros/páratlan - Kétirányú elágazás");
		System.out.println("Kérem adjon meg egy pozitív egész számot: ");
		int number = Integer.parseInt(br.readLine());
		if (number %2 ==0) {
			// true ág - ha a feltétel igaz, akkor ebbe az ágba megy bele
			System.out.println("A megadott szám páros volt...");
		} else {
			// false ág - ha a feltétel hamis, akkor ebbe az ágba megy bele
			System.out.println("A megadott szám páratlan volt...");
		}
		System.out.println();
		
		// Feladat04: Kérjünk be két pozitiv egész számot, majd a szorzatukról döntsük
		// el, hogy 100 felett van-e!
		System.out.println("Feladat04: Két pozitív szám szorzata száz feletti-e: többirányú elágazás");
		System.out.print("Kérem adjon meg az első pozitív egész számot: ");
		int number1 = Integer.parseInt(br.readLine());
		System.out.print("Kérem adjon meg a második pozitív egész számot: ");
		int number2 = Integer.parseInt(br.readLine());
		int multiplication = number1*number2;
		int lowerLimit =100;
		if (multiplication>lowerLimit) {
			System.out.println("A két szám szorzata: "+multiplication +", "+lowerLimit +" feletti");
		} else if (multiplication<lowerLimit) {
			System.out.println("A két szám szorzata: "+multiplication +", "+lowerLimit +" alatti");
		} else {
			System.out.println("A két szám szorzata: "+lowerLimit);
		}
		System.out.println();
		
		// Feladat05: Kérjünk két egész számot, majd döntsük el, melyik kisebb/nagyobb!
		System.out.println("Feladat05: Két pozitív szám összehasonlítása kisebb/nagyobb - többirányú elágazás");
		System.out.print("Kérem adjon meg az első pozitív egész számot: ");
		int numberInput1 = Integer.parseInt(br.readLine());
		System.out.print("Kérem adjon meg a második pozitív egész számot: ");
		int numberInput2 = Integer.parseInt(br.readLine());
		if (numberInput1 > numberInput2) {
			System.out.println("Az első megadott szám volt a nagyobb: "+numberInput1 + ">"+numberInput2);
		} else if (numberInput2 > numberInput1) {
			System.out.println("A második megadott szám volt a nagyobb: "+numberInput2 + ">"+numberInput1);
		} else {
			System.out.println("A két szám egyenlő volt: "+numberInput1 + "="+numberInput2);
		}
		System.out.println();
		
		// Feladat06: Kérjük be felhasználótól, hogy naponta átlagosan mennyi időt tölt
		// a képernyő előtt! A választól függően írjuk ki a következőket:
		// 0-2: Kevés időt tölt a képernyő előtt, nem szükséges szemtorna!
		// 3-5: Mérsékelt a képernyőhasználat, de néha tartsunk pihenőt!
		// 6 és felette: Óránként tartsunk 10 perc szünetet vagy végezzünk szemtornát!
		System.out.println("Feladat06: Képernyőidő vizsgálat - Többirányú elágazás");
		System.out.print("Kérem adja meg mennyi időt tölt a képernyő előtt naponta (0-24): ");
		int screenTimeHoursPerDay = Integer.parseInt(br.readLine());
		if (screenTimeHoursPerDay>=0 && screenTimeHoursPerDay<=2) {
			System.out.println("Kevés időt tölt a képernyő előtt, nem szükséges szemtorna!");
		} else if (screenTimeHoursPerDay>=3 && screenTimeHoursPerDay<=5) {
			System.out.println("Mérsékelt a képernyőhasználat, de néha tartsunk pihenőt!");
		} else if (screenTimeHoursPerDay>=6 && screenTimeHoursPerDay<=24) {
			System.out.println("Óránként tartsunk 10 perc szünetet vagy végezzünk szemtornát!");
		} else {
			System.out.println("Hibás értéket adtál meg, helyesen 0-24 kellett volna :( ");
		}
		System.out.println();
		
		/****************
		 * Többirányú elágazás - switch-case szerkezettel
		 ********************/
		// Akkor használjuk, ha kötött a lehetőségek száma: pld. hónapok neve,
		// a heten belüli napok száma, érdemjegyek 1-5, menük sorszáma.
		// Intervallum vizsgálatra nem való, egy konkrét értéket vizsgál.
		// A vizsgált érték lehet szám, szöveg, karakter.
		
		// Feladat07: Kérjük be az érdemjegyet egész számmal 1-5, majd írjuk ki
		// szövegesen!
		System.out.println("Feladat07: Kérjük be az érdemjegyet egész számmal 1-5, majd írjuk ki szövegesen!");
		System.out.print("Kérem adja meg az érdemjegyet egész számmal (1-5): ");
		int mark = Integer.parseInt(br.readLine());
		switch (mark) {
			case 1: System.out.println("Elégtelen");
				break;
			case 2: System.out.println("Elégséges");
				break;
			case 3: System.out.println("Közepes");
				break;
			case 4: System.out.println("Jó");
				break;
			case 5: System.out.println("Jeles");
				break;
			default: System.out.println("Hibás értéket adott meg!!!");
				break;
		} 
		//ide ugrik ki break; hatására
		System.out.println();
		
		// Feladat08: Kérjük be az érdemjegyet szövegesen, majd írjuk ki számmal!
		// Java7 verzió óta String is a kulcs
		System.out.println("Feladat08: Érdemjegy - Switch-case (String):");
		System.out.print("Kérem adja meg az érdemjegyet szöveggel (jeles, jó, közepes, elégséges, elégtelen): ");
		String markText = br.readLine();
		switch (markText) {
		case "elégtelen":
			System.out.println("1");
			break;
		case "elégséges":
			System.out.println("2");
			break;
		case "közepes":
			System.out.println("3");
			break;
		case "jó":
			System.out.println("4");
			break;
		case "jeles":
			System.out.println("5");
			break;
		default:
			System.out.println("Hibás szöveget ír be (jeles, jó, közepes, elégséges, elégtelen)");
			break;
		}
		System.out.println();
		
		// Feladat09: Kérjük be a nap sorszámát (1-7), majd határozzuk meg, hogy
		// hétköznap vagy hétvége az adott nap. 1 hétköznappal tér vissza, 6 - hétvége!
		System.out.println("Feladat09: Napsorszám - Switch-case:");
		System.out.print("Kérem adja meg nap sorszámát 1-7: ");
		int dayNumber = Integer.parseInt(br.readLine());
		switch (dayNumber) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Hétköznap");
				break;
			case 6:
			case 7:
				System.out.println("Hétvége");
				break;
			default:
				System.out.println("Hibás értéket adott meg :(");
				break;
		}
		
		// Cégek egy része tiltja a használatát az ugró utasítások miatt.
//		switch (key) {
//			case 1: utasitas1(); utasitas2();
//				break;
//			case 2: ut3(); ut6();
//				break;
//			case 3: ut8(); ut9();
//				break;
//		default: System.out.println("Hibás adatot adott meg :(");
//			break;
//	}
		
		// Elágazások egymásba ágyazása: ne legyen több egy-két szintnél
		// Ciklomatikus komplexitás
		
		// Ez egy hibás felépítés:
//		if (condition) {
//			if (condition) {
//				if (condition) {
//					ut1
//				}
//			} else {
//				if (condition) {
//					if (condition) {
//						ut2
//					} else {
//						ut3
//					}
//					
//				}
//			}
//		} else {
//			ut8
//		}
		// Megoldás: metódusok használata...

		br.close();
	}
}
