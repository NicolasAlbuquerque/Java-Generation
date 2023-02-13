package Aula_04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		float matriz [][]=new float [3][4];
		float media[]=new float[3];
		float soma=0.0f;
		Scanner leia = new Scanner(System.in);
			for (int linha= 0; linha < matriz.length;linha++){
				for(int coluna=0;coluna < matriz[linha].length;coluna++) {
					System.out.println("Digite a nota");
				matriz [linha][coluna]=leia.nextFloat();
				
				
				}
				}
				
				for (int linha= 0; linha < matriz.length;linha++)
				for(int coluna=0;coluna < matriz[linha].length;coluna++) {
				soma+=matriz[linha][coluna];
				
				
				
			media [linha]= soma/matriz[linha].length;
				
				}
				
				for (var medias:media)
					System.out.println(medias);
		leia.close();
		
	}

	}
