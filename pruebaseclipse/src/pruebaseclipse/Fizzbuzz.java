package pruebaseclipse;

public class Fizzbuzz {

	public static void main(String[] args) {
		for (int i=1; i<101; i++) {
			if (i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			}//if1
			else if (i%3==0 && i%5!=0) {
				System.out.println("Fizz");
			}//if2
			else if (i%3!=0 && i%5==0) {
				System.out.println("Buzz");
			}//if3
			else {
				System.out.println(i);
			}//else
		}//for

	}//main

}//class
