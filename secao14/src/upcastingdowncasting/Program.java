package upcastingdowncasting;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING = é pegar um objeto do tipo BusinessAccount a atribui-lo à uma váriavel do tipo Account
		
		//Por que não dá erro? - Relação "é-um" uma BusinessAccount é uma Account!
		Account acc1 = bacc;
		acc1.getBalance();
		
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING (Processo inverso)
		
		//BusinessAccount acc4 = acc2; //error - tipos diferentes
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3; //SavingsAccount não pode ser convertido para BusinessAccount
		if(acc3 instanceof BusinessAccount) { //Se o que tiver na variavel de acc3 for um objeto que seja instancia de BusinessAccount faça o casting
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) { //if verdadeiro
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}

}
