package funcionario;

public class Funcionario {
	
	private String nome;
	private int numeroRegistro;
	private String Cargo;
	private double salario;
	private String filial;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	public String getCargo() {
		return Cargo;
	}
	public void setCargo(String cargo) {
		Cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getFilial() {
		return filial;
	}
	public void setFilial(String filial) {
		this.filial = filial;
	}
	public Funcionario(String nome, int numeroRegistro, String cargo, double salario, String filial) {
		super();
		this.nome = nome;
		this.numeroRegistro = numeroRegistro;
		Cargo = cargo;
		this.salario = salario;
		this.filial = filial;
	}
	public void Visualizar() {
		System.out.println("|------------------------------------------------------|");
		System.out.println("|----------------------Funcionários--------------------|");
		System.out.println("|------------------------------------------------------|");
		System.out.println("| Nome: "+getNome());
		System.out.println("| Numero de Registro: "+getNumeroRegistro());
		System.out.println("| Cargo: "+ getCargo());
		System.out.println("| Salário: $"+getSalario()+" Dolares");
		System.out.println("| Filial: "+getFilial());
		System.out.println("|------------------------------------------------------|");

	}

}
