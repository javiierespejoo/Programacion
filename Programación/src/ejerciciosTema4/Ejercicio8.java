package ejerciciosTema4;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);

		String frase, codificado="";
		
		System.out.println("Dime una frase");
		frase=teclado.nextLine();
		frase=frase.toUpperCase();
		
		for (int i=0; i<frase.length(); i++) {
			codificado+=(char) (frase.charAt(i)+3);
		}//for
		System.out.println("Tu frase codificada es: "+codificado);
	}//main

}//class
