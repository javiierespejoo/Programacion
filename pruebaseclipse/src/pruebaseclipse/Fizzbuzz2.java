package pruebaseclipse;

public class Fizzbuzz2 {

	public static void main(String[] args) {
		for (int i=1; i<101; i++) {
			if (i%3==0) {
				if (i%5==0) {
					System.out.println("FizzBuzz");
				}//if_if
				else {
					System.out.println("Fizz");
				}
			}//if1
			else { 
				if (i%5==0) {
					System.out.println("Buzz");
				}//if2
				else {
					System.out.println(i);
				}
			}//else
		}//for


	}

}
