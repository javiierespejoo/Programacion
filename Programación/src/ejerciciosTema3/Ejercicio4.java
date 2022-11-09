package ejerciciosTema3;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado= new Scanner (System.in);
		
		System.out.println("Dime un numero y te dire si es primo o no");
		int num=teclado.nextInt();
		int resto;
		int aux=0;
		
		
		for (int contador=2; contador<num; contador++) {
			resto=num%contador;
			if (resto==0) {
				aux++;
			}//if-for
		}//for
		if (aux!=0) {
			System.out.println("El numero introducido NO es un numero primo");
		}//if
		else {
			System.out.println("El numero introducido SI es un numero primo");
		}//else
	
	}//main

}//class
