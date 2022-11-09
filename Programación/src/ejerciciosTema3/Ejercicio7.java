package ejerciciosTema3;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int num;
		int me=0;
		int ma=0;
		int contador=0;
		double suma=0, media;
		
		System.out.println("Dime una serie de numeros y te dire la media de todos ellos y te mostrare el mayor y el menor. Para salir del bucle introducir el numero 0");
		
		do {
			System.out.println("Dime un numero");
			num=teclado.nextInt();
			contador++;
			suma=suma+num;
			
			if (num>=ma) {
				ma=num;
				if (me==0)
					me=num;
			}//if1 do while
			if (num<=me && num!=0) {
				me=num;
			}//if2
		}//do while
		while (num!=0);
		
		media=suma/(contador-1);
		System.out.println("La media de todos los numeros introducidos es: "+media);
		System.out.println("El mayor numero es: "+ma);
		System.out.println("El menor numero es: "+me);
	}//main
		
}//class
