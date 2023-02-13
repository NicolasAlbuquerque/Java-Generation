package Aula_04;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		   int vetor1[] = {2, 5, 1, 4, 9, 7, 8, 10, 3, 6};

	        Scanner leia = new Scanner(System.in);
	        boolean estaouNao = false;
	        System.out.println("Digite um numero para ser localizado no vetor: ");
	        int num = leia.nextInt();


	        int pos = Arrays.binarySearch(vetor1, num);
	        System.out.println(pos);

	        for (int i=0;i<vetor1.length;i++){
	            if (vetor1[i]==num){
	               pos =i;
	                estaouNao=true;

	            }
	         }

	        if (estaouNao == true) {
	            System.out.println("Encontrei o valor: " + num + " Na posição: " + pos);
	        } else {
	            System.err.println("Numero não encontrado");
	        }

	}}