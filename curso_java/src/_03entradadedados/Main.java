package _03entradadedados;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		String x;
		x = sc.next(); //Permite que o usuario digite uma palavra e a armazene dentro da var�avel "x'
		System.out.println("Voc� digitou: " + x); //Exibe o que o usuario digitou
		
		sc.close();

	}

}
