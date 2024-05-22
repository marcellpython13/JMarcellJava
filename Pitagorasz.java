package pitagorasz;

import java.util.Scanner;

public class Pitagorasz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("a oldal: ");
		float a_oldal = Float.parseFloat(sc.nextLine());
		System.out.println("b oldal: ");
		float b_oldal = Float.parseFloat(sc.nextLine());
		System.out.println("c oldal: "+Math.sqrt(Math.pow(a_oldal, 2)+Math.pow(b_oldal, 2)));
		sc.close();
	}
}
