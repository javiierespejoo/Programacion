package ejerciciosTema4;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		String frase;
		int v=0,c=0,n=0,s=0;
		
		System.out.println("Dime una frase (maximo 80 caracteres)");
		frase=teclado.nextLine();
		frase=frase.toLowerCase();
		
		do {
			System.out.println("Dime una frase (maximo 80 caracteres)");
			frase=teclado.nextLine();
			frase=frase.toLowerCase();
		}//do_while
		while (frase.length()>80);
		if (frase.length()<80) {
			for (int i=0; i<frase.length(); i++) {
				if (frase.charAt(i)>=97 && frase.charAt(i)<=122) {
					if (frase.charAt(i)=='a'||frase.charAt(i)=='e'||frase.charAt(i)=='i'||frase.charAt(i)=='o'||frase.charAt(i)=='u') {
						v++;
					}//if_if
					else if (frase.charAt(i)!='a'||frase.charAt(i)!='e'||frase.charAt(i)!='i'||frase.charAt(i)!='o'||frase.charAt(i)!='u') {
						c++;
					}//else_if
				}//if_for
				else {	
					if (frase.charAt(i)>=48 && frase.charAt(i)<=57) {
						n++;
					}//if_else
					else {
						s++;
					}//else_else
				}//else for
			}//for
			System.out.println("La frase que me has dicho contiene: ");
			System.out.println(v+" Vocales");
			System.out.println(c+"Consonantes");
			System.out.println(n+"Numeros");
			System.out.println(s+"Simbolos");
		}//if
		
	}//main

}//class
