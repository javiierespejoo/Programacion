package repasoEv1;

import java.util.Scanner;

public class ejercicio14 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		
		int h,a,l;
		String s;
		String linea="";
		
		do {
			System.out.println("¿Quieres el vertice hacia arriba o hacia abajo?");
			System.out.println("1. Arriba");
			System.out.println("2. Abajo");
			a=teclado.nextInt();
		}
		while(a!=1 && a!=2);
		
		do {
			System.out.println("¿Hacia la derecha o hacia la izquierda?");
			System.out.println("1. Derecha");
			System.out.println("2. Izquierda");
			l=teclado.nextInt();
		}
		while(l!=1 && l!=2);
		
		System.out.println("¿Que altura quieres que tenga la piramide?");
		h=teclado.nextInt();
		
		do {
			System.out.println("¿Con que numero o simbolo quieres pintar la piramide?");
			s=teclado.nextLine();
		}
		while (s.length()!=1);
		
		if (a==1 && l==1) {
			for (int i=1; i<=h; i++) {
				for (int j=h-1; j>0; j--) {
					linea +=' ';
				}//for_for
				for (int k=h; k>=1; k--) {
					linea +=s;
				}//for_for2
				System.out.println(linea);
				linea="";
			}//for
		}//ArribaDerecha

	}//main

}//class
