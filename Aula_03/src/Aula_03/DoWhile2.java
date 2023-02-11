package Aula_03;

import java.util.Scanner;

public class DoWhile2 {

		

		public class DoWhileEx1 {
		    public static void main (String[]args){
		        int num;
		        int soma =0;
		        Scanner sc = new Scanner(System.in);
		        do{
		            System.out.println("Digite um numero: ");
		            num= sc.nextInt();

		            if (num >0){
		                soma=soma+num;
		            }

		        }while(num!=0);


		        System.out.println("a soma dos numeros positivos é de: "+ soma);



		    }
		}
	}


