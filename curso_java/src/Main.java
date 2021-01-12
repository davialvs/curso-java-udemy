import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		
		System.out.println("Hello World!");
		System.out.println("Bom dia!");
		
		// Para escrever o conteúdo de uma variável de algum tipo básico
		System.out.println(y);
		System.out.println(x);
		
		/* Para delimitar a quantidade de casas decimais e pular uma linha use:
		"printf" + "%.2f" para delimitar 2 casas e "%n" para pular linha */
		System.out.printf("%.2f%n", x);
		
		// Para alterar a localidade e normas de pontuação.
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		
		//Concatenar
		System.out.println("Resultado = " + x + " metros");
		
		//Concatenar com o printf
		System.out.printf("Resultado = %.2f metros%n", x);
		
		String nome = "Davi";
		int idade = 20;
		double renda = 3000.0;
	
		// %f = ponto flutuante
		// %d = inteiro
		// %s = texto
		// %n = quebra de linha
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
