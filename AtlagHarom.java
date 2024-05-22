package atlag_harom;

import java.util.Scanner;

public class AtlagHarom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a: ");
		float number_1 = Float.parseFloat(sc.nextLine());
		System.out.println("b: ");
		float number_2 = Float.parseFloat(sc.nextLine());
		System.out.println("c: ");
		float number_3 = Float.parseFloat(sc.nextLine());
		System.out.println("átlag: "+((number_1+number_2+number_3)/3));
		sc.close();
	}
}