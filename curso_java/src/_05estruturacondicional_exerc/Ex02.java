package _05estruturacondicional_exerc;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		int num;
		
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		
		sc.close();

	}

}
