package Aula_02;

import java.util.Scanner;

public class SomaABC {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite um valor para A: ");
		a=sc.nextInt();
		System.out.println("Digite um valor para B: ");
		b=sc.nextInt();
		System.out.println("Digite um valor para C: ");
		c= sc.nextInt();
			if (a+b == c) 
				System.out.println("A soma dos valores A e B é igual ao valor C");
			else if (a+b > c)
				System.out.println("A soma dos valores A e B é maior que o valo C");
			else
				System.out.println("A soma dos valores a e B é menor que C");
				
	}

}
