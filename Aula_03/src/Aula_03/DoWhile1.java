package Aula_03;

import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		double num;
        double  soma =0f;
       double media=0f;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Digite um numero: ");
            num= sc.nextDouble();

            if (num > 0 && num %3==0 ){
                soma=soma+num;
                media++;
            }

        }while(num!=0);


        System.out.println("a soma dos numeros positivos é de: "+ soma/media);



	}

}
