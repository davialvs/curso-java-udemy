package listas_ex_corrigido;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); //Ajuda a ler os dados digitados no teclado
		
		List<Employee> listaDeFuncionarios = new ArrayList<>();
		
		System.out.println("How many employees will be registered? ");
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			
			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":"); // "i" + 1 para não começa-lo com 0
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee employee = new Employee(id, name, salary); //Instancia um objeto Funcionario(employee)
			listaDeFuncionarios.add(employee); //Adiciona o Funcionário(employee) na listaDeFuncionarios
		}
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		Integer pos = position(listaDeFuncionarios, idSalary); //Procurando a posição do idSalary dentro da listaDeFuncionarios
		if (pos == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			listaDeFuncionarios.get(pos).increaseSalary(percent); //get(pos) acessa a posição do funcionario que está na posição "pos(i)"
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee employee : listaDeFuncionarios) { //Para cada funcionário(employee) dentro da listaDeFuncionários
			System.out.println(employee);
		}
		
		sc.close();
	}
		//Deve ser static porque o método main é static
		// Função para dizer qual é a posição do ID na lista
		public static Integer position(List<Employee> list, int id) { //Recebe como argumento uma lista e um ID
			for(int i=0; i<list.size(); i++) {
				if (list.get(i).getId() == id) { //Testar se o ID da posição "i" é igual ao que foi digitado | Se o elemento da lista na posição "i" (Pegando o ID) for igual ao ID digitado 
					return i; //retorna a posição do elemento
				}
			}
			return null; // ou -1 para int primitivo
		}

}
