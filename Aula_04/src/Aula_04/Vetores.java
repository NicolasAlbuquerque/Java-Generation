package Aula_04;

import java.util.Arrays;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float vetorFloat[] = new float [5];
		
		int vetorInteiros[] = {10,20,30,40,50};
		
		for(int contador=0;contador<vetorInteiros.length;contador ++)
		
			System.out.println("Posição "+contador+ " = "+vetorInteiros[contador]);
	
	for (int indice=0; indice < vetorFloat.length;indice ++) {
		
		System.out.println("Digite um valor para a posição ["+indice+"]");
		
		vetorFloat[indice]=leia.nextFloat();
	
	}
	
	
	
	Arrays.sort(vetorFloat);//Ordena os dados do vetor em ordem crescente.
	
	
	//for it exclusivo para estrutura de dados
	for(var numero:vetorFloat)
		System.out.println(numero);
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	leia.close();
	}

	
	
	
	
	
	
}
