package metodofinal;

public class BusinessAccount extends Account{

private Double loanLimit;
	
	public BusinessAccount() {
		super(); //chamando os atributos do construtor account (super classe)
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); //chamando o construtor da super classe (Account)
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0; //10 = taxa de emprestimo 
		//	deposit(amount); //coloca o valor do emprestimo como deposito
		}
	}
}
