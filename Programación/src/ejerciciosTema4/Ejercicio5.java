package ejerciciosTema4;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		String frase;
		String j="",k="";
		
		System.out.println("Dime una frase");
		frase=teclado.nextLine();
		
		if (frase.length()>80) {
			System.out.println("La frase contiene mas de 80 caracteres");
			System.out.println("Dime otra frase");
		}//if
		else {
			for (int i=0; i<frase.length(); i++) {
				if ((i+1)%2==0) {
					j+=frase.charAt(i);
				}//if_for
				else if ((i+1)%2!=0){
					k+=frase.charAt(i);
				}//else_for
				
			}//for_if
		}//else
		System.out.println("Los caracteres en lugar PAR forman la cadena: "+j);
		System.out.println("Los caracteres en lugar IMPAR forman la cadena: "+k);
	}//main

}//class
