package xfinalexerc;

import java.util.Locale;
import java.util.Scanner;

import xfinalexerc_entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		BankAccount bankAccount = new BankAccount();
		
		System.out.println("Enter account number: ");
		bankAccount.numConta = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder: ");
		bankAccount.nomeConta = sc.nextLine();
		System.out.println("Is there an initial deposit (y/n)? ");
		char resposta = sc.next().charAt(0);
		
		double deposito = 0;
		double saque = 0;

		System.out.println("Enter initial deposit value: ");
		bankAccount.deposito = sc.nextDouble();
		bankAccount.deposito(deposito);
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(bankAccount.toString());
		System.out.println();
		
		System.out.println("Enter a deposit value: ");
		deposito = sc.nextDouble();
		bankAccount.deposito(deposito);
		System.out.println("Updated account data: ");
		System.out.println(bankAccount.toString());
		System.out.println();
		
		System.out.println("Enter a deposit value: ");
		deposito = sc.nextDouble();
		bankAccount.deposito(deposito);
		System.out.println("Updated account data: ");
		System.out.println(bankAccount.toString());
		System.out.println();
		
		double percentage = 5;
		System.out.println("Enter a withdraw value: ");
		bankAccount.saque = sc.nextDouble();
		bankAccount.saque(saque, percentage);
		System.out.println("Updated account data: ");
		System.out.println(bankAccount.toString());
		
		sc.close();
	}

}
