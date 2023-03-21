package principal;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	static Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) throws minhaExcecao {
		
		int dividendo = 0;
		int divisor = 0;
		boolean loop =true;
		do {
		try {
			System.out.println("Digite o Dividendo: ");
			dividendo = ler.nextInt();
					
			System.out.println("Digite o Divisor: ");
			divisor = ler.nextInt();
			divide(dividendo, divisor);
			loop=false;
		}catch(InputMismatchException e	) {
			System.err.println("exceção " + e);
			ler.nextLine();
			System.err.println("Digite apenas numeros");
		}catch (ArithmeticException e) {
			System.err.println("exceção " + e);
			System.err.println("Não exitem divisões por zero.");
			System.err.println("Digite um nuemro diferente de zero.");

		}finally {
			System.out.println("Sempre serei executado!");
			
		}
		
		
		}while(loop);
		
	}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
		//if ((dividendo/divisor)>5)throws minhaExcecao{
		//	throw new minhaExcecao()("A divisão é maior do que 5");

		}
	}

}