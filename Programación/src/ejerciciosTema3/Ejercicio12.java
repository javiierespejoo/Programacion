package ejerciciosTema3;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int num, b, h;
		double area;
		boolean repe=false;
		
		
		while (repe==false) {
			System.out.println("Elige una opcion: ");
			System.out.println("1. Triangulo.");
			System.out.println("2. Cuadrado.");
			System.out.println("3. Rectangulo.");
			num=teclado.nextInt();
			switch (num) {
			case 1:
				repe=true;
				System.out.println("Usted ha elegido el Triangulo");
				System.out.println("Deme el valor de la base: ");
				b=teclado.nextInt();
				System.out.println("Deme el valor de la altura: ");
				h=teclado.nextInt();
				area=(b*h)/2;
				System.out.println("el Area del Triangulo es de "+area);
				break;
			case 2:
				repe=true;
				System.out.println("Usted ha elegido el Cuadrado");
				System.out.println("Deme el valor del lado: ");
				b=teclado.nextInt();
				area=(b*b);
				System.out.println("el Area del Cuadrado es de "+area);
				break;
			case 3:
				repe=true;
				System.out.println("Usted ha elegido el Rectangulo");
				System.out.println("Deme el valor de la base: ");
				b=teclado.nextInt();
				System.out.println("Deme el valor de la altura: ");
				h=teclado.nextInt();
				area=(b*h);
				System.out.println("el Area del Triangulo es de "+area);
				break;
			default:
				repe=false;
				System.out.println("El valor introducido no corresponde a ninguna de las opciones.");
				System.out.println("Pruebe a insertar otro valor.");
				break;
			}//switch
			
		}//while
		
	}//main

}//class
