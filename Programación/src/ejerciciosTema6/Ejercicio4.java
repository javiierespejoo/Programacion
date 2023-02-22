package ejerciciosTema6;

public class Ejercicio4 {

	public static void main(String[] args) {
		int [] primero = new int [10];
		int [] segundo = new int [10];
		int cont = 0;
		
		System.out.println("El primer vector es: ");
		for (int i=0; i<10; i++) {
			primero[i] = (int)(Math.random()*5)+1;
			System.out.print(primero[i]+" ");
		}
		System.out.println();
		System.out.println("El segundo vector es: ");
		for (int i=0; i<10; i++) {
			segundo[i] = (int) (Math.random()*5)+1;
			System.out.print(segundo[i]+" ");
		}
		System.out.println();
		
		for (int i=0; i<10; i++) {
			for (int j=0; j<segundo.length; j++) {
				if (primero[i] == segundo[j]) {
					cont++;
					
				}//if
				
			}//for2
			System.out.println("El elemento "+i+"("+primero[i]+"): "+cont+" veces");
			cont = 0;
		}//for1
	}//main

}//class
