package produtos;

public class TesteProduto {

	public static void main(String[] args) {
		Produtos jogo1 = new Produtos("God of War", 2010, "EIDOS", 120.00, "Aventura", 10);
		Produtos jogo2 = new Produtos("Just Dance",  2010, "EIDOS", 120.00, "Aventura", 10);
		Produtos jogo3 = new Produtos("Civilization",  2010, "EIDOS", 120.00, "Aventura", 10);
		Produtos jogo4 = new Produtos("Cup Head",  2010, "EIDOS", 120.00, "Aventura", 10);
		
		jogo1.Visualizar();

	}

}
