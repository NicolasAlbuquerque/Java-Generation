package produtos;


public class Produtos {
	private String nome;
	private int ano;
	private String Produtora;
	private double valor;
	private String genero;
	private int quantidade;
	public Produtos(String nome, int ano, String produtora, double valor, String genero, int quantidade) {
		super();
		this.nome = nome;
		this.ano = ano;
		Produtora = produtora;
		this.valor = valor;
		this.genero = genero;
		this.quantidade = quantidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getProdutora() {
		return Produtora;
	}
	public void setProdutora(String produtora) {
		Produtora = produtora;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public void Visualizar() {
		System.out.println("|------------------------------------------|");
		System.out.println("|------------------Produtos----------------|");
		System.out.println("|------------------------------------------|");
		System.out.println("| Nome: "+ getNome());
		System.out.println("| Produtora: "+ getProdutora());
		System.out.println("| Ano de lançamento: "+getAno());
		System.out.println("| Genero: "+ getGenero());
		System.out.println("| Quangtidade: "+getQuantidade());
		System.out.println("| Valor: R$"+ getValor());
	}

}
