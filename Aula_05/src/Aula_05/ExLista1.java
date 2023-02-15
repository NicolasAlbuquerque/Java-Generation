package Aula_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExLista1 {

	public static void main(String[] args) {
		
		// 				Criando Array List
		ArrayList<String> cores = new ArrayList<String>();//criando a lista 
		Scanner leia = new Scanner (System.in);//scanner de entrada
		
		
		
		System.out.println("Entre com as Cores da lista: ");
			
		for (int i =0;i<=4;i++) {//for para rodar 4 vezes
			System.out.println("Entre com o "+( i+1 ) + "ª cor: ");
			String cor = leia.nextLine();		//lendo precisa de uma variável para atribuir o valor
			cores.add(cor);//add para jogar na lista. a entrada cor
		}
		System.out.println("-----------------------------");
		System.out.println("Lista de todas as Cores.");
		cores.forEach(System.out::println);
		
		System.out.println("-----------------------------");

		Collections.sort(cores);//organizar
		System.out.println("Lista organizada.");
		cores.forEach(System.out::println);
		
			}

}
