package Aula_04;

import java.util.Scanner;

public class Mtrizes {

	public static void main(String[] args) {
		int matizInteiros[][]= {{10,15,35},{70,120,140},{50,100,150}};
		 
		float [][] matriz= new float[2][2];
		
		Scanner leia =new Scanner(System.in);
		
	
		//ler as linhas 
		
		
		for(int indiceI=0 ; indiceI < matriz.length;indiceI++) { 
			
			//ler as colunas
			
			
			for(int indiceJ=0;indiceJ< matriz.length;indiceJ++) { 
				System.out.println("Digite um valor Real: ");
				matriz[indiceI][indiceJ]=leia.nextFloat();
			
		}
			
		}
		
		for(float[] vetor: matriz) {
			for(var elemento: vetor) {
				System.out.println(elemento);
			}
		}
		
		
		
		
		
		
		
		
		
		
		leia.close();
	}

}
