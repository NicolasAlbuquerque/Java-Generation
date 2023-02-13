package Aula_04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		float pares=0, impares=0, soma=0,media;
		Scanner leia = new Scanner (System.in);
		 int vetorInteiros []= new int [10];
		
		 
		 //Preenchendo um vetor.
		 for(int i=0; i< vetorInteiros.length; i++) {
			 System.out.println("Entre com um numero: ");
			 int numero=leia.nextInt();
			 vetorInteiros[i]=numero;
			 
		 }
		 	
		 //numeros impares.

		 System.out.print("Os indices impares são: " );

		 for(int i= 0; i< vetorInteiros.length; i++) {
			 if (i % 2 != 0)
				 System.out.print( vetorInteiros[i]+" ");
			 }
		 //numeros pares
		 System.out.print("\nOs indices pares são: ");
		 for(int i= 0; i< vetorInteiros.length; i++) {
			 if (vetorInteiros[i] % 2 == 0)
				 System.out.print( vetorInteiros[i]+" ");
			 }
		 //somando
		 System.out.print("\nA Soma é : ");
		 for(int i= 0; i< vetorInteiros.length; i++) {
			 soma=soma+vetorInteiros[i];
			  }
		 System.out.println(soma);
		 
		media=soma/10;
		System.err.println("A média é :"+media);
		 
		 
		
		
		 }
	}


