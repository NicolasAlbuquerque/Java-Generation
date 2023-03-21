package ExPOO04;

public class Perfumaria extends Farmacia  {
	
	public Perfumaria(long id, String nome, String nomeComercial, String fabricante, String foto, float preco) {
		super(id, nome, nomeComercial, fabricante, foto, preco,tipo);
	}

	private String Fragancia;

	public Perfumaria(long id, String nome, String nomeComercial, String fabricante, String foto, float preco,
			int tipo, String fragancia) {
		super(id, nome, nomeComercial, fabricante, foto, preco,tipo);
		Fragancia = fragancia;
	}

	public String getFragancia() {
		return Fragancia;
	}

	public void setFragancia(String fragancia) {
		Fragancia = fragancia;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Fragancia: "+ this.Fragancia);
	}

	@Override
	public void reajuste(float percentual) {
this.setPreco((this.getPreco() * percentual));		
	}
	
}
