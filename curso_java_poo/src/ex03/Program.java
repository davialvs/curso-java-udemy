package ex03;

import java.util.Locale;
import java.util.Scanner;

import ex03_entity.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student stud = new Student();

		stud.name = sc.nextLine();
		stud.n1 = sc.nextDouble();
		stud.n2 = sc.nextDouble();
		stud.n3 = sc.nextDouble();

		System.out.printf("FINAL GRADE = %.2f%n", stud.finalGrade());

		if (stud.finalGrade() < 60.0) { // A logica para exibir no console fica no programa principal
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", stud.missingPoints());
		} else {
			System.out.println("PASS");
		}

		sc.close();

	}

}
