package Aula_02;

import java.util.Scanner;

public class IdadeDe10Pessoas {

	public static void main(String[] args) {
		int c = 1 ,idade ;
		Scanner sc = new Scanner(System.in);
		int maior=0, menor=0;
		while (c<=11) {
			System.out.println("Digite a idade: ");
			idade=sc.nextInt();
			c++;
			if (idade <21)
				menor++;
			else if (idade >50)
				maior++;
				
		}
		
		System.out.println("O numer de pessoas menos de 21 anos: "+menor);
		System.err.println("O numero de pessoas maiores de 50 anos: "+maior);
		
	}

}
