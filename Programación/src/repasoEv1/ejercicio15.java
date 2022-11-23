package repasoEv1;

import java.util.Scanner;

public class ejercicio15 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);

		int num, n;
		String digito;
		boolean numero=false;
		
		System.out.println("Dime un numero");
		num=teclado.nextInt();teclado.nextLine();
		
		do {
			System.out.println("Dime un digito a buscar dentro de ese numero");
			digito=teclado.nextLine();
			n=Integer.parseInt(digito);
			if (n.charAt(0)>=0 && n.charAt(0)<=9) {
				numero=true;
			}//if_do-while
		}//do-while
		while(digito.length()!=1 && numero==false);
		
		for (int i=0; i<;i++) {
			
		}
			
	}//main

}//class
