package ExPOO04;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class TestaFarmacia {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int tipo;
		ArrayList<Farmacia> medicamentos = new ArrayList<Farmacia>();
		
		long id;
		String nome,principioAtivo,fragancia, nomeComercial, fabricante, foto, opcao;
		float preco;
		
		do {
			
		System.out.println("\nId: " );
		id = leia.nextLong();
		
		System.out.println("\nNome: " );
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		System.out.println("\nNome Comercial: " );
		nomeComercial = leia.nextLine();
		
		System.out.println("\nFabricante: " );
		fabricante = leia.nextLine();
		
		System.out.println("\nFoto: " );
		foto = leia.nextLine();
		
		System.out.println("\nPreÃ§o: " );
		preco = leia.nextFloat();
		
		System.out.println("\n tipo");
		tipo =leia.nextInt();
		
		switch(tipo) {
		case 1 ->{
			System.out.println("\nprincipio ativo: " );
			principioAtivo = leia.nextLine();
			
			Medicamento m=new Medicamento (id, opcao, opcao, opcao, opcao, preco, tipo, opcao);
			
			
			Medicamento m1 = new Medicamento(id, nome, nomeComercial, fabricante, foto, preco,tipo,principioAtivo);
			medicamentos.add(m1);
			
		}
		case 2 ->{
			System.out.println("\nFragancia: " );
			fragancia = leia.nextLine();
			}
		Perfumaria p1 = new Perfumaria(id, nome, nomeComercial, fabricante, foto, preco,tipo,fragancia);
		perfumaria.add(p1);
		
		}
	
		Medicamento m1 = new Medicamento(id, nome, nomeComercial, fabricante, foto, preco,tipo,principioAtivo);

		medicamentos.add(m1);
		
		System.out.println("\nDeseja continuar? " );
		leia.skip("\\R?");
		opcao = leia.nextLine();
		
		}while(opcao.equalsIgnoreCase("S"));
		
		
		for(var medicamento : medicamentos)
			medicamento.visualizar();
		
		//Farmacia f2 = new Farmacia(2, "Paracetamol", "Tylenol", "Neo Quimica", "-", 20.0f);

		//f1.visualizar();
		
		//f2.visualizar();
		
		leia.close();
	}

}