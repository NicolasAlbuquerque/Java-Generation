package Games;

public class Produto {
	// Declarar os atributos
	private String nome;
	private double valor;
	private String tipo;
	private int id;
	private int ano;
	// Criar um metoro construtor	
	public Produto(String nome, double valor, String tipo, int id, int ano) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.tipo = tipo;
		this.id = id;
		this.ano = ano;
	}
	// Criar metodos acessores Get and Set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
        //declarar demais metodos da classe
	public void ImprimirInfo() {
	System.out.println("ID: " + id);
	System.out.println("nome: " + nome);
	System.out.println("Valor: "+ valor);
	System.out.println("Tipo de produto: "+ tipo );
	System.out.println("Ano de lançamento: " + ano);	
		
	
		
	}
	
	
	
	
	
}
