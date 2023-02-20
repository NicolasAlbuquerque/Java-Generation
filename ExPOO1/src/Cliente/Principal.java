package Cliente;

public class Principal {

	public static void main(String[] args) {
		Cliente cli1= new Cliente("Nicolas Albuquerque", 445542114, "Rua Domingos dos Santos Gomes nª 370", 953522907, false,123);
		Cliente cli2= new Cliente("Ariane Albuquerque", 445542114, "Rua Domingos dos Santos Gomes nª 370", 953522907, false,456);
		Cliente cli3= new Cliente("Elisabett Albuquerque", 445542114, "Rua Domingos dos Santos Gomes nª 370", 953522907, false,789);
		Cliente cli4= new Cliente("Valdir Ribeiro", 445542114, "Rua Domingos dos Santos Gomes nª 370", 953522907, false,1123);
		Cliente cli5= new Cliente("Nicolas", 445542114, "Rua Domingos dos Santos Gomes nª 370", 953522907, false,1456);
		
		
	
		cli1.Visualizar();
		cli2.Visualizar();
		cli3.Visualizar();
		cli4.Visualizar();
		cli5.Visualizar();

	}



}
