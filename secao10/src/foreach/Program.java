package foreach;

public class Program {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"}; //Inicia o vetor com 3 posições com seus respectivos elementos
		
		for (int i = 0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("---------------------------------");
		for (String nomes : vect) { // para cada objeto "nomes" contido no vetor vect faça:
			System.out.println(nomes);
		}

	}

}
