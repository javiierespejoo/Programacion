package Ejercicio8;
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Metodos numero = new Metodos();
		int m, n;
		int num, resultado;
		int divisor;
		
		do {
		System.out.println("Dime que cantidad de unidades tienes");
		m = teclado.nextInt();
		
		System.out.println("Que cantidad quieres que tenga cada grupo");
		n = teclado.nextInt();
		}
		while (m<n);
		divisor = (numero.factorial(n) * numero.factorial(m-n));
		resultado = (numero.factorial(m)/divisor);
		
		System.out.println("Para agrupar "+m+" en "+n+" grupos, hay que poner "+resultado+" unidades en cada grupo");

	}

}
