package Aula_03;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		int numero;
		boolean ok =false;
		Scanner sc= new Scanner(System.in);
		String continua;
		do {
			do {
				System.out.println("Digite a tabuada que você deseja Calcular.");	
				numero=sc.nextInt();
				if (numero <1 || numero >10)
					System.out.println("Digire um numero entre 1 e 10");
				else
					ok=true;
			
					
			}while (ok==false);
			
		
			for(int c =0; c<=10; c++) {
				System.out.println(numero +" x " +c+" = " + (c*numero));}
		
				ok=false;
			System.out.println("Deseja Continuar?(S/N)");
			sc.skip("\\R?");
			continua=sc.nextLine();
		}while(continua.equalsIgnoreCase("S"));
		        

			
		
		
	}

}

	
	

