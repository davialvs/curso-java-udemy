package _05estruturacondicional_exerc;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			int A, B;
			
			A = sc.nextInt();
			B = sc.nextInt();
			
			if (A % B == 0 || B % A == 0) { // Multiplos entre si
				System.out.println("S�o Multiplos");
			} else {
				System.out.println("N�o s�o Multiplos");
			}
			
			sc.close();
	}

}
