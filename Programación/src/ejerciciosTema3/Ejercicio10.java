package ejerciciosTema3;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int num;
		double resto;
		int divisor=2;
		boolean primo=false;
		int aux=1;
		
		System.out.println("Dime un numero y te dire su numero primo mas cercano");
		num=teclado.nextInt();
		
		do {	
			do {
				resto=(num+aux)%divisor;
				divisor++;
			}//do while
			while (divisor<(num+aux) && resto!=0);
		
			if (resto!=0) {
				primo=true;
				
			}//if
			else {
				primo=false;
				divisor=2;
				aux++;
			}//else
		}//do while2
		while (primo==false);	
		
		if (num!=0 && num!=1) {
			System.out.println("El numero primo mas cercano es: "+(num+aux));
		}//if
		else {
			System.out.println("El numero primo mas cercano es: 2");
		}//else
	}//main
}//class
