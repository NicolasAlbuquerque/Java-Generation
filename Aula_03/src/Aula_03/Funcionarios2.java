package Aula_03;

import java.util.Scanner;

public class Funcionarios2 {

	public static void main(String[] args) {
		int idade,sex,categ,backend=0,front=0,mobile=0,fullS=0;
		String cont ="s";
		Scanner sc=new Scanner(System.in);		
		
		while(cont.equalsIgnoreCase("s")){		
				System.out.println("Digite sua idade: ");
				idade=sc.nextInt();
				System.out.println("Digite seu genero: \n [1] HOMEM\n [M] MULHER\n [3] OUTRO");
				sex=sc.nextInt();
				System.out.println("Digite a Categoria:\n [1] Backend \n [2] FrontEnd \n [3] Mobile \n [4]FullStack");
				categ=sc.nextInt();
				
				if (categ== 1) {
					backend++;}
				if (categ==2 && sex ==2 && idade<30)
					front++;
				if (categ==3 && sex==1 &&idade>40)
					mobile++;
				if (categ==4&&idade<30)
					fullS++;
				
				System.out.println("Deseja Continuar [S/N]");
				sc.skip("\\R?");
				cont=sc.nextLine();
		}
		System.out.println("o numero de pessoas beckEnd " + backend);
		System.out.println("O numero de mulheres FrontEdn menores de 30 anos "+ front);
		System.out.println("O numero de Homens Maiores de 40 anos desenvolvedores mobile: "+ mobile);
	
	
				
	}

}
