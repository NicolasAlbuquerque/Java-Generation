package Aula_03;

import java.util.Scanner;

public class DivisiveisPor3e7 {

	public static void main(String[] args) {
		int num;
		int num1,num2;
		Scanner sc = new Scanner(System.in);	
		System.out.println("Escolha dois numeros inteiros sendo o Primeiro Menos que o Segundo.\nEm seguida, o Algoritmo mostrará os multiplos de 3 e 5.");
		System.out.println("Digite o 1º número: ");
		num1= sc.nextInt();
		System.out.println("Digite o 2ºnúmero: ");
		num2= sc.nextInt(); 
					for (int c=num1; c<= num2; c++) {
						if (c%3==0 && c%5==0) {
							System.out.println(c);}
					}if (num2<num1)
						System.out.println("entrada inválida");
					else if (num1<0 && num2<0)
						System.out.println("Entravada inválida.");
						
		sc.close();

					
	}
}