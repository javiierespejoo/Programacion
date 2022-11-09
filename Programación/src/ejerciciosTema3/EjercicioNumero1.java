package ejerciciosTema3;

import java.util.Scanner;
import java.util.random.*;

public class EjercicioNumero1 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		
		int num, k=0;
		boolean repe=false;
		int j;
		while (repe==false) {
			System.out.println("¿Que tipo de operaciones quieres generar?");
			System.out.println("1. Sumas");
			System.out.println("2. Multiplicaciones");
			System.out.println("3. Divisiones");
			num=teclado.nextInt();
			
			switch (num) {
			case 1:
				System.out.println("Usted ha elegido Sumas: ");
				for (int i=0; i<10; i++) {
					double f=(int)(Math.random()*20)+1;
					double r=(int)(Math.random()*20)+1;
					System.out.print(f+" + "+r+" = ");
					j=teclado.nextInt();
					if (j==(f+r)) {
						k++;
					}//if
				}//for
				System.out.println("La calificacion ha sido de: "+k+" / 10");
				repe=true;
			break;
			case 2:
				System.out.println("Usted ha elegido Multiplicaciones: ");
				for (int i=0; i<10; i++) {
					double f=(int)(Math.random()*20)+1;
					double r=(int)(Math.random()*20)+1;
					System.out.print(f+" * "+r+" = ");
					j=teclado.nextInt();
					if (j==(f*r)) {
						k++;
					}//if
				}//for
				System.out.println("La calificacion ha sido de: "+k+" / 10");
				repe=true;
			break;
			case 3:
				System.out.println("Usted ha elegido Divisiones: ");
				for (int i=0; i<10; i++) {
					double f=(int)(Math.random()*20)+1;
					double r=(int)(Math.random()*20)+1;
					System.out.print(f+" / "+r+" = ");
					j=teclado.nextInt();
					if (j==(f/r)) {
						k++;
					}//if
				}//for
				System.out.println("La calificacion ha sido de: "+k+" / 10");
				repe=true;
			break;
			default:
				repe=false;
			break;
			}//switch
		}//while

	}//main

}//class
