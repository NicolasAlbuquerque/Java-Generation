package AulaMetodos;

import static AulaMetodos.pacote2.Classe2.*;

public class TesteMetodos {

	public static void main(String[] args) {

		metodoPublic();
		metodoPadrao();
		metodoProtegido();
		metodoPrivado();
		System.out.println(soma(2,4));
		Classe1.metodoFriendly1();
		Classe1.metodoProtegido1();
		Classe1.metodoPublico1();
		//Classe1.metodoPrivado1();
		
		
		//Metodo Pacote 2classe 2
		
		//metodos protegido e privado de outros pacotes não abrem.
		metodoPublicoPacote1();
		metodoPublicoPacote1();
	//	metodoFriendlyPacote1(); modificadores de acesso
	//	metodoProtegidoPacote1();
	//	metodoPrivadoPacote1();
	}
	
	//		Criando um metodo.
	public static void metodoPublic() {
		System.out.println("Eu sou um metodo Publico");
	}
	
	public static int soma(int numero1,int numero2) {
		return numero1+numero2;
		
	}
	
	//		Criando um metodo padrão.
	static void metodoPadrao() {
		System.out.println("Eu sou um metodo Friendly");
		
		
	}
	
	
	//		Criando um metodo protegido.
	protected static void metodoProtegido() {
		System.out.println("Eu sou um metodo Protegido");
		
		
	}
	
	
	//		Criando um metodo privado.
	private static void metodoPrivado() {
		System.out.println("Eu sou um metodo Privado");
		
		
	}
	
	
	
	
}
