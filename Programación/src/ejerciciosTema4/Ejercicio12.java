package ejerciciosTema4;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);

		String frase,aux="";
		int k=0,c=0;
		boolean larga=true;
		char letra;
		
		do {
			System.out.println("Dime una frase (maximo 20 caracteres)");
			frase=teclado.nextLine();
			frase=frase.toUpperCase();
			if (frase.length()<20) {
				larga=false;
			}//if_do-while
		}//do-while
		while (larga==true);
		System.out.println(frase);
		for (int i=0; i<frase.length()-1; i++) {
			aux="";
			letra=frase.charAt(frase.length()-1);
			aux+=letra;
			aux+=frase.substring(0,frase.length()-1);
			System.out.println(aux);
			frase=aux;
		}//for
	}//main

}//class
