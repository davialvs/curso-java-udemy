package xfinalexerc_entities;

public class BankAccount {
	
	public int numConta;
	public String nomeConta;
	public double saque;
	public double deposito;
	public double saldoTotal;

	//Métodos construtores

	
	//Métodos
	public void saque(double saque, double percentage) {
		this.saque -= saque - 5.00;
	}
	
	public void deposito(double deposito) {
		this.deposito += deposito;
	}
	
	public double saldoTotal () {
		return deposito - saque;
	}

	public String toString() {
		return "Account " + numConta + ", Holder: " + nomeConta + ", Balance: $ " + saldoTotal();
	}
}
	