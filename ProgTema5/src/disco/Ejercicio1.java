package disco;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		Disco d1 = new Disco("Donde quiero estar", 15, 19.99, "29-01-2023");
		d1.verDisco();
		
		Disco d2 = new Disco();
		d2.leerDisco();
		d2.verDisco();
		
	}

}
