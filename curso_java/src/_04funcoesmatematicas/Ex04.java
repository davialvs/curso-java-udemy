package _04funcoesmatematicas;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		byte id;
		int horas;
		double valorHora;
		double salario;
		
		id = sc.nextByte();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();
		
		salario = horas * valorHora;
		
		System.out.println("NUMBER = " + id);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();

	}

}
