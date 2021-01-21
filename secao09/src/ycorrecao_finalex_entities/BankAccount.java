package ycorrecao_finalex_entities;

public class BankAccount {
	
	private int number; //N�mero da conta
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
		deposit(initialDeposit); // Usa o m�todo deposit() como atributo recebendo um deposito inicial como parametro
	}

	
	//Getters and Setters
	public int getNumber() { // O n�mero da conta n�o pode ser alterado
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() { // o Saldo s� poder� ser alterado pelos m�todos depositar e sacar
		return balance;
	}

		
	//M�todos 
	public void deposit (double depositValue) {
		balance += depositValue; // adiciona o deposito no saldo (saldo recebe o saldo + o valor de dep�sito)
	}
	
	public void withdraw (double withdrawValue) {
		balance -= withdrawValue + 5.0; // retira o valor digitado do saldo da conta (saldo recebece o saldo - o valor de saque)
	}
	
	public String toString() { //Formatando a exibi��o dos dados da bankAccount (mudando de objeto para String)
		return "Account "
				+ number
				+", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}

	
}
