package _05estruturacondicional_exerc;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double entrada;
		
		entrada = sc.nextDouble();
		
		if (entrada > 0.00 && entrada <= 25.00) {
			System.out.println("Intervalo [0,25]");
		} else if (entrada > 25.00 && entrada <= 50.00) {
			System.out.println("Intervalo [25,50]");
		} else if (entrada > 50.00 && entrada <= 75.00) {
			System.out.println("Intervalo [50,75]");
		} else if (entrada > 75.00 && entrada <= 100.00) {
			System.out.println("Intervalo [75,100]");
		} else {
			System.out.println("Fora do Intervalo!");
		}
		
		sc.close();
		
	}

}
