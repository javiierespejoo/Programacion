package Ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {

	private boolean esPrimo(int num){
		int contador=2;
	    boolean primo = true;
	    while(primo && contador<num) {
	    	primo=num%contador++!=0;
	    }
	    return primo;
	}

	public static void main(String[] args) {
	    Scanner teclado=new Scanner (System.in);
	    
	    int num;
	    boolean primo = true;
	    System.out.print("Introduzca un numero: ");
	    num=teclado.nextInt();
	    Ejercicio1 p=new Ejercicio1();
	    primo=p.esPrimo(num);
	    System.out.println("El numero " + num + (primo ? "" : " no") + " es primo");
	}
}
