package ejercicio4;

import java.util.Scanner;

public class Restaurante {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int [] mesas = new int [10];
		int menu;
		
		for(int i=0; i < 10; i++) {
			mesas[i] = (int)Math.random()*0;
		}//for
		
		System.out.println("Actualmente las mesas estan vacias: ");
		for(int i=0; i<10; i++) {
			System.out.println("La mesa "+(i+1)+" tiene: "+mesas[i]);
		}//for
		
		do {
			do {
				System.out.println("¿Quieres llenar alguna mesa?");
				System.out.println("1.- Si");
				System.out.println("2.- No, quiero vaciarla");
				System.out.println("3.- Quiero vaciar todas las mesas para finalizar el servicio");
				menu = teclado.nextInt();
			}
			while(menu < 1 || menu > 3);
		
			switch(menu){
			case 1: 
				Metodos mesa1 = new Metodos();
				mesa1.LlenarMesa();
				
			break;
			case 2:
				Metodos mesa2 = new Metodos();
				mesa2.VaciarMesa();
			break;
			case 3:
				Metodos mesa3 = new Metodos();
				mesa3.FinalizarServicio();
			break;
		}//switch
		}
		while(menu != 3);
		
	}//main
}//class
