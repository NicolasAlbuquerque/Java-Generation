package Aula_05;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		pilha.push("Nicolas");
		pilha.push("Ariane");
		pilha.push("Elisabett");
		pilha.push("Valdir");
		pilha.push("Edilma");
		pilha.push("Horacio");
		//push=inserir /pop returar
		//uiltimo que entra é o primeiro que sai.
		
		for(var elemento :pilha)
			System.out.println(elemento);
		
		System.out.println("Removendo 1 elemento da pilha.");
		
		pilha.pop();//remove
		
		for(var elemento :pilha)
			System.out.println(elemento);
		
		System.out.println("Topo da pilha "+pilha.peek());// primeiro elemento da pilha ou seja nesse metoro é o ultimo elemento inserido  ou o primeiro
	}

}
