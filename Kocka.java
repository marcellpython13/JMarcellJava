package kocka;

import java.util.Scanner;

public class Kocka {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("A kocka oldalhossza (cm): ");
		float side_length = Float.parseFloat(sc.nextLine());
		System.out.println("A kocka felszíne (cm^2): "+Math.pow(side_length, 2));
		System.out.println("A kocka térfogata (cm^3): "+Math.pow(side_length, 3));
		sc.close();
	}
}