package listas;

import java.util.ArrayList; // Implementação otimizada, pega caracteristicas de vetor e de list
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> listNomes = new ArrayList<>(); // lista de números inteiros
		
		listNomes.add("Maria"); // add a string "Maria" na lista
		listNomes.add("Gabriel");
		listNomes.add("Davi");
		listNomes.add("Kelvin");
		
		listNomes.add(2, "Marco"); //Adiciona uma string a posição 2 especificamente
		
		System.out.println(listNomes.size()); //exibe o tamanho da lista
		
		for (String nome : listNomes) { //para cada string "nome" pertencente a listNomes
			System.out.println(nome);
		}
		
		System.out.println("-------------------------------------------------");
		
		listNomes.remove("Anna"); //remove uma string da lista 
		listNomes.remove(1);
		listNomes.removeIf(x -> x.charAt(0) == 'M'); // remoção por predicado
		
		System.out.println("-------------------------------------------------");
		System.out.println("Index of Bob: " + listNomes.indexOf("Bob")); // Procura quantos "Bob" tem na lista
		System.out.println("Index of Bob: " + listNomes.indexOf("Marco"));
		System.out.println("-------------------------------------------------");
		
		List<String> result = listNomes.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) { 
			System.out.println(x);
		}
		System.out.println("-------------------------------------------------");
		String name = listNomes.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);

	}

}
