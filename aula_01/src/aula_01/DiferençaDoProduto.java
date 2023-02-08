package aula_01;

import java.util.Scanner;

public class DiferençaDoProduto {

	public static void main(String[] args) {
	Scanner sc =new Scanner (System.in);
	float n1,n2,n3,n4;
	System.out.println("Digite o primeiro número: ");
	n1=sc.nextFloat();
	System.out.println("Digite o segundo número: ");
	n2=sc.nextFloat();
	System.out.println("Digite o terceiro número: ");
	n3=sc.nextFloat();
	System.out.println("Digiite o quarto número: ");
	n4=sc.nextFloat();
	float calculo= (n1 * n2)- (n3 * n4);
	
	System.out.println("A diferença é : "+ (int)calculo);
	
	}

}
