package ejerciciosTema3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int num;
		int contador=0;
		int producto;
		System.out.println("Dime un numero del 1 al 10 y te dare su tabla de multiplicar");
		num=teclado.nextInt();
		
		if (1>num || num>10) {
			System.out.println("El numero introducido no esta comprendido entre 1 y 10");
			num=teclado.nextInt();
		}//if
		else {
			System.out.println("La tabla de multiplicar del "+num+" es: ");
			contador=-1;
			while (contador<10){
				contador++;
				producto=num*contador;
				System.out.println(contador+" * "+num+" = "+producto);
			}//while
			
		}//else
		
		
	}//main

}//class
