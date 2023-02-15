package Aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Scanner leia = new Scanner(System.in);

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
		
		
		int c;
	do {
		System.out.println("Digite um numero: ");		
		num=leia.nextInt();
		
			if (numeros.contains(num)) {
			System.out.println("O numero " + num + " existe? " + numeros.contains(num));
			System.out.println("O índice da numero é: " + numeros.indexOf(num));		
		System.out.println("-----------------------");
		
			}else
			System.out.println("O numero " +num+ " não está na lista.");
			System.out.println("Deseja continuar? [1] Sim.  [2] Não.");
			c=leia.nextInt();
		}while(c>1); 
		
		
		}


	}


