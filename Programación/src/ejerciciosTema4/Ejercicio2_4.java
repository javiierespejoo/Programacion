package ejerciciosTema4;

import java.util.Scanner;

public class Ejercicio2_4 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		
		String nombre1, nombre2;
		int u, d;
		String aux1="", aux2="";
		
		System.out.println("Introduce un nombre y un apellido");
		nombre1=teclado.nextLine();
		System.out.println("Introduce otro nombre y apellido");
		nombre2=teclado.nextLine();
		
		u=nombre1.indexOf(' ');
		d=nombre2.indexOf(' ');
		
		aux1=nombre1.substring((u+1), nombre1.length());
		aux2=nombre2.substring((d+1), nombre2.length());
		
		nombre1=nombre1.replace(aux1, aux2);
		nombre2=nombre2.replace(aux2, aux1);
		
		System.out.println(nombre1);
		System.out.println(nombre2);
	}//main

}//class
