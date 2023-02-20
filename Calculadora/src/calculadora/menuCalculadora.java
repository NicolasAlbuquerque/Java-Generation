package calculadora;

import java.util.Scanner;

public class menuCalculadora {
		
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int opcao = 0;
		
		double numero1, numero2;
		
		while(true) {
		
			System.out.println(" [1] soma\n [2] subtração\n [3] multiplicação\n [4] divisão.");
			System.out.println("Digite o numero da operação:");
		opcao=leia.nextInt();
		
		if (opcao ==0) {
		leia.close();
		System.exit(0);
		
		
		}
		
			
		System.out.println("Digite o primeiro numero: ");
		numero1=leia.nextDouble();
		
		System.out.println("Digite o segundo numero: ");
		numero2=leia.nextFloat();
		
		
		
		switch(opcao) {
		case 1 -> System.out.println("Soma " + Calculos.soma (numero1,numero2));
		case 2 -> System.out.println("Subtração " + Calculos.subt (numero1,numero2));
		case 3 -> System.out.println("Multiplicação " + Calculos.mult (numero1,numero2));
		case 4 -> System.out.println("Divisão " + Calculos.div (numero1,numero2));
		default -> System.out.println("Opção Inválida.");
		}
		
		}
		
	}}



