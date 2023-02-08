package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		int number;
		
		double area ;
		DecimalFormat df = new DecimalFormat("###.##");
		Scanner leia = new Scanner(System.in);
		String name="Nicolas Albuquerque";
		System.out.println("i am  : "+ name);
		System.out.println("Digite um numero inteiro: ");
		number=leia.nextInt();
		System.out.println("Digite o seu nome: ");
		leia.skip("\\R?");
		name=leia.nextLine();
		System.out.println("Digite um valor real: ");
		area=leia.nextDouble();
				
		
		
		
		System.out.println("Your name: " + name);
		System.out.println("The number is: "+ number);
		System.out.printf("The number is: %.2f \n", area);
		System.out.printf("The number is: "+ df.format(area));
		
		

	}

}
