package ejerciciosTema4;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		String frase;
		int j=0,k=0, esp=0;
		String aux="";
		
		System.out.println("Dime una frase (maximo 80 caracteres): ");
		frase=teclado.nextLine();
		aux=frase.toUpperCase();
		
		if (frase.length()> 80) {
			System.out.println("Dime una frase (maximo 80 caracteres): ");
			frase=teclado.nextLine();
		}//if
		else {
			for (int i=0; i<frase.length(); i++) {
				if (frase.charAt(i)==' ') {
					esp++;
				}//if2_for
				else if (frase.charAt(i)==aux.charAt(i)) {
					j++;
				}//if2_for
				else {
					k++;
				}//else_for
				
			}//for_if
			
		}//else
		System.out.println("En esta frase hay "+j+" mayusculas y "+k+" minusculas en "+frase.length()+" caracteres, el resto son caracteres distintos");
		System.out.println(frase);
		System.out.println(aux);
	}//main

}//class
