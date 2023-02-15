package Aula_05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
			
		
		//			Criando uma Collection Queue//Fila
		Queue<String> fila = new LinkedList<String>();
		Scanner leia=new Scanner(System.in);
		int option=6;//variável para entrada de dados no menu.
		String cli;
			//Laço de repetição para exibição do menu.
		do {//do faz a ação pelo menos uma vez.
		System.out.println(" ---------------------------------- ");
		System.out.println("| Digite para seleciona uma opção: | ");
		System.out.println("| [1]- Adicionar Cliente a fila.   |");
		System.out.println("| [2]- Listar todos os Clientes.   |");
		System.out.println("| [3]- Retirar Cliente da fila.    |");
		System.out.println("| [0]- Sair.                       |");
		System.out.println(" ----------------------------------");
		option=leia.nextInt();//Lê a entrada da variável.
		
		
			switch(option) {//montagem do Switch para selecionar asopções.
			
			case 1 :
				System.out.println("Adicionar Cliente.");
				leia.skip("\\R?");
				cli=leia.nextLine();//lê o nome e coloca na variável.
				fila.add(cli);//metodo para inserir o nome da variável na fila/Collection
				System.out.println("Fila:");
				fila.forEach(System.out::println);//For Each imprime os nomes da lista
				System.out.println("Cliente Adicionado!");
				break;
			
			case 2: 
				
				System.out.println("Lista de Cliente na fila.");
				fila.forEach(System.out::println);//For Each imprime os nomes da lista

				
				break;
				
			case 3: 
				System.out.println("Fila: ");
				if(fila.isEmpty()) {
					System.out.println("A fila está vazia.");
				}else {
				fila.poll();//remove e mostra na tela o que foi removido
				System.out.println("O Cliente foi chamado!");
				}
				break;
			default:
				System.out.println("Programa Finalizado");
			}
		
		
		}while(option!=0);//delimita o final do laço de repetição.
		
			
		
		
		
		
	
	}

}
