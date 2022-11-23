package repasoEv1;

import java.util.Scanner;

public class ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		
		boolean partida=true;
		String nombre1, nombre2;
		int jugada1, jugada2;
		
		System.out.println("Vamos a jugar a Piedra, Papel o Tijera");
		System.out.println("Introduce el nombre del Jugador 1");
		nombre1=teclado.nextLine();
		System.out.println("Introduce el nombre del Jugador 2");
		nombre2=teclado.nextLine();
		
		do {
			System.out.print(nombre1);
			System.out.println(". Elige una jugada:");
			System.out.println("1. Piedra");
			System.out.println("2. Papel");
			System.out.println("3. Tijera");
			jugada1=teclado.nextInt();
			
			System.out.print(nombre2);
			System.out.println(". Elige una jugada:");
			System.out.println("1. Piedra");
			System.out.println("2. Papel");
			System.out.println("3. Tijera");
			jugada2=teclado.nextInt();
			
			if (jugada1==1 && jugada2==2 || jugada2==1 && jugada1==3) {
				System.out.println("Ha ganado el Jugador 2");
				partida=false;
			}//if1
			else if (jugada1==1 && jugada2==3 || jugada2==1 && jugada1==2) {
				System.out.println("Ha ganado el jugador 1");
				partida=false;
			}//if2
			else if (jugada1==1 && jugada2==1 || jugada1==2 && jugada2==2 || jugada1==3 && jugada2==3) {
				System.out.println("Empate!! Jugad de nuevo");
				partida=true;
			}//if3
			else if (jugada1!=1 || jugada1!=2 || jugada1!=3) {
				System.out.println("El numero introducido no corresponde a ninguna jugada");
				System.out.println("Prueba de nuevo");
				System.out.print(nombre1);
				System.out.println(". Elige una jugada:");
				System.out.println("1. Piedra");
				System.out.println("2. Papel");
				System.out.println("3. Tijera");
				nombre1=teclado.nextLine();
			}//if4
			else if (jugada2!=1 || jugada2!=2 || jugada2!=3) {
				System.out.println("El numero introducido no corresponde a ninguna jugada");
				System.out.println("Prueba de nuevo");
				System.out.print(nombre2);
				System.out.println(". Elige una jugada:");
				System.out.println("1. Piedra");
				System.out.println("2. Papel");
				System.out.println("3. Tijera");
				nombre2=teclado.nextLine();
			}//if5
		}//do-while
		while (partida==true);
		
	}//main

}//class
