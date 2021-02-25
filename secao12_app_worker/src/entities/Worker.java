package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	//Associações
	private Department department; //Worker tem 1 department
	private List<HourContract> contracts = new ArrayList<>(); //Quando tiver uma composição (tem-muitos) não deve incluir a lista no construtor, inicia-se a lista vazia
	
	public Worker() {
		
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	/*public void setContracts(List<HourContract> contracts) { //Não se pode trocar a lista
		this.contracts = contracts;
	}*/
	
	//Methods
	public void addContract(HourContract contract) { //Pega a lista de contratos e adiciona um contrato (parametro)
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) { //Salário base + o ganho dos contratos no mês vigente
		double soma = baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContract c : contracts) { //Para cada contrato "c" na lista de contratos faça: --- percorrendo os contratos
			cal.setTime(c.getDate()); // Pegou a data do contrato e definiu como a data do calendário
			int c_year = cal.get(Calendar.YEAR); //Representa o ano do contrato c
			int c_month = 1 + cal.get(Calendar.MONTH); //Representa o mês do contrato c
			if(year == c_year && month == c_month) {
				soma += c.totalValue();
			}
		}
		return soma;
	}
}
