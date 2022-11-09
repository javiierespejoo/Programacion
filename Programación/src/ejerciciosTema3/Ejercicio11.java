package ejerciciosTema3;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int num, contador=2, divisor=2;
		int resto;
		System.out.println("Dime un numero y te dire todos los numeros primos menores a el");
		num=teclado.nextInt();
		
		for (contador=2; contador<num; contador++) {
			do {
				resto=contador%divisor;
				divisor++;
			}//do while2
			while(divisor<contador && resto!=0);
			
			if (resto!=0 || contador==2) {
				System.out.println("Los numeros primos menores que "+num+" son: "+contador);
				
			}//if
				divisor=2;
		}//for
		
		
	}//main

}//class
