package ejerciciosTema4;

import java.util.Scanner;

public class Ejercicio2_5 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		
		String palabra;
		String aux, auxf;
		char letrai, letraf;
		
		System.out.println("Dime una palabra");
		palabra=teclado.nextLine();
		
		letrai=palabra.charAt(0);
		letraf=palabra.charAt(palabra.length()-1);
		aux=palabra.substring(1,(palabra.length()-1));
		
		auxf=letraf+aux+letrai;
		
		System.out.println(auxf);

	}//main

}//class
