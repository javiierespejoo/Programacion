package repasoEv1;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		
		int h, m;
		int hr, mr;
		int resultado;
		
		System.out.println("Dime las horas y los minutos (por separado)");
		do {
		System.out.println("Hora: ");
		h=teclado.nextInt();
		}
		while (h<1 || h>24);
		
		do {
		System.out.println("Minuto:");
		m=teclado.nextInt();
		}
		while (m<0 || m>60);
		
		if (m==0) {
			hr=24-h;
			resultado=hr*3600;
			System.out.println("Quedan "+resultado+" segundos para medianoche.");
		}//if
		else {
			hr=24-(h+1);
			mr=60-m;
			resultado=(hr*3600)+(mr*60);
			System.out.println("Quedan "+resultado+" segundos para medianoche.");
		}//else
	}//main

}//class
