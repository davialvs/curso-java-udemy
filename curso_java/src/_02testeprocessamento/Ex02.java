package _02testeprocessamento;

public class Ex02 {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 2;
		double resultado;
		
		resultado = a / b;
		
		// Resultado ser� em n�meros inteiros pois o compilador corta as casas decimais.
		System.out.println(resultado);
		
		//Para n�o truncar as casas decimais:
		resultado = (double) a / b;
		System.out.println(resultado);

	}

}
