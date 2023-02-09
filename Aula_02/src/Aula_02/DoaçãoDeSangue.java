package Aula_02;

import java.util.Scanner;

public class DoaçãoDeSangue {

	public static void main(String[] args) {
		boolean doador ;
		Scanner sc =new Scanner(System.in);
		String nome;
		int idade;
		
		System.out.println("Informe o nome do doador: ");
		nome=sc.nextLine();
		System.out.println("Digite sua idade: ");
		idade=sc.nextInt();
		System.out.println("Já fez doação?");
		doador = sc.nextBoolean();
			if (idade >=18 && idade <=59) {
				System.out.println(nome + "Está Apto a doar.");}
			else if (idade >60 && doador ==false )
				System.out.println(nome + "Está Apto a doar.");
			else 
				System.out.println("Não está Apto a Doar.");
			
		}
		
		
	}


