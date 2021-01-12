package _04funcoesmatematicas;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor1;
		int valor2;
		int soma;
		
		valor1 = sc.nextInt();
		valor2 = sc.nextInt();
		
		soma = valor1 + valor2;

		System.out.println("SOMA = " + soma);
		
		sc.close();
	}

}
