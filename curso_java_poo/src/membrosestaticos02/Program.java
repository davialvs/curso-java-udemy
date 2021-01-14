package membrosestaticos02;

import java.util.Locale;
import java.util.Scanner;

import membrosestaticos02_util.Calculator;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Calculator calc = new Calculator(); // Necess�rio instanciar a classe pois s�o membros de inst�ncia
		
		System.out.print("Enter radius: ");
		
		double radius = sc.nextDouble();
		double c = calc.circumference(radius); // Necess�rio atribuir os membros � um Objeto.
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);

		sc.close();

	}

}
