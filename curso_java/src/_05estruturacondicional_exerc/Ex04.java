package _05estruturacondicional_exerc;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int horaIni, horaFim, horaTotal;
		
		horaIni = sc.nextInt();
		horaFim = sc.nextInt();
		  
		if (horaIni < horaFim) {
			horaTotal = horaFim - horaIni;
		} else {
			horaTotal = 24 - horaIni + horaFim;
		}
		
		System.out.println("O JOGO DUROU " + horaTotal + "HORA(S)");
		
		sc.close();

	}

}
