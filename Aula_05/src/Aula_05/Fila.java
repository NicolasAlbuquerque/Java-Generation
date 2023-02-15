package Aula_05;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		fila.add("Nicolas");
		fila.add("Ariane");
		fila.add("Elisabett");
		fila.add("Valdir");
		fila.add("Edilma");
		fila.add("Horacio");
		
		Iterator<String> iFila = fila.iterator();
		while(iFila.hasNext()) {
			System.out.println(iFila.next());
		}
		
		System.out.println("Retirar um elemento da fila");
		System.out.println(fila.poll());
		System.out.println("Lista atualizada");
		
		for(var elemento: fila) {
			System.out.println(elemento);
		}
		System.out.println(fila.size());//tamanho
		System.out.println(fila);//lista com chavez e lado a lad
		System.out.println(fila.peek());//primeiro item
		
	}

}
