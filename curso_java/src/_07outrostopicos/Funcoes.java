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
		
		int maior;
		
		if (x > y && x > z) {
			maior = x;
		} else if (y > z) {
			maior = y;
		} else {
			maior = z;
		}
		return maior; // retorna o valor da variavel conforme o resultado
	}

	public static void showResult(int funcao) { // fun��o do tipo vazia que apenas exibe o resultado da fun��o max
		System.out.println("Higher = " + funcao);
	}

}
