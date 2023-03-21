package ExPOO04;

public class Medicamento extends Farmacia {
	public Medicamento(long id, String nome, String nomeComercial, String fabricante, String foto, float preco, int tipo, String principioAtivo2) {
		super(id, nome, nomeComercial, fabricante, foto, preco,tipo);
		
	}

	private String principioAtivo;

	public Medicamento(long id, String nome, String nomeComercial, String fabricante, String foto, float preco,
			String principioAtivo) {
		super(id, nome, nomeComercial, fabricante, foto, preco,tipo);
		this.principioAtivo = principioAtivo;
	}

	public String getPrincipioAtivo() {
		return principioAtivo;
	}

	public void setPrincipioAtivo(String principioAtivo) {
		this.principioAtivo = principioAtivo;
	}
	
	 public void visualizar() {
		 super.visualizar();
		 System.out.println("Principio Ativo "+ this.principioAtivo);
	 }

	@Override
	public void reajuste(float percentual) {
this.setPreco((this.getPreco() * percentual)+0.1f);		
	}

}
