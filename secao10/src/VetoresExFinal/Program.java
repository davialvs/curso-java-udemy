package VetoresExFinal;

import java.util.Locale;
import java.util.Scanner;

import vetores.Ex02Class;

public class Program {

	public static void main(String[] args) {
		
		/*
		A dona de um pensionato possui dez quartos para alugar para estudantes,
		sendo esses quartos identificados pelos números 0 a 9.
		
		Fazer um programa que inicie com todos os dez quartos vazios, e depois
		leia uma quantidade N representando o número de estudantes que vão
		alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
		N estudantes. Para cada registro de aluguel, informar o nome e email do
		estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
		que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
		um relatório de todas ocupações do pensionato, por ordem de quarto,
		conforme exemplo.
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Student[] student = new Student[10]; //Vetor de estudantes representados pela classe Student
		System.out.println("How many rooms will be ranted? ");
		int rooms = sc.nextInt();
		
		String name;
		String email;
		
		for (int i = 0; i<rooms; i++) { 
			sc.nextLine();
			System.out.println("Rent #" + i);
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("E-mail: ");
			email = sc.next();
			
			student[i] = new Student(name, email);
		}
		
		System.out.println(student.toString());
		
		sc.close();
		

	}

}
