package ejerciciosTema4;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		
		String frase;
		boolean caracteres=false;
		int pos,n=0;
		int disLetras=0;
		double frecuencia;
		
		do {
			System.out.println("Dime una frase (maximo 60 caracteres)");
			frase=teclado.nextLine();
			frase=frase.toUpperCase();
			if (frase.length()<60) {
				caracteres=true;
			}//if_do-while
		}//do-while
		while (caracteres==false);
		
		for (int i='A'; i<='Z'; i++) {
			pos=frase.indexOf((char)i);
			n=0;
			if (pos!=-1) {
				disLetras++;
				n++;
				pos++;
				while (frase.indexOf((char)i,pos)!=-1) {
					n++;
					pos=frase.indexOf(i, pos)+1;
				}//while
				frecuencia=(double)n/frase.length();
				System.out.format("La letra "+(char)i+" tiene una frecuencia de "+"%.3f%n",frecuencia);
			}//if
		}//for
		System.out.println("La frase contiene "+disLetras+" letras distintas.");
	}//main

}//class
