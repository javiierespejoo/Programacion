package repasoEv1;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		
		double g=9.81;
		double h, t, resultado;
		
		System.out.println("Introduce el valor de la altura desde la cual caera el objeto");
		h=teclado.nextDouble();
		
		resultado=((2*h)/g);
		t=Math.sqrt(resultado);
		
		System.out.println("El tiempo que tardara en caer es de "+t+" segundos.");
	}//main

}//class
