package aula_01;

import java.util.Scanner;

public class DiferençaDoProduto {

	public static void main(String[] args) {
	Scanner sc =new Scanner (System.in);
	int n1,n2,n3,n4;
	System.err.println("Digite o primeiro número: ");
	n1=sc.nextInt();
	System.out.println("Digite o segundo número: ");
	n2=sc.nextInt();
	System.out.println("Digite o terceiro número: ");
	n3=sc.nextInt();
	System.out.println("Digiite o quarto número: ");
	n4=sc.nextInt();
	int calculo= (n1 * n2)- (n3 * n4);
	
	System.out.println("A diferença é : "+ calculo);
	
	}

}
