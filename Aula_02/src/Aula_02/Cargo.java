package Aula_02;

import java.util.Scanner;

public class Cargo {

	public static void main(String[] args) {
		int func=0;
		int perc=0;
		int salario;
		String nome;
		Scanner  sc = new Scanner (System.in);
		
		System.out.println(" --------Selecione sua funçaõ----------");
		System.out.println("|--------------------------------------|");
		System.out.println("|GERENTE--------------------------- [1]|");
		System.out.println("|VENDEDOR-------------------------- [2]|");
		System.out.println("|SUPERVISOR------------------------ [3]|");
		System.out.println("|MOTORISTA------------------------- [4]|");
		System.out.println("|ESTOQUISTA------------------------ [5]|");
		System.out.println("|TECNOCOS DE TI-------------------- [6]|");
		System.out.println("|--------------------------------------|");
		System.out.println("|--------------------------------------|");
		System.out.println("INFORME O NOME DO FUNCIONÁRIO: ");
		nome=sc.next();
		System.out.println("INFORME SUA FUNÇÃO:[]");
		func=sc.nextInt();
		
		System.out.println("INFORME SEU SALÁRIO:");
		salario=sc.nextInt();
	

			switch (func) {
			case 1 : 
				perc=10;
				System.out.println("O Salário com Reajuste do funcionário, "+nome+" é: R$ "+ (salario+salario*perc/100)+",00");
				break;
			case 2:
				perc=7;
				System.out.println("O Salário com Reajuste do funcionário, "+nome+" é: R$ "+ (salario+salario*perc/100)+",00");
				
				break;
			case 3:
				perc=9;
				System.out.println("O Salário com Reajuste do funcionário, "+nome+" é: R$ "+ (salario+salario*perc/100)+",00");
				
				break;
			case 4:
				perc=6;
				System.out.println("O Salário com Reajuste do funcionário, "+nome+" é: R$ "+ (salario+salario*perc/100)+",00");
				
				break;
			case 5:
				perc=5;
				System.out.println("O Salário com Reajuste do funcionário, "+nome+" é: R$ "+ (salario+salario*perc/100)+",00");
				
				break;
			case 6: 
				perc=8;
				System.out.println("O Salário com Reajuste do funcionário, "+nome+" é: R$ "+ (salario+salario*perc/100)+",00");
				
				break;
				
			}
		
	
		
	}

}
