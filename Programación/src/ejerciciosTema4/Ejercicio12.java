package ejerciciosTema4;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);

		String frase,aux="";
		int k=0,c=0;
		boolean larga=true;
		
		do {
			System.out.println("Dime una frase (maximo 20 caracteres)");
			frase=teclado.nextLine();
			if (frase.length()<20) {
				larga=false;
			}//if_do-while
		}//do-while
		while (larga==true);
		
		for (int i=0; i<frase.length(); i++) {
			for (int j=0; j<frase.length(); j++) {
				aux+=frase.charAt(k);
				k++;
			}//for_for
			System.out.println(aux);
			k=c++;
			aux="";
		}//for
		
	}//main

}//class
