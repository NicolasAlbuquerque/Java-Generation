package Aula_03;

import java.util.Scanner;

public class TabuadaV2 {

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
			
		int c =0;
			while( c<=10) {
				System.out.println(numero +" x " +c+" = " + (c*numero));
		c++;}
		
				ok=false;
			System.out.println("Deseja Continuar?(S/N)");
			sc.skip("\\R?");
			continua=sc.nextLine();
		}while(continua.equalsIgnoreCase("S"));
		        


	}

}
