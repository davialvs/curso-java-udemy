package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n]; //Criando uma variavel vect recebendo a instanciação de um vetor
		
		for (int i = 0; i<n; i++) {
			vect[i] = sc.nextDouble(); // a variavel vect na posição "i" recebe um valor double de entrada
		}
		
		double soma = 0.0;
		for (int i=0; i<n; i++) {
			soma += vect[i];
		}
		
		double media = soma / n;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", media);
		
		
		sc.close();
	}

}
