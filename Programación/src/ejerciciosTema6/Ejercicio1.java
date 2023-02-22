package ejerciciosTema6;

import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		int [] azar = new int [20];
		int suma = 0;
		int media;
		int M=0,m=0,e=0;
		
		for (int i=0; i<20; i++) {
			
			azar[i] = (int) (Math.random()*50)+1;
			System.out.println(azar[i]);
			
			suma += azar[i];
			
		}
		media = suma/20;
		System.out.println("La media de los numeros es: "+media);
		
		for (int i=0; i<20; i++) {
			if (azar[i] > media) {
				M++;
			}
			else if (azar[i] < media) {
				m++;
			}
			else {
				e++;
			}
		}//for
		System.out.println("Hay "+M+" numeros por encima de la media");
		System.out.println("Hay "+m+" numeros por debajo de la media");
		System.out.println("Hay "+e+" numeros iguales a la media");
	}//main

}//class
