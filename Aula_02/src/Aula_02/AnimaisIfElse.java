package Aula_02;

import java.util.Scanner;

public class AnimaisIfElse {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String animal01,animal02, animal03;
		System.out.println("Digite o 1ª animal");
		sc.skip("\\R?");
		animal01=sc.nextLine();
		System.out.println("Digite o 2ª animal");
		sc.skip("\\R?");
		animal02=sc.nextLine();
		System.out.println("Digite o 3ª animal");
		sc.skip("\\R?");
		animal03=sc.nextLine();
		//String.equals();
		
		if (animal01.equals("vertebrado")) {
			if(animal02.equals("ave")) {
				if(animal03.equals("carnivoro")) {
					System.out.println("Águia");
				}
				else {
					System.out.println("Pomba");
				}
			}
			else {
				if (animal03.equals("onivoro"))
					System.out.println("homem");
				else
					System.out.println("vaca");
			}
		}else {if(animal02.equals("inseto")) {
			if(animal03.equals("hematofago")) {
				System.out.println("pulga");
			}
			else {
				System.out.println("lagarta");
			}
		}
		else {
			if (animal03.equals("hematofago"))
				System.out.println("sanguessuga");
			else
				System.out.println("minhoca");

			
		}
		
		
		

	}

	}
}
