package kor_ker_ter;

import java.util.Scanner;

public class KorKerTer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Kör sugara: ");
		float radius = Float.parseFloat(sc.nextLine());
		System.out.println("A kör kerülete: "+(2*Math.PI*radius));
		System.out.println("A kör területe: "+(Math.PI*Math.pow(radius, 2)));
		sc.close();
	}
}