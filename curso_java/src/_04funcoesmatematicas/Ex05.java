package _04funcoesmatematicas;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		 Locale.setDefault(Locale.US);
		
		 Scanner sc = new Scanner(System.in);

		 int idPeca1, numPeca1;
		 double valorPeca1;
		 int idPeca2, numPeca2;
		 double valorPeca2;
		 double valorTotal1, valorTotal2, valorFinal;
		 
		 
		 idPeca1 = sc.nextInt();
		 numPeca1 = sc.nextInt();
		 valorPeca1 = sc.nextDouble();
		 
		 idPeca2 = sc.nextInt();
		 numPeca2 = sc.nextInt();
		 valorPeca2 = sc.nextDouble();
		 
		 valorTotal1 = numPeca1 * valorPeca1;
		 valorTotal2 = numPeca2 * valorPeca2;
		 
		 valorFinal = valorTotal1 + valorTotal2;
		 
		 System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorFinal);
		 
		 sc.close();
	}

}
