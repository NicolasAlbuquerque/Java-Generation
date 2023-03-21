package Aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Double> notas = new ArrayList<Double>();

		Scanner leia = new Scanner(System.in);

		int opcao = 0;
		double nota = 0;

		do {

			System.out.println("1 - Cadastrar nota.");
			System.out.println("2 - Listar todas as notas.");
			System.out.println("3 - Buscar uma nota.");
			System.out.println("4 - Apagar uma nota.");
			System.out.println("5- Atualizar uma nota.");
			System.out.println("Digite a opção desejada: ");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite uma nota entre 1 e 10");
				nota = leia.nextDouble();
				notas.add(nota);
				break;
			case 2:
				System.out.println("Listar todas as notas");
				for (var listaNota : notas)
					System.out.println(listaNota);
				if(notas.isEmpty())
					System.err.println("Base de dados Vazia!");
				else
					notas.forEach(System.out::println);
				
				break;
			case 3:
				System.out.println("Procurar uma nota");
				System.out.println("Digite a nota: ");
				nota = leia.nextDouble();
				System.out.println("A nota " + nota + " existe? " + notas.contains(nota));
				System.out.println("O índice da nota é: " + notas.indexOf(nota));		
				break;
			case 4://apagar
				System.out.println("Remover uma nota.");
				nota=leia.nextDouble();
				notas.remove(nota);//nota
				//notas.remove(notas.indexOf(nota));//apaga o index
				break;
			case 5:
				System.out.println("Atualizar uma nota");
				System.out.println("Digite a nota atual: 0");
				nota=leia.nextDouble();
				System.out.println("Digite a nova nota:");
				double notaNova=leia.nextDouble();
				notas.set(notas.indexOf(nota),notaNova);
				
				break;
				
				
			}

		} while (opcao != 6);

		
	}

}

 