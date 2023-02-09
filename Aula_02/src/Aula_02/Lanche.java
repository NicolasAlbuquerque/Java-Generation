package Aula_02;

import java.util.Scanner;

public class Lanche {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("-----------------------------------");
		System.out.println("|------------Nico Lanches----------|");
		System.out.println("|----------------------------------|");
		System.out.println("|[1]-Cachorro Quente-----R$10,00---|");
		System.out.println("|[2]-X-Salada------------R$15,00---|");
		System.out.println("|[3]-X-Baccon------------R$18,00---|");
		System.out.println("|[4]-Bauru---------------R$12,00---|");
		System.out.println("|[5]-Refrigerante--------R$ 8,00---|");
		System.out.println("|[6]-Suco de Laranja.----R$13,00---|");
		System.out.println("|----------------------------------|");
		System.out.println("|-Entre com o numero do seu pedido-|");
		System.out.println(" ----------------------------------");
		int pedido,preco=0;
		pedido =sc.nextInt();
		System.out.println("Qual a quantidade?");
		int quantidade=sc.nextInt();
		
		switch (pedido) {
		case 1:
			 
				preco = 10;
			System.out.println("O valor do seu pedido é R$ " +( preco*quantidade));
			break;
		case 2:
			
				preco = 15;
			System.out.println("O valor do seu pedido é R$ " +( preco*quantidade));
			break;
		case 3:
			
				preco = 18;
			System.out.println("O valor do seu pedido é R$ " +( preco*quantidade));
			
			break;
		case 4:
			
			preco = 12;
			System.out.println("O valor do seu pedido é R$ " +( preco*quantidade));
			break;
		case 5:
			
				preco = 8;
			System.out.println("O valor do seu pedido é R$ " +( preco*quantidade));
			break;
		case 6:
			
				preco = 13;
			System.out.println("O valor do seu pedido é R$ " +( preco*quantidade));
			break;
			
			}
		
		
		
	}

}
