package membrosestaticos03;

import java.util.Scanner;

import membrosestaticos03_util.Calculator;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Não necessita da criação de um objeto calculator, os membros estáticos são chamados a partir do próprio nome da Classe (Calculator)
		System.out.print("Enter radius: ");
		
		double radius = sc.nextDouble();
		double c = Calculator.circumference(radius); //Classe + membro estático
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		sc.close();

	}

}
