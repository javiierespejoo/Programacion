package ejerciciosTema6;

import java.util.Scanner;

public class Ejercicio1 {
	static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
	/*	
		//3.-
		//A
			float [] vector = new float[24];
		//B
			int [] enteros = new int[500];
		//C
			double [] doble = new double[50];
		//D
			char [] caracter = new char[10];
			
		//4.-
		//A
			final int CLASS_SIZE = 30;
		//B
			float [] quizAvg;
		//C
			quizAvg = new float[CLASS_SIZE];
			
		//5.-
		//A
			int [] birdSightings;
		//B
			birdSightings = new int[20];
			
		//6.-
			final int TAMAÑO = 100;
			int [] cuenta = new int[TAMAÑO];
		//A
			for (int i=0; i<TAMAÑO; i++) {
				cuenta[i] = 0;
			}
		//B
			for (int i=0; i<TAMAÑO; i++) {
				cuenta [i] = teclado.nextInt();
			}
		//C
			int suma=0;
			for (int i=0; i<TAMAÑO; i++) {
				suma += cuenta [i];
			}
		//7.-
			Scanner teclado = new Scanner(System.in);
			int[] a = new int[100];
			int[] b = new int[100];
			int j, m;
			int sumaA = 0;
			int sumaB = 0;
			int sumaDiff = 0;
			m = teclado.nextInt();
			for ( j = 0; j < m; j++ ) {
				a[j] = teclado.nextInt();
				b[j] = teclado.nextInt();
			}
			for (j = 0; j < m; j++ ) {
				sumaA = sumaA + a[j];
				sumaB = sumaB + b[j];
				sumaDiff = sumaDiff + (a[j] - b[j]);
				}
			for (j = m - 1; j >= 0; j-- ) {
				System.out.println(a[j] + " " + b[j] + " " + (a[j] - b[j]));
				System.out.println(sumaA + " " + sumaB + " " + sumaDiff);
				System.out.println();
			}
			
		//8.- OutOfBounds puesto que el valor 0 no se esta leyendo, y esta pidiendo un valor 4 que no existe
			int[] vector = { 10, 20, 30, 40 };
			int indice;
			for ( indice = 0; indice < 4; indice++ )
				System.out.println(" " + vector[indice]);
				
		*/
		//9 y 10
			int[] muestra = new int[8];
			int i;
			int k;
		//9.-
			/*
			for ( k = 0; k < 8; k++ ) {
				muestra[k] = 10 - k;
				System.out.println(muestra[k]);
			}
			
		//10.-
			for ( i = 0; i < 8; i++ ) {
				if ( i <= 3 )
				muestra[i] = 1;
				else
				muestra[i] = -1;
				System.out.println(muestra[i]);
			}
			*/
		//11.-
				for ( k = 0; k < 8; k++ ) {
					if ( k % 2 == 0 )
						muestra[k] = k;
					else
						muestra[k] = k + 100;
					System.out.println(muestra[k]);
				}
		
	}//main

}//class
