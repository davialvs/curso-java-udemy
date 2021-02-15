/*Fazer um programa para ler dois n�meros inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo n�meros inteiros,
podendo haver repeti��es. Em seguida, ler um n�mero inteiro X que
pertence � matriz. Para cada ocorr�ncia de X, mostrar os valores �
esquerda, acima, � direita e abaixo de X, quando houver, conforme
exemplo.*/

package matrizes_ex;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // Linhas
		int m = sc.nextInt(); // Colunas
		
		int [][] matriz = new int[n][m];
		
		for (int i=0; i<matriz.length; i++) { 
			for (int j=0; j<matriz[i].length; j++) { 
				matriz[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();

		for (int i=0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) { 
				if (matriz[i][j] == x) { // Se o elemento da matriz na linha "i" e na coluna "j" for igual a "x" 
					
					System.out.println("Position " + i + "," + j + ":"); // -l�gica-
					
					if (j > 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if (j < matriz[i].length-1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if (i < matriz.length-1) {
						System.out.println("Down: " + matriz[i+1][j]); // - -
					}
					
				}
			}

		}
		
		sc.close();

	}

}
