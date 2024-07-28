// Hozz létre egy Termek nevű osztályt (megnevezes, nettoAr, raktarMennyiség, elerheto)!
// a. Min. 2 darab objektumpéldányt tölts fel tetszőleges (emelt szint : random)
// adatokkal. Írd ki mindkét termék adatait egymás alá.
// b. Melyik termék a drágább? Írd ki a megnevezést és az árat is!
// c. Készíts metódust, ami kiírja az egyes termékek bruttó árát!
// d. Melyik termékből van több raktáron?
// e. Készíts metódust, ami abban az esetben, ha nem elérhető egy termék, kiírja, hogy
// „Sajnáljuk, jelenleg nem elérhető!”
// f. Kérj be a felhasználótól egy vásárlási mennyiséget, majd írd ki a fizetendő összeget!

package product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Product {
    private String name;
    private int netPrice;
    private int stockAmount;
    private boolean available;

	public Product(String name, int netPrice, int stockAmount, boolean available) {
		this.name = name;
		this.netPrice = netPrice;
		this.stockAmount = stockAmount;
		if (stockAmount > 0) {
			this.available = true;
		} else if (stockAmount == 0) {
			this.available = false;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
	        Product product1 = new Product("számítógép_1", 100000, 10, false);
	        Product product2 = new Product("számítógép_2", 150000, 30, false);
	        productDatas(product1, product2);
	        productWithHigherPrice(product1, product2);
	        grossPriceOfProducts(product1, product2);
	        productAmount(product1, product2);
	        isAvailable(product1, product2);
	        shoppingAmount(product1, product2);
	}
	
	// a. feladat
	private static void productDatas(Product product1, Product product2) {
		System.out.println("1. termék adatai: ");
		System.out.println("name: "+product1.name);
		System.out.println("net price: "+product1.netPrice+" forint");
		System.out.println("stock amount: "+product1.stockAmount+" piece");
		if (product1.available) {
			System.out.println("elérhető");
		} else if (!product1.available) {
			System.out.println("nem elérhető");
		}
		System.out.println();
		System.out.println("2. termék adatai: ");
		System.out.println("name: "+product2.name);
		System.out.println("net price: "+product2.netPrice+" forint");
		System.out.println("stock amount: "+product2.stockAmount+" piece");
		if (product2.available) {
			System.out.println("elérhető");
		} else if(!product2.available) {
			System.out.println("nem elérhető");
		}
		System.out.println("---------------------");
	}

	// b. feladat
	private static void productWithHigherPrice(Product product1, Product product2) {
		if (product1.netPrice > product2.netPrice) {
			System.out.println("Az 1. termék "+"("+product1.name+") a drágább"+
		" ("+product1.netPrice+" forint)"+".");
		} else {
			System.out.println("A 2. termék ("+product2.name+") a drágább"+
		" ("+product2.netPrice+" forint)"+".");
		}
		System.out.println("---------------------");
	}
	
	// c. feladat
	private static void grossPriceOfProducts(Product product1, Product product2) {
		float vatPrice = (float)0.27;
		float grossPrice1 = product1.netPrice*(1+vatPrice);
		float grossPrice2 = product2.netPrice*(1+vatPrice);
		System.out.println("Az 1. termék bruttó ára: "+grossPrice1+" Ft.");
		System.out.println("A 2. termék bruttó ára: "+grossPrice2+" Ft.");
		System.out.println("---------------------");
	}
	
	// d. feladat
	private static void productAmount(Product product1, Product product2) {
		if (product1.stockAmount > product2.stockAmount) {
			System.out.println("Az 1. termékből ("+product1.name+") van több raktáron.");
		} else if (product2.stockAmount > product1.stockAmount) {
			System.out.println("A 2. termékből ("+product2.name+") van több raktáron.");
		} else if (product1.stockAmount == product2.stockAmount) {
			System.out.println("Mindkét termékből ugyanannyi van raktáron.");
		}
		System.out.println("---------------------");
	}
	
	// e. feladat
	private static void isAvailable(Product product1, Product product2) {
		if (product1.available = false) {
			System.out.println("Sajnáljuk, az 1. termék ("+product1.name+") jelenleg nem elérhető!");
		} else if (product2.available = false) {
			System.out.println("Sajnáljuk, a 2. termék ("+product2.name+") jelenleg nem elérhető!");
		}
	}
	
	// f. feladat
	private static void shoppingAmount(Product product1, Product product2) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Adja meg, hány darabot kér ebből a termékből: "+product1.name+".");
		int shopping_amount1 = Integer.parseInt(br.readLine());
		System.out.print("Adja meg, hány darabot kér ebből a termékből: "+product2.name+".");
		int shopping_amount2 = Integer.parseInt(br.readLine());
		
		if (product1.stockAmount == 0 && product2.stockAmount > 0) {
			System.out.println("A "+product1.name+" nincs raktáron.");
			int payment = product2.netPrice*shopping_amount2;
			System.out.println("A fizetendő összeg: "+payment+" forint.");
		} else if (product1.stockAmount > 0 && product2.stockAmount == 0) {
			System.out.println("A "+product2.name+" nincs raktáron.");
			int payment = product1.netPrice*shopping_amount1;
			System.out.println("A fizetendő összeg: "+payment+" forint.");
		} else if (product1.stockAmount > 0 && product2.stockAmount > 0) {
			int payment = product1.netPrice*shopping_amount1+product2.netPrice*shopping_amount2;
			System.out.println("A fizetendő összeg: "+payment+" forint.");
		} else if (product1.stockAmount == 0 && product2.stockAmount == 0) {
			System.out.println("Egyik termék sincs raktáron.");
		}
	}
}
