package repasoEv1;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		
		int num=320;
		
		do {
			for (int i=0; i<8; i++) {
				while (num>=160) {
					System.out.println(num);
					num=num-20;
				}//while
			}//for
		}//do-while
		while (num>160);
		
	}//main

}//class
