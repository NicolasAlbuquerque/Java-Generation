package Aula_05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);	
		Set<Integer> numeros=new HashSet<Integer>();
		int cont;
		int num;
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		
		
		do {
		System.out.println("Digite um numero: ");		
		num=leia.nextInt();
		
			if (numeros.contains(num)) {
			System.out.println("A nota " + num + " existe? " + numeros.contains(num));
		}else
			System.out.println("O numero " +num+ " não está na lista.");
			System.out.println("Deseja continuar? [1] Sim.  [2] Não.");
			cont=leia.nextInt();
		}while(cont <2);
		}
		
		
		
		}


