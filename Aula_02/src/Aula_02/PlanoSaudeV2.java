package Aula_02;

import java.util.Scanner;

public class PlanoSaudeV2 {

	public static void main(String[] args) {
		
		int faixa;
		Scanner sc = new Scanner (System.in);
		System.out.println(" -----------Plano de Saúde-------------");
		System.out.println("|--------------------------------------|");
		System.out.println("|Se você tem entre  0 à 10, escolha [1]|");
		System.out.println("|Se você tem entre 10 à 29, escolha [2]|");
		System.out.println("|Se você tem entre 30 à 45, escolha [3]|");
		System.out.println("|Se você tem entre 46 à 59, escolha [4]|");
		System.out.println("|Se você tem entre 60 à 65, escolha [5]|");
		System.out.println("|Se você tem mais que  65, escolha  [6]|");
		System.out.println("|--------------------------------------|");
		System.out.println("|--------------------------------------|");
		
		System.out.println("|       Informe a faixa etária:[]      | ");
		System.out.println(" --------------------------------------");
		faixa =sc.nextInt();
		switch (faixa) {
		case 1: 
			System.out.println("O Valor do seu plano é de R$100,00.");
			break;
			
		case 2:
			System.out.println("O Valor do seu plano é de R$200,00.");
			break;
		case 3:
			System.out.println("O Valor do seu plano é de R$300,00.");
			break;
		case 4:
			System.out.println("O Valor do seu plano é de R$500,00.");
			break;
		case 5:
			System.out.println("O Valor do seu plano é de R$600,00.");
			break;
		case 6:
			System.out.println("O Valor do seu plano é de R$1000,00.");
			break;
		default:
			System.out.println("Faixa etária inválida.");
		
		
			
			
		}
	}
			

}
