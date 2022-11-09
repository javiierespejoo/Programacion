package ejerciciosTema4;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		
		String frase;
		int M=0,m=0,n=0;
		
		System.out.println("Dime una frase (maximo 80 caracteres)");
		frase=teclado.nextLine();
		
		while (frase.length()>80) {
			System.out.println("Esa frase supera los 80 caracteres");
			System.out.println("Dime otra frase (maximo 80 caracteres)");
			frase=teclado.nextLine();
		}//while
		
		if (frase.length()<80) {
			for (int i=0; i<frase.length(); i++){
				if (frase.charAt(i)>=65 && frase.charAt(i)<=90 || frase.charAt(i)>=97 && frase.charAt(i)<=122){
					if (frase.charAt(i)>=97 && frase.charAt(i)<=122) {
						m++;
					}//if_if
					else {
						M++;
					}//else_if
				}//if_for
				else {
					if (frase.charAt(i)>=48 && frase.charAt(i)<=57) {
						n++;
					}//if_else
				}//else_for
			}//for_if
			System.out.println("La frase que me has dicho contiene: ");
			System.out.println(M+" Mayusculas");
			System.out.println(m+"Minusculas");
			System.out.println(n+"Numeros");
		}//if
		
	}//main

}//class
