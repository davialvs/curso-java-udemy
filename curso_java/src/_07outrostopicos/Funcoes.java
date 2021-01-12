package _07outrostopicos;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers:");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c); // v�riavel recebendo a fun��o max
		
		showResult(higher); // fun��o que exibe o resultado da fun��o de verificar o maior n�mero

		sc.close();
	}

	public static int max (int x, int y, int z) { // Fun��o para saber qual o maior n�mero
		
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

	public static void showResult(int value) { // fun��o do tipo vazia que apenas exibe o resultado da fun��o max
		System.out.println("Higher = " + value);
	}

}
