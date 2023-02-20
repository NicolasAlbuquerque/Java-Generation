package Cliente;

public class Cliente {

	private String name;
	private double cpf;
	private String enderec;
	private int tel;
	private boolean cadastro;
	private int numeroConta;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCpf() {
		return cpf;
	}

	public void setCpf(double cpf) {
		this.cpf = cpf;
	}

	public String getEnderec() {
		return enderec;
	}

	public void setEnderec(String enderec) {
		this.enderec = enderec;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public boolean isCadastro() {
		return cadastro;
	}

	public void setCadastro(boolean cadastro) {
		this.cadastro = cadastro;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Cliente(String name, double cpf, String enderec, int tel, boolean cadastro, int numeroConta) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.enderec = enderec;
		this.tel = tel;
		this.cadastro = cadastro;
		this.numeroConta = numeroConta;
	}

	public void Visualizar () {
		
		System.out.println("|------------------------------------------------------|");
		System.out.println("|------------------------Cliente-----------------------|");
		System.out.println("|------------------------------------------------------|");
		System.out.println("|------------------------------------------------------|");

		System.out.println("| Numero da Conta: "+getNumeroConta());
		System.out.println("| Nome do Titular: "+getName());
		System.out.println("| CPF: "+getCpf());
		System.out.println("| Endereço: "+getEnderec());
		System.out.println("| telefone: "+getTel());
		System.out.println("");

	}
	
}
