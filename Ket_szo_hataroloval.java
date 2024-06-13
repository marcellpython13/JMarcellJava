// Kérjünk be 2 szót és egy határolót, majd fűzzük össze a megadott határoló mentén: pld. 
// a két megadott szó: mákos és tészta, határoló: #. Eredmény: mákos#tészta.

package ket_szo_hataroloval;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ket_szo_hataroloval {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Adj meg 2 szót és egy határolót.");
		System.out.print("1. szó: ");
		String first_word = br.readLine();
		System.out.print("2. szó: ");
		String second_word = br.readLine();
		System.out.print("határoló: ");
		String separator = br.readLine();
		String wordJoin = String.join(separator, first_word, second_word);
		System.out.println(wordJoin);
		br.close();
	}
}