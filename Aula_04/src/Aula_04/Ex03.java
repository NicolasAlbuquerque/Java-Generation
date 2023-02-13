package Aula_04;

public class Ex03 {

	public static void main(String[] args) {
		int matriz[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int dp=0,ds=0;
		
		for (int indice=0;indice<matriz.length;indice++) {
			System.out.println("Diagona principal "+ matriz[indice][indice]);
			dp+=matriz[indice][indice];
		}
		System.out.println("soma dos elementos da diagonal principal: "+dp);
		
		
		for (int indice=0;indice<matriz.length;indice++) {
			System.out.println("Diagona secundaria "+ matriz[indice][matriz.length-1-indice]);
			ds+=matriz[indice][matriz.length-1-indice];
		}
		System.out.println("soma dos elementos da diagonal principal: "+ds);
		}

}
