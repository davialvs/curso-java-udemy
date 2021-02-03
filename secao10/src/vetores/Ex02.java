package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Ex02Class[] vect = new Ex02Class[n];
		
		for (int i = 0; i<n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			vect[i] = new Ex02Class(name, price); //a posição que o i estiver recebe um novo produto
		}
		
		double soma = 0;
		for (int i = 0; i<vect.length; i++) { //vect.lenght = é a quantidade de elementos do vetor
			soma += vect[i].getPrice(); // pega o preço do produto na posição que ele estiver em i e coloca dentro da variavel soma
		}
		
		double media = soma / n;
		System.out.printf("AVERAGE PRICE %.2f%n", media);
		
		sc.close();
		

	}

}
