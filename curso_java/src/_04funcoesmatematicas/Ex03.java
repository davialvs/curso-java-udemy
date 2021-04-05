package _04funcoesmatematicas;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Calculando a diferença entre A + B e C + D
		int A, B, C, D;
		int diferenca;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		diferenca = A * B - C * D;

		System.out.println("DIFERENCA = " + diferenca);
		
		sc.close();
	}

}
