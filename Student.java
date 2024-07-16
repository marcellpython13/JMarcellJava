package student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {
	
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public void dataInput() throws IOException {
		System.out.print("first name: ");
		String firstName = br.readLine();
		System.out.print("last name: ");
		String lastName = br.readLine();
		System.out.print("average: ");
		String inputAverage = br.readLine();
		double average = Double.parseDouble(inputAverage);
		System.out.println("first name: "+firstName);
		System.out.println("last name: "+lastName);
		System.out.println("average: "+average);
	}

	public double notification(double average) throws NumberFormatException, IOException {
		System.out.print("average: ");

		if (average < 2.0) {
			System.out.println("Értesíteni kell a szülőt, mert az átlag "+average);
		} else if (average > 4.5) {
			System.out.println("Dicséretet kap, mert az átlag "+average);
		}
		return average;
	}
}