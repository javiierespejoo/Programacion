package ejerciciosTema6;

public class Ejercicio3 {

	public static void main(String[] args) {
		int [] vector = new int [10];
		int M=25,m=25;
		int posM=0,posm=0;
		
		System.out.println("El vector es: ");
		for (int i=0; i<10; i++) {
			vector[i] = (int)(Math.random()*50)+1;
			System.out.print(vector[i]+" ");
		}
		System.out.println();
		for (int i=0; i<10; i++) {
			if (vector[i]>M) {
				posM = i+1;
				M = vector [i];
			}
			else if (vector[i]<m) {
				posm = i+1;
				m = vector [i];
			}
		}
		System.out.println("El numero mayor es "+M+" y se encuentra en "+posM+" posicion");
		System.out.println("El numero menor es "+m+" y se encuentra en "+posm+" posicion");
	}//main

}//class
