package arrayExample;

import java.util.Random;
import java.util.Scanner;

public class SimpleOneDimensionArray {

	public static void main(String[] args) {
		// Tömb: összetett adattípus
		// Több azonos típusú elem tárolására alkalmas, egy névvel lehet rá hivatkozni
		// (java-ban csak azonos tipus lehet, pl. int vagy string, Employee)
		// Az egyes értékeket a tömb nevével és indexével érjük el.
		// Az indexelés 0-tól kezdődik, az első elem indexe 0.
		// Fontos kötöttségek: létrehozáskor meg kell adni milyen tipusú elemeket
		// akarunk benne tárolni + meg kell adni a méretét (vagy az egyes elemeket)
		// Egydimenziós tömb - Vektor (Vector)

		// Programozás alapok modul -ismétlés
		// Feladat: heti max hőmérsékletek tárolása
		// Hibás megközelítés - 7db változó felvétele
		// double mondayMaxTemperature = 30;
		// ...
		// double sundayMaxTemperature = 35;
		// Helyette megoldás a tömb.
		
		// Tömb deklaráció
		int[] firstNumberArray = {3,6,77,22,98,11,100};
		System.out.println("A 2-es indexen lévő elem: "+firstNumberArray[2]); // 77
		System.out.println("A 3-as indexen lévő elem: "+firstNumberArray[3]); // 22
		System.out.println("A 2. elem a tömbben: "+firstNumberArray[1]); // 6
		
		firstNumberArray[0] = 1; //e lveszik a 3-as érték, belekerül az 1-es
		System.out.println("A 0-as indexen lévő elem: "+firstNumberArray[0]);
		
		System.out.println(firstNumberArray[6]); // 100
		// System.out.println(firstNumberArray[7]); // ArrayIndexOutOfBounds - A tömb határán túlmutató
		// indexre hivatkoztunk
		
		// Tömb méretének lekérdezése
		System.out.println("A tömb mérete: "+firstNumberArray.length);
		
		// A tömb utolsó elemének elérése
		// 1. megoldás - hibás - Hard Code
		// System.out.println("A tömb utolsó eleme: "+firstNumberArray[6]);
		
		// 2. megoldás - helyes
		System.out.println("A tömb utolsó eleme:"+ firstNumberArray[firstNumberArray.length-1]);
		
		System.out.println("Feladat01: Hozzunk létre egy 20 elemű egészeket "
				+ "tárolására alkalmas tömböt, majd írjuk ki az elemeit.");
		int[] numberArrayDefault = new int[20]; // kötelező vagy a méretét vagy az elemeit megadni
		// JS, PHP - tetszőleges típusok keverve is lehetnek és nem nem kell megadni a méretét vagy elemeket
		// var numberArray = []; //JS
		//$numberArray = []; //PHP 
		System.out.println("Az első elem a numberArrayDefault tömbben: "+numberArrayDefault[0]);
		System.out.println("Az összes elem a numberArrayDefault tömbben: ");
		for (int i = 0; i < numberArrayDefault.length; i++) {
			System.out.print(numberArrayDefault[i] + " "); // 20db 0
		}
		// int alapértéke a 0
		System.out.println();
		System.out.println();
		
		System.out.println("Feladat02: Hozzunk létre egy 10 elemű string-ek "
				+ "tárolására alkalmas tömböt, majd írjuk ki az elemeit.");
		String[] stringArrayDefault = new String[10]; 
		System.out.println("Az összes elem a stringArrayDefault tömbben: ");
		for (int i = 0; i < stringArrayDefault.length; i++) {
			System.out.print(stringArrayDefault[i] + " "); // 10 db. null
		}
		// a String alapértéke a null
		System.out.println();
		System.out.println();
		
		System.out.println("Feladat03: Szövegek tárolása tömbben: ");
		// String[] nameArray = new String[] {"John", "Jane","Jonnie"};
		String[] nameArray = {"John", "Jane","Jonnie"};
		System.out.println("2-es indexen lévő elem: "+nameArray[2]); // Jonnie
		System.out.println("nameArray tömb elemei: ");
		for (int i = 0; i < nameArray.length; i++) {
			System.out.print(nameArray[i] + " ");
		}
		System.out.println();
		System.out.println();
		
		// Feladat04: Hozzunk létre egy karakter tömböt a következő értékekkel: g, T, e, 2, j,p, p, Ö.
		// Írjuk ki az elemeket egymás mellé vesszővel, de az utolsó elem után ne legyen vessző!
		System.out.println("Feladat04 - Karakterek tárolása és kiírása vesszővel egymás mellé,"
				+ "de az utolsó elem után ne legyen!");
		char[] charArray = {'g','T','e','2','j','p','p','Ö'};
		for (int i = 0; i < charArray.length; i++) {
			if (i==charArray.length-1) {
				System.out.print(charArray[i]);
			} else {
				System.out.print(charArray[i] + ",");
			}
		}
		System.out.println();
		System.out.println();
				
		// Feladat05 - 20 elemű tömb feltöltése véletlen számokkal 1-100 közötti tartományban.
		// Írjuk ki a tömb elemeit egymás mellé szóközzel elválasztva!
		System.out.println("Feladat05 - 20 elemű tömb feltöltése véletlen számokkal 1-100 között:");
		int[] numberArray5 = new int[20];
		Random r = new Random();
		
		// Tömb feltöltése véletlen számokkal 1-100 között
		for (int i = 0; i < numberArray5.length; i++) {
			numberArray5[i] = r.nextInt(100)+1;
		}
		
		// Tömb elemeinek kiírása - FOR ciklussal
		System.out.println("A tömb elemei (for ciklussal): "); 
		for (int i = 0; i < numberArray5.length; i++) {
			System.out.print(numberArray5[i] + " ");
		}
		System.out.println();
		
		// tömb elemeinek kiírása FOREACH szerkezettel (nincsen foreach ciklus)
		// meg lehetne oldani a feltöltést és kiírást egy cikluson belül, DE... 
		// (metódusok, tesztelhetőség miatt így hagyjuk)
		// nem foglalkozik az indexeléssel, bejárja az adatszerkezetünket
		// item (tetszőleges név: felveszi az egyes értékeket az adatszerkezeten belül)
		// azoknál a feladatoknál, ahol kell az index, ott nem érdemes használni, helyette FOR ciklus
		// FIGYELEM: foreach-en belül nincsen numberArray5[i].
		// FONTOS: A két módszert ne keverjük!
		// A FOREACH szerkezetet leggyakrabban egy adatszerkezet bejárására használjuk.
		
		System.out.println("A tömb elemei (foreach szerkezettel): "); 
		for (int item : numberArray5) {
			System.out.print(item + " ");
		}
		// Bad practise - Don't Do This - HELYETTE FOR ciklus
//		int index = 0;
//		for (int item : numberArray5) {
//			System.out.print(item + " ");
//			index++;
//		}
		
//		for (Car car : cars) {
//			System.out.print(car.getConsuption() + " ");
//	}
		
//		for (Product product: products) {
//		System.out.print(product.getPrice() + " ");
//}
		
		// más nyelvekben foreach szó is megjelenik
		// foreach(car in cars)
		
		System.out.println();
		System.out.println();
		
		// Feladat06: 5 elemű tömb feltöltése a felhasználótól érkező egész számokkal. 
		// Írjuk ki egymás mellé szóközzel elválasztva az elemeket! A feltöltéskor 
		// tájékoztassuk a felhasználót arról, hogy melyik sorszámú értéket adja meg.
		// A feltöltés után írjuk ki, melyik indexen vannak a páros elemek.
		// Amennyiben nem volt ilyen, arról is írjunk üzenetet!
		System.out.println("Feladat06 - 5 elemű tömb feltöltése a felhasználótól érkező egész számokkal: ");
		Scanner sc = new Scanner(System.in);
		int arraySize = 5;
		int[] numberArray6 = new int[arraySize];
		
		// 1. lépés: tömb feltöltése
		for (int i = 0; i < numberArray6.length; i++) {
			System.out.print("Adja meg a(z) "+(i+1)+"/"+arraySize +". egész számot: ");
			numberArray6[i] = Integer.parseInt(sc.nextLine());
			// itt nincsen item, itt a foreach szerkezettel ne keverjük
		}
		
		// 2. lépés: tömb elemeinek kiírása foreach szerkezettel
		System.out.print("A tömb elemei: ");
		for (int number : numberArray6) {
			// itt még nincsen numberArray6[i], mert az a for ciklus szerkezete
			System.out.print(number + " ");
		}
		System.out.println();
		
		// 3. lépés: páros elemek indexének megjelenítése
		System.out.print("Ezeken az indexeken volt páros érték: ");
		boolean containsEven = false; 
		for (int i = 0; i < numberArray6.length; i++) {
			if (numberArray6[i] %2 == 0) {
				System.out.print(i + " ");
				containsEven = true;
			}
		}
		if (!containsEven) {
			System.out.println(" Sajnos nem volt páros elem :(");
		}
		System.out.println();
		System.out.println();
		
		
		// Feladat07: Töltsünk fel egy 4 elemű tömböt, megadott törtszámokkal: 
		// 55.9, 74.1, 89.9, 1.8. Hozzunk létre egy ugyanilyen méretű egész számok tárolására
		// alkalmas adatszerkezetet (tömböt), majd mentsük bele a számokat lefelé kerekítve.
		System.out.println("Feladat07: Töltsünk fel egy 4 elemű tömböt, megadott törtszámokkal");
		double[] fractionNumbers = {55.9,74.1,89.9,1.8};
		int[] numberArray7 = new int[fractionNumbers.length];
		for (int i = 0; i < fractionNumbers.length; i++) {
			numberArray7[i] = (int)Math.floor(fractionNumbers[i]);
		}
		System.out.print("Az eredeti tömb elemei: ");
		for (double item : fractionNumbers) {
			System.out.print(item + " ");
		}
		System.out.println();
		System.out.print("Az lefelé kerekített tömb elemei: ");
		for (int item : numberArray7) {
			System.out.print(item + " ");
		}
		System.out.println();
		System.out.println();

		// Feladat08: Kérjük be a felhasználótól mekkora méretű tömböt szeretne létrehozni, 
		// majd töltsük fel a következő lehetséges értékekkel véletlenszerűen: 
		// répa, karalábé, krumpli, zeller, hagyma.
		System.out.println("Feladat08: Zöldségek véletlen tömb");
		System.out.print("Kérem adja meg a tömb méretét: ");
		int arraySize2 = Integer.parseInt(sc.nextLine());
		String[] vegetables = {"répa","karalábé","krumpli","zeller","hagyma"};
		String[] vegetablesRandomArray = new String[arraySize2];
		for (int i = 0; i < vegetablesRandomArray.length; i++) {
			vegetablesRandomArray[i] = vegetables[r.nextInt(5)];
		}
		System.out.println("Zöldség tömb véletlenszerű elemei: ");
		for (int i = 0; i < vegetablesRandomArray.length; i++) {
			if (i==vegetablesRandomArray.length-1) {
				System.out.print(vegetablesRandomArray[i]);
			} else {
				System.out.print(vegetablesRandomArray[i] + ", ");
			}
		}
		sc.close();
	}
}