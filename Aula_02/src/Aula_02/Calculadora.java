package Aula_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		double x, y;
		DecimalFormat df = new DecimalFormat("###.##");
		Scanner sc= new Scanner (System.in);
		System.out.println("Entre com o primeiro numero: ");
	    x= sc.nextDouble();
	    System.out.println("Entre com o segunndo numero: ");
	    y= sc.nextDouble();
	    System.out.println(x+y);
	    System.out.println(x-y);
	    System.out.println(x*y);
	    if (y!=0) {
	    	System.out.println(x/y);}
	    else {
	    	System.out.println("Não é possivel dividir um numero por zero");}
	    System.out.println(x+=y);
	    System.out.println("O numero  "+ x + " Elevado ao numero " + y + " é igual a "+ Math.pow(x, y));

	    System.out.println("A raiz quadrada do numero  "+ x + " é igual a "+ df.format(Math.sqrt(x)));
	  System.out.println(Math.random());
	  
	/* System.out.println("pré-incremento");
	  System.out.println(x);
	  System.out.println(++ x);
	  System.out.println("Pós-Incremento");
	  System.out.println(y);
	  System.out.println(y++);
	  System.out.println(y);
	  System.out.println("pré-incremento");
	  System.out.println(x);
	  System.out.println(-- x);
	  System.out.println("Pós-Incremento");
	  System.out.println(y);
	  System.out.println(y--);
	  System.out.println(y);
	  System.out.println("-------");
	  
	  System.out.println(x=x+y);
	  System.out.println(x+=y);
	  */
	 
	  
	  
	  
	    sc.close();
	}

}
