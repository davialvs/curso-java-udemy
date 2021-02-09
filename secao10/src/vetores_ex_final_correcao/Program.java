package vetores_ex_final_correcao;

import java.text.ParseException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10]; // Vetor do tipo rent(aluguel) com 10 alugueis disponiveis 
		
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) { 
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("E-mail: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt(); // Número de quartos que o usuario quer
			
			vect[room] = new Rent(name, email); // armazena o novo aluguel no vetor dentro da "room" digitada pelo usuario
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i=0; i<10; i++) {
			if (vect[i] != null) { //Se o vetor na posição "i" for diferente de nulo faz:
				System.out.println(i + ": " + vect[i]); // ex: 8: nome, email (da posição "i")
			}
		}
			
		sc.close();
		
	}

}
