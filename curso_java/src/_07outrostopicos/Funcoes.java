package _07outrostopicos;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers:");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c); // váriavel recebendo a função max
		
		showResult(higher); // função que exibe o resultado da função de verificar o maior número

		sc.close();
	}

	public static int max (int x, int y, int z) { // Função para saber qual o maior número
		
		int aux;
		
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux; // retorna o valor da variavel conforme o resultado
	}

	public static void showResult(int value) { // função do tipo vazia que apenas exibe o resultado da função max
		System.out.println("Higher = " + value);
	}

}
