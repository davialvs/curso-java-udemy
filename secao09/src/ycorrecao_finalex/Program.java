package ycorrecao_finalex;

import java.util.Locale;
import java.util.Scanner;

import ycorrecao_finalex_entities.BankAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		BankAccount bankAccount; // variavel do tipo conta
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine(); // Para que seja consumida a quebra de linha que ficou pendente no nextInt() acima.
		String holder = sc.nextLine();
		System.out.println("Is there an initial deposit(y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			bankAccount = new BankAccount(number, holder, initialDeposit); // Inicia a conta com deposito inicial
		} else {
			bankAccount = new BankAccount(number, holder); // Se não, inicia a conta com apenas dois parametros (sem deposito inicial)
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(bankAccount);
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		bankAccount.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(bankAccount);
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		bankAccount.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(bankAccount);
		
		sc.close();

	}

}
