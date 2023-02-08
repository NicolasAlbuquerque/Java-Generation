package aula_01;

import java.util.Scanner;

public class SalarioAbono {

	public static void main(String[] args) {
		float salario,abono;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com o Slário: ");
		salario= sc.nextFloat();
		System.out.println("Digite o Abono: ");
		abono= sc.nextFloat();
		float novoSalario=salario+abono;
		System.out.printf("O Seu salário é no valor de: R$ %.2f \n",salario);
		System.out.printf("O seu abono é no valor de: R$ %.2f \n",abono);
		System.out.printf("O salário atualizado é de: R$ %.2f " ,novoSalario);
	}

}
