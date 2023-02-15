package Aula_05;

import java.util.HashSet;
import java.util.Set;

public class ListaSet {

	public static void main(String[] args) {
		
		Set<Double> notas = new HashSet<Double>();
		notas.add(7.0);
		notas.add(2.0);
		notas.add(3.0);//add dadors
		notas.add(5.0);
		notas.add(4.0);
		notas.add(7.0);
		notas.add(20.0);
		notas.forEach(System.out::println);
		//classe SET
		//ela não imprime o item repetido, não aceita.
		//embaralha tudo
		
		System.out.println("Removendo um numero da lista.");
		notas.remove(5.0);//remove um item.
		
		notas.forEach(System.err::println);

		System.out.println("A nota 7.0 exixte: " + notas.contains(7.0));
		// notas.contains(7.0); responde com true or false
		
		for (var nota:notas)
			System.out.println(nota.hashCode());
	}

}
