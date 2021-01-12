package _04funcoesmatematicas;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		 Scanner sc = new Scanner(System.in);
		 
		 double raio, area, pot, pi = 3.14159;
		 
		 raio = sc.nextDouble();
		 
		 pot = Math.pow(raio, 2.0);
		 
		 area = pi * pot;
		 
		 System.out.printf("A = %.4f%n", area);
		 
		 sc.close();
		 
	}

}
