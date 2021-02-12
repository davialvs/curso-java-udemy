package listas_ex;

public class Employee {

	private int id;
	private String name;
	private double salary;
	
	//Constructor ---------------------------------------
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	//Getters and Setters --------------------------------
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//Methods
	public void salaryIncrease (double percentage) {
	salary += salary * percentage/100; // adiciona o incremento no salário (salário recebe ele mesmo + o valor da porcentagem incrementada)
	}
	
	public String toString() {
		return id + ", " + name + ", " + salary;
	}
		
}
