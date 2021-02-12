/*
Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
N funcionários. Não deve haver repetição de id.

Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
conforme exemplos.

Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
aumento por porcentagem dada. */

package listas_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import vetores_ex_final_correcao.Rent;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("How many employees will be resistered? ");
		int N = sc.nextInt();
		
		List<Employee> listaDeFuncionarios = new ArrayList<>(); //Cria uma lista de Funcionários
		
		for (int i=1; i<=N; i++) { 
			System.out.println();
			System.out.println("Employee #" + i + ":");
			System.out.println("Id: ");
			sc.nextLine();
			int id = sc.nextInt();
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			double salary = sc.nextDouble(); 
			
			listaDeFuncionarios.add(new Employee(id, name, salary)); // Adiciona um novo funcionário na lista de funcionários
		}
		
		
		
		System.out.println("Enter the employee id that will have salary increase: ");
		int idEmployee = sc.nextInt();
		List<Employee> increment = listaDeFuncionarios.stream().filter(id -> id.getId() == 536).collect(Collectors.toList());
		listaDeFuncionarios.get(0).getId();
		
		System.out.println("Enter the percentage: ");
		

		System.out.println("List of Employees:");
		System.out.println(listaDeFuncionarios);
		
		sc.close();

	}

}
