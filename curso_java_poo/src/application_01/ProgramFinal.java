package application_01;

import java.util.Locale;
import java.util.Scanner;

import entities_01.Triangle;

public class ProgramFinal {
	// Programa do Triangulo usando POO.
	
	public static void main(String[] args) {


		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Triangle x, y; // Importando a classe Triangle
		x = new Triangle(); // Instanciando/Criando o objeto Triangle para uso dentro da variável
		y = new Triangle();

		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble(); // Acessando os atributos do Triangle x
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble(); // Acessando os atributos do Triangle y
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		
		sc.close();
	

	}

}
