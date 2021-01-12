package bitwise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Programa��o de baixo n�vel. Verificar bit.
		Scanner sc = new Scanner(System.in);

		int mask = 32; //0b00100000 <- 1 no 6th bit
		int n = sc.nextInt();
		
		if ((n & mask) != 0) { // Se o 6th bit valer 1 = true se n�o = 0
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false!");
		}
		
		
		sc.close();
	}

}
