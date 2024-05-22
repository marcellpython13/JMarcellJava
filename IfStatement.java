package feladatok_05_22;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfStatement {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*****************************************************/
		/*************** Elágazás - Szelekció ***************/
		/***************************************************/

		// Mikor használjuk?
		// Egy vagy több feltételtől függően, különböző irányokba szeretnénk vezérelni
		// a programunkat! A feltétel csak igaz vagy hamis lehet!!!
		// Pld Bejelentkezés
		// Milyen fajtái vannak? Egyirányú, kétirányú és többirányú.
		

		/********************** 1. Egyirányú elágazás ********************/
		// A feltétel (condition) igaz ágával foglalkozunk csak kizárólag.
		// Általános szintakszis:
//		if (condition) {
//			utasitas;
//		}
		
		/********************** 2. Kétirányú elágazás ********************/
		// Ha a feltétel hamis, akkor is végez valamit az program, nem csak az igaz
		// ágnál.
		// Általános szintakszis:
//		if (condition) {
//			utasitas1;
//		} else {
//			utasitas2;
//		}

		/********************** 3. Többirányú elágazás ********************/
		// Mikor használjuk? Kettőnél is több irányra van szükség.
		// else if -es akárhányszor szerepelhet
		// else ág (legvégén) nem kötelező része
		// Általános szintakszis:
//		if (condition1) {
//			utasitas1; // condition1 igaz
//		} else if (condition2){
//			utasitas2;// condition2 igaz
//		} else if (conditon3){
//			utasitas3;// condition3 igaz
//		} else { //egyik sem igaz
//			utasitas4;
//		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		// Feladat01: Kérjük be a kinti hőmérsékletet, majd döntsük el, hogy fagy -e odakint
//		// (0 alatt fagy)! Csak abban az esetben írjunk ki eredményt, ha 0 alatt van!
		System.out.println("Feladat01: Fagypont vizsgálat - Egyirányú elágazás");
		System.out.print("Kérem adja meg a kinti hőmérsékletet (egész szám): ");
		int temperature = Integer.parseInt(br.readLine());
		if (temperature<0) {
			System.out.println("Fagy odakint...");
		} else {
			System.out.println("Nem fagy odakint...");
		}

//		Feladat02: Kérjük be a termék raktármennyiségét, majd ha 0-nál nagyobb, akkor
//		állítsuk át az elérhetőségét igazra!
//		Logikai tipus false kezdőértékkel, csak akkor állítjuk át igazra, ha megfelel
//		egy feltételnek.
		System.out.println("Feladat02: Raktárkészlet");
		System.out.print("Raktármennyiség: ");
		int stockAmount = Integer.parseInt(br.readLine());
		if (stockAmount>0) {
			System.out.println("elérhető");
		} else {
			System.out.println("nem elérhető");
		}

//		Feladat03: Kérjünk be egy pozitiv egész számot, majd döntsük el róla, hogy
//		páros vagy páratlan!
		System.out.println("Feladat03: páros/páratlan");
		System.out.print("Pozitiv egész szám: ");
		int number = Integer.parseInt(br.readLine());
		if (number%2==0) {
			System.out.println("páros");
		} else {
			System.out.println("páratlan");
		}

		// Feladat04: Kérjünk be két pozitiv egész számot, majd a szorzatukról döntsük
		// el, hogy 100 felett van -e!
		System.out.println("Feladat04: Szorzat kisebb vagy nagyobb, mint 100");
		System.out.print("1. pozitiv egész szám: ");
		int tag_1 = Integer.parseInt(br.readLine());
		System.out.print("2. pozitiv egész szám: ");
		int tag_2 = Integer.parseInt(br.readLine());
		int multiplication = tag_1*tag_2;
		int lowerLimit = 100;
		if (multiplication>lowerLimit) {
			System.out.println("A két szám szorzata: "+multiplication +", vagyis "+lowerLimit +" feletti");
		} else if (multiplication<lowerLimit) {
			System.out.println("A két szám szorzata: "+multiplication +", vagyis "+lowerLimit +" alatti");
		} else {
			System.out.println("A két szám szorzata: "+lowerLimit);
		}
		
		// Feladat05: Kérjünk két egész számot, majd döntsük el, melyik kisebb/nagyobb!
		System.out.println("Feladat05: kisebb vagy nagyobb");
		System.out.println("1. egész szám: ");
		int numberInput1 = Integer.parseInt(br.readLine());
		System.out.println("2. egész szám: ");
		int numberInput2 = Integer.parseInt(br.readLine());
		if (numberInput1<numberInput2) {
			System.out.println(numberInput1+" Kisebb, mint "+numberInput2);
		} else if (numberInput2<numberInput1) {
			System.out.println(numberInput2+" Kisebb, mint "+numberInput1);
		} else {
			System.out.println("A két szám egyenlő.");
		}

		// Feladat06: Kérjük be felhasználótól, hogy naponta átlagosan mennyi időt tölt
		// a képernyő előtt! A választól függően írjuk ki a következőket:
		// 0-2: Kevés időt tölt a képernyő előtt, nem szükséges szemtorna!
		// 3-5: Mérsékelt a képernyőhasználat, de néha tartsunk pihenőt!
		// 6 és felette: Óránként tartsunk 10 perc szünetet vagy végezzünk szemtornát!
		System.out.println("Feladat06: Képernyőidő vizsgálat");
		System.out.println("képernyő előtt töltött órák száma: ");
		int ido = Integer.parseInt(br.readLine());
		if (ido>=0 && ido<=2) {
			System.out.println("Kevés időt tölt a képernyő előtt, nem szükséges szemtorna!");
		} else if (ido>=3 && ido<=5) {
			System.out.println("Mérsékelt a képernyőhasználat, de néha tartsunk pihenőt!");
		} else if (ido>=6) {
			System.out.println("Óránként tartsunk 10 perc szünetet vagy végezzünk szemtornát!");
		}
	}
}