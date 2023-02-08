package aula_01;

import java.util.Scanner;

public class SalarioComAdicionais {

	public static void main(String[] args) {
		float salarioBruto;
		float adicionalNoturno,horasExtras,descontos;
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite o Salário: ");
		salarioBruto= sc.nextFloat();
		System.out.println("Digite o Adicional noturno: ");
		adicionalNoturno= sc.nextFloat();
		System.out.println("Digite o valor das horas extras: ");
		horasExtras= sc.nextFloat();
		System.out.println("Digite o valor de descontos: ");
		descontos= sc.nextFloat();
		float liquido= salarioBruto+adicionalNoturno+(horasExtras * 5)- descontos;
		System.out.printf("O salário Líquido é de: %.2f",liquido );

	}

}
