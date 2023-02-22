package ejerciciosTema6;

public class Ejercicio2 {

	public static void main(String[] args) {
		int [] primero = new int [10];
		int [] segundo = new int [10];
		int [] suma = new int [10];
		
		System.out.println("El primer vector es: ");
		for (int i=0; i<10; i++) {
			primero[i]=(int)(Math.random()*50)+1;
			System.out.print(primero[i]+" ");
		}
		System.out.println();
		System.out.println("El segundo vector es: ");
		for (int i=0; i<10; i++) {
			segundo[i]=(int)(Math.random()*50)+1;
			System.out.print(segundo[i]+" ");
		}
		System.out.println();
		System.out.println("El vector suma es: ");
		for (int i=0; i<10; i++) {
			suma[i] = primero[i] + segundo[i];
			System.out.print(suma[i]+" ");
		}
		
	}//main

}//class
