package Aula_05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex3 {

	public static void main(String[] args) {
		
		//					 CRIANDO MEU SET
		Set<Integer> numeros = new HashSet<Integer>();
		Scanner leia =new Scanner(System.in);
		int numero;//VARIAVEL PARA RECEBER O VALOR DO SCANNER.
		System.out.println("Digite a quantidade de numeros que você quer entrar: ");
		//for para receber os numeros.
		for(int i=0;i <=9;i++) {
			System.err.println("Digite o "+ (i+1)+"ª numero: ");
			 numero = leia.nextInt();//lendo o numero.
			numeros.add(numero);//atribuindo a minha lista.
			
		}
		//				CRIANDO ITERATOR
		//serve para percorrer a lista que você criou
		Iterator<Integer> meuIterator = numeros.iterator();
		
		//utilizar o metodo para imprimir cada linha do set
		System.out.println("Lista de Dados do Set.");
		//usar while por não saber quantas linhas tem
		while(meuIterator.hasNext()) {//pergunta pra lista SET se há próximo número na lista.
			
		System.out.println(meuIterator.next());//imprime o próximo numero.
		}

	}

}
