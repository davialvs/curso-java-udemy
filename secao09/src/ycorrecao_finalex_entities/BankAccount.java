package ycorrecao_finalex_entities;

public class BankAccount {
	
	private int number; //Número da conta
	private String holder; //Nome da conta
	private double balance; //Saldo
	
	//Construtores
	public BankAccount(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public BankAccount(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		//this.balance = balance;
		deposit(initialDeposit); // Usa o método deposit() como atributo recebendo um deposito inicial como parametro
	}

	
	//Getters and Setters
	public int getNumber() { // O número da conta não pode ser alterado
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() { // o Saldo só poderá ser alterado pelos métodos depositar e sacar
		return balance;
	}

		
	//Métodos 
	public void deposit (double depositValue) {
		balance += depositValue; // adiciona o deposito no saldo (saldo recebe o saldo + o valor de depósito)
	}
	
	public void withdraw (double withdrawValue) {
		balance -= withdrawValue + 5.0; // retira o valor digitado do saldo da conta (saldo recebece o saldo - o valor de saque)
	}
	
	public String toString() { //Formatando a exibição dos dados da bankAccount (mudando de objeto para String)
		return "Account "
				+ number
				+", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}

	
}
