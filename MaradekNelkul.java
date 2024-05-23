// Kérj be két számot, majd döntsd el, hogy összegük osztható–e 5-tel és 3-mal is maradék nélkül!
package maradek_nelkul_ottel_harommal;

import java.util.Scanner;

public class MaradekNelkul {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. szám: ");
		int number1 = Integer.parseInt(sc.nextLine());
		System.out.println("2. szám: ");
		int number2 = Integer.parseInt(sc.nextLine());
		int sum = number1+number2;
		if (sum%3==0 && sum%5==0) {
			System.out.println("A két szám összege ("+sum+") osztható 3-mal is és 5-tel is maradék nélkül.");
		} else if (sum%3!=0 && sum%5==0) {
			System.out.println("A két szám összege ("+sum+") nem osztható 3-mal, de osztható 5-tel maradék nélkül.");
		} else if (sum%3==0 && sum%5!=0) {
			System.out.println("A két szám összege ("+sum+") osztható 3-mal, de nem osztható 5-tel maradék nélkül.");
		} else if (sum%3!=0 && sum%5!=0) {
			System.out.println("A két szám összege ("+sum+") sem 3-mal, sem 5-tel nem osztható maradék nélkül.");
		}
		sc.close();
	}
}