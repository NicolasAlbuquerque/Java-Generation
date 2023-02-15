package Aula_05;

import java.util.Scanner;
import java.util.Stack;

public class Ex06 {

	public static void main(String[] args) {

		Stack<String> pilha = new Stack<String>();
Scanner leia = new Scanner (System.in);
		int option=6;
		String livro;
		
		while(true) {
			System.out.println(" ---------------------------------- ");
			System.out.println("| Digite para seleciona uma opção: | ");
			System.out.println("| [1]- Adicionar livro a Pilha.    |");
			System.out.println("| [2]- Listar todos os Livros  .   |");
			System.out.println("| [3]- Retirar Livros da pilha.    |");
			System.out.println("| [0]- Sair.                       |");
			System.out.println(" ----------------------------------");
			option=leia.nextInt();
			
			if(option==0) {
				System.out.println("Programa foi Finalizado");
				leia.close();
				System.exit(0);
				} 
				
			
			switch(option) {
			case 1:
				System.out.println("Adicioanar livro");
				
				leia.skip("\\R?");
				livro=leia.nextLine();//lê o nome e coloca na variável.
				pilha.add(livro);//metodo para inserir o nome da variável na fila/Collection
				System.out.println("Fila:");
				pilha.forEach(System.out::println);//For Each imprime os nomes da lista
				System.out.println("Livro Adicionado!");
				break;
			case 2:
				if(pilha.isEmpty()) {
					System.out.println("A pilha está vazia.");
				}
				
			else {
				System.out.println("Lista de todos os livros na pilha.");
			}
				pilha.forEach(System.out::println);//For Each imprime os nomes da lista

				break;
			case 3:	
				System.out.println("Retirar o ultimo livro da Pilha.");
				pilha.pop();//remove
				pilha.forEach(System.out::println);
				System.out.println("Um livro foi retirado da Pilha.");
				break;
			default:
				System.out.println("Entrada inválida.");
			}
		
				
			}
	
		
		
		
		
	}

}
