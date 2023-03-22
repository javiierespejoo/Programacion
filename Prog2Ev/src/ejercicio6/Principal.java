package ejercicio6;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int numerador, denominador, menu;
		
		System.out.println("Dime el numerador de la fraccion");
		numerador = teclado.nextInt();
		System.out.println("Dime el denominador de la fraccion");
		denominador = teclado.nextInt();
		
		do {
			do {
				System.out.println("¿Que quieres hacer con los valores de la fraccion?");
				System.out.println("1.- Invertir");
				System.out.println("2.- Simplificar");
				System.out.println("3.- Sumar");
				System.out.println("4.- Multiplicar");
				System.out.println("5.- Dividir");
				System.out.println("6.- Potencia");
				System.out.println("7.- Finalizar el programa");
				menu = teclado.nextInt();
		
				if(menu < 1 || menu > 7) {
					System.out.println("El valor introducido no esta dentro de las posibilidades");
				}//if
			}
			while (menu < 1 || menu > 7);
		
			switch(menu) {
			case 1:
				Fraccion f1 = new Fraccion();
				f1.Invertir(numerador, denominador);
			break;
			case 2:
				Fraccion f2 = new Fraccion();
				f2.Simplificar(numerador, denominador);
			break;
			case 3:
				Fraccion f3 = new Fraccion();
				f3.Sumar(numerador, denominador);
			break;
			case 4:
				Fraccion f4 = new Fraccion();
				f4.Multiplicar(numerador, denominador);
			break;
			case 5:
				Fraccion f5 = new Fraccion();
				f5.Dividir(numerador, denominador);
			break;
			case 6:
				Fraccion f6 = new Fraccion();
				f6.Potencia(numerador, denominador);
			case 7:
				Fraccion f7 = new Fraccion();
				f7.Finalizar();
			}//switch
		
		}
		while (menu != 7);

	}//main

}//class
