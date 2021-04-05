package _05estruturacondicional;

public class Ex04 {

	public static void main(String[] args) {
		// Expressao condicional ternária
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05; //se for verdade "?" senão ":"
		
		System.out.println(desconto);

	}

}
