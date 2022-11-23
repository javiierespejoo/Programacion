package repasoEv1;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);

		int dia, personas;
		boolean cinePas, repe=false;
		int Cinepas, parejas, solo;
		double precioBase,descuento, precioFinal;
		
		System.out.println("¿Cuantas personas sois?");
		personas=teclado.nextInt();
		
		System.out.println("¿Tienes tarjeta de CinePas?");
		System.out.println("2. No");
		System.out.println("1. Si");
		Cinepas=teclado.nextInt();
		if (Cinepas==1) {
			cinePas=true;
		}//if
		else {
			cinePas=false;
		}//false
		
		while (repe==false) {
			System.out.println("Que dia es hoy: ");
			System.out.println("1. Lunes");
			System.out.println("2. Martes");
			System.out.println("3. Miercoles");
			System.out.println("4. Jueves");
			System.out.println("5. Viernes");
			System.out.println("6. Sabado");
			System.out.println("7. Domingo");
			dia=teclado.nextInt();
		
			switch (dia) {
			case 1: case 2: case 5: case 6: case 7:
				if (cinePas==true) {
					precioBase=personas*8;
					descuento=precioBase*0.1;
					precioFinal=precioBase-descuento;
					System.out.println("El precio final sera de "+precioFinal+" euros.");
				}//if
				else {
					precioBase=personas*8;
					System.out.println("El precio final sera de "+precioBase+" euros.");
				}//else
				repe=true;
				break;
			case 3:
				if (cinePas==true) {
					precioBase=personas*5;
					descuento=precioBase*0.1;
					precioFinal=precioBase-descuento;
					System.out.println("El precio final sera de "+precioFinal+" euros.");
				}//if
				else {
					precioBase=personas*5;
					System.out.println("El precio final sera de "+precioBase+" euros.");
				}//else
				repe=true;
				break;
			case 4:
				if (cinePas==true) {
					parejas=personas/2;
					solo=personas%2;
					precioBase=(parejas*11)+(solo*8);
					descuento=precioBase*0.1;
					precioFinal=precioBase-descuento;
					System.out.println("El precio final sera de "+precioFinal+" euros.");
				}//if
				else {
					parejas=personas/2;
					solo=personas%2;
					precioBase=(parejas*11)+(solo*8);
					System.out.println("El precio final sera de "+precioBase+" euros.");
				}//else
				repe=true;
				break;
			default:
				System.out.println("El valor introducido no equivale a ningun dia de la semana.");
				System.out.println("Pruebe otro valor.");
				repe=false;
			}//switch
		}//while
	}//main

}//class
