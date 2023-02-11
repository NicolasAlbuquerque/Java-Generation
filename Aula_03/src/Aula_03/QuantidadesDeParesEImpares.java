package Aula_03;

import java.util.Scanner;

public class QuantidadesDeParesEImpares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, num2;
		int posi = 0,neg = 0;
		for(int c=1; c<=10;c++) {
			System.out.println("Digite o "+ c+"ª numero");
			num=sc.nextInt();
				if (num%2==0) 
					posi++;
				
				else 
					neg++;
				
		}
		System.out.println("Foram digitados: "+ posi+" numeros positivos.");
		System.out.println("Foram digitados: "+ neg+" numeros pnegativos.");
		sc.close();
	}

}
