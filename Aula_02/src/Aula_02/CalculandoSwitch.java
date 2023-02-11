package Aula_02;

import java.util.Scanner;

public class CalculandoSwitch {

	public static void main(String[] args) {
		int n1,n2,operation;
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o primeiro numero: ");
		n1= sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2=sc.nextInt();
		
		System.out.println("Selecione o operador matemático: ");
		System.out.println("[1]  + ");
		System.out.println("[2]  - ");
		System.out.println("[3]  * ");
		System.out.println("[4]  / ");

		operation=sc.nextInt();
		switch (operation) {
		case 1:
			System.out.println(n1+" + "+n2+ " = " +(n1+n2));
			break;
		case 2:
			System.out.println(n1+" + "+n2+ " = " +(n1-n2));
			break;
		case 3:
			System.out.println(n1+" + "+n2+ " = " +(n1*n2));
			break;
		case 4:
			System.out.println(n1+" + "+n2+ " = " +(n1/n2));
			break;
			
			
			
			
		
		
		}
	
	}

}
