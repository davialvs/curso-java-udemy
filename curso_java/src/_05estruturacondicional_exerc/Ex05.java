package _05estruturacondicional_exerc;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cod;
		int qtde;
		double preco = 0;
		double valorTotal;
		
		cod = sc.nextInt();
		qtde = sc.nextInt();
		
		switch (cod) {
		case 1:
			preco = 4.00;
			break;
		case 2:
			preco = 4.50;
			break;
		case 3:
			preco = 5.00;
			break;
		case 4:
			preco = 2.00;
			break;
		case 5:
			preco = 1.50;
			break;
		default:
			System.out.println("Valor inv�lido");
			break;
		}
		
		valorTotal = preco * qtde;
		
		System.out.printf("Total: R$ %.2f%n", valorTotal);
		sc.close();

	}

}
