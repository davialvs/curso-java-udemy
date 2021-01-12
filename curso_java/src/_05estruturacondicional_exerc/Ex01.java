package _05estruturacondicional_exerc;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero; 
		
		numero = sc.nextInt();
		
		if (numero >= 0) {
			System.out.println("NAO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		
		
		sc.close();

	}

}
