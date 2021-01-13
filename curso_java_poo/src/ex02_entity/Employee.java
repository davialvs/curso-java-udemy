package ex02_entity;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
		
	}
	
	public void increaseSalary (double percentage) { // recebendo uma variavel percentage do tipo double como parametro 
		grossSalary += grossSalary * percentage/100.0; 
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
				
	}
	
}
