package ejerciciosTema5;
import java.util.Scanner;

public class Ejercicio2 {

	private int Ndiv (int num) {
		int ndiv=0;
		for (int i=1; i<num; i++) {
			if (num%i==0) {
				ndiv++;
			}
		}
		return ndiv;
	}
	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		int p, q;
		int divp=0, divq=0;
		Ejercicio2 d = new Ejercicio2();
		
		do {
		System.out.println("Dime un numero positivo");
		p=teclado.nextInt();
		}
		while (p<0);
		divp = d.Ndiv(p);
		
		do {
		System.out.println("Dime otro numero positivo");
		q=teclado.nextInt();
		}
		while (q<0);
		divq = d.Ndiv(q);
		
		System.out.println("El numero "+p+" tiene "+(divp>divq? "mas " : "menos ")+ "divisores que "+q);
	}

}
