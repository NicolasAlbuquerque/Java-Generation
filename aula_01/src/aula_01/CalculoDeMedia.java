package aula_01;

import java.util.Scanner;

public class CalculoDeMedia {

	public static void main(String[] args) {
		
		String nome;
		Scanner sc= new Scanner (System.in);
		System.out.println("Digite o nome do aluno: ");
		sc.skip("\\R?");
		nome=sc.nextLine();
		System.out.println("Digite a primeira nota: ");
		float n1=sc.nextFloat();
		System.out.println("Digite a Segunda nota: ");
		float n2=sc.nextFloat();
		System.out.println("Digite a terceira nota: ");
		float n3 =sc.nextFloat();
		System.out.println("Digite a quarta nota: ");
		float n4=sc.nextFloat();
		float media=(n1+n2+n3+n4)/4;
		System.out.printf("A médio do aluno: "+ nome + " é : %.1f", media);
		
		
	}

}
