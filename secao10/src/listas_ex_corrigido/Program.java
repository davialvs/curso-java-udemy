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
			System.out.println("Employee #" + (i + 1) + ":"); // "i" + 1 para n�o come�a-lo com 0
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee employee = new Employee(id, name, salary); //Instancia um objeto Funcionario(employee)
			listaDeFuncionarios.add(employee); //Adiciona o Funcion�rio(employee) na listaDeFuncionarios
		}
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		Integer pos = position(listaDeFuncionarios, idSalary); //Procurando a posi��o do idSalary dentro da listaDeFuncionarios
		if (pos == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			listaDeFuncionarios.get(pos).increaseSalary(percent); //get(pos) acessa a posi��o do funcionario que est� na posi��o "pos(i)"
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee employee : listaDeFuncionarios) { //Para cada funcion�rio(employee) dentro da listaDeFuncion�rios
			System.out.println(employee);
		}
		
		sc.close();
	}
		//Deve ser static porque o m�todo main � static
		// Fun��o para dizer qual � a posi��o do ID na lista
		public static Integer position(List<Employee> list, int id) { //Recebe como argumento uma lista e um ID
			for(int i=0; i<list.size(); i++) {
				if (list.get(i).getId() == id) { //Testar se o ID da posi��o "i" � igual ao que foi digitado | Se o elemento da lista na posi��o "i" (Pegando o ID) for igual ao ID digitado 
					return i; //retorna a posi��o do elemento
				}
			}
			return null; // ou -1 para int primitivo
		}

}
