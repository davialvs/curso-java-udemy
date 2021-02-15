package matrizes;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int [][] matriz = new int[n][n]; // Instanciando uma matriz bidimensional
		
		//Percorre-se uma matriz usando 2 for (um para as linhas e outro para as colunas)
		for (int i=0; i<n; i++) { // ou matriz.length para pegar o número de linhas
			for (int j=0; j<n; j++) { // ou matriz[i].length para pegar o número de colunas
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal: ");
		for (int i=0; i<n; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println();
		
		int count = 0; //Contador de negativos 
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				if (matriz[i][j] < 0) { //Se o elemento da matriz na linha "i" e na coluna "j" for negativo
					count++; //incrementa o contador de negativos
				}
			}
		}
		System.out.println("Negative numbers = " + count);
		
		sc.close();

	}

}
