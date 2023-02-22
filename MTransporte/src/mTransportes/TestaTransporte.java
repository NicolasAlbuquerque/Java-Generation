package mTransportes;

public class TestaTransporte {

	public static void main(String[] args) {


		Transporte t = new Transporte (5);
		Terrestre t1 = new Terrestre (5,4,200);
		 t1.visualizar();
		 System.out.println("\n");
		 t.visualizar();
		 Automovel a1 = new Automovel (5,4,200
,"Branco",0, "cdc -123",5);
		a1.visualizar();
		
		a1.mensagem();
		a1.mensagem("O carnaval acabou");
	}

	
}
