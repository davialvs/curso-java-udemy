package _06estruturasrepetitivas;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		while (x != 0) {
			soma += x; // Pega o valor digitado pelo usuario e acumula dentro da variável "soma"
			x = sc.nextInt();
		}
		
		System.out.println(soma);
		
		sc.close();

	}

}
