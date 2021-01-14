package membrosestaticos03;

import java.util.Scanner;

import membrosestaticos03_util.Calculator;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// N�o necessita da cria��o de um objeto calculator, os membros est�ticos s�o chamados a partir do pr�prio nome da Classe (Calculator)
		System.out.print("Enter radius: ");
		
		double radius = sc.nextDouble();
		double c = Calculator.circumference(radius); //Classe + membro est�tico
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		sc.close();

	}

}
