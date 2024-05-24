// Kérd be két dolgozó nevét, beosztását és fizetését, majd írjuk ki a többet kereső munkavállaló 
// minden adatát egymás mellé! Lehetséges, hogy ugyanannyit keresnek, ebben az esetben azt írd ki: 
// „Fizetésük egyenlő.”! (dolgozo_tobbet_keres)

package dolgozo_tobbet_keres;

import java.util.Scanner;

public class DolgozoTobbetKeres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1. dolgozó neve: ");
		String first_worker_name = sc.nextLine();
		System.out.print("1. dolgozó beosztása: ");
		String first_worker_job = sc.nextLine();
		System.out.print("1. dolgozó fizetése: ");
		int first_worker_payment = Integer.parseInt(sc.nextLine());
		
		System.out.print("2. dolgozó neve: ");
		String second_worker_name = sc.nextLine();
		System.out.print("2. dolgozó beosztása: ");
		String second_worker_job = sc.nextLine();
		System.out.print("2. dolgozó fizetése: ");
		int second_worker_payment = Integer.parseInt(sc.nextLine());
		
		if (first_worker_payment>second_worker_payment) {
			System.out.print("A többet kereső dolgozó neve: "+first_worker_name+", "
					+ "beosztása: "+first_worker_job+", fizetése: "+first_worker_payment+" forint.");
		} else if (second_worker_payment>first_worker_payment) {
			System.out.print("A többet kereső dolgozó neve: "+second_worker_name+", "
					+ "beosztása: "+second_worker_job+", fizetése: "+second_worker_payment+" forint.");
		} else {
			System.out.print("Fizetésük egyenlő.");
		}
		sc.close();
	}
}