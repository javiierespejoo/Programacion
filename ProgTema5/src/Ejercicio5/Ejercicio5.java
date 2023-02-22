package Ejercicio5;
import java.util.Scanner;
public class Ejercicio5{

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Metodos numero = new Metodos();
		int p;
		int q;
		int mcd;
		System.out.println("Introduce primer numero");
		p = teclado.nextInt();
		System.out.println("introduce el segundo numero");
		q = teclado.nextInt();
		numero.mcd(p,q);
		
		System.out.println("El MCD de " + p + " y " + q + " es: " + numero.mcd(p,q));
		
	}//main

}
