package ejercicio1;

public class ejercicio1 {

	public static void main(String[] args) {
		
		int[] numero = new int [20];
		int[] cuadrado = new int [20];
		int[] cubo = new int [20];
		
		for (int i=0; i < 20; i++) {
			numero[i] = (int)(Math.random()*100)+1;
		}//for
		
		for (int i=0; i < 20; i++) {
			int aux;
			
			aux = numero[i];
			cuadrado[i] = (int)(Math.pow(aux, 2));
		}//for_cuadrado
		
		for (int i=0; i < 20; i++) {
			int aux;
			
			aux = numero [i];
			cubo[i] = (int)(Math.pow(aux, 3));
		}//for_cubo
		
		for (int i=0; i < 20; i++) {
			System.out.println(numero[i]+"\t"+cuadrado[i]+"\t"+cubo[i]);
			
		}
	}//main

}//class
