package Aula_02;

import java.util.Scanner;

public class ParImparPositivoNegativo {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um numero: ");
		num= sc.nextInt();
		
		if (num % 2 ==0)
			System.out.println("O numero é Par.");
		else if (num !=0)
			System.out.println("O numero é Impar.");
		
		if (num <0)
			System.out.println("O numero é negativo.");
		else 
			System.out.println("O numeor é Positivo.");
	}

}
