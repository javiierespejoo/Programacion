package pruebaseclipse;

public class FizzBuzz3 {

	public static void main(String[] args) {
		String output="";
		for (int i=1; i<=100; i++) {
			output="";
			if (i%3==0) {
				output+="Fizz";
			}
			if (i%5==0) {
				output+="Buzz";
			}
			if (output.equals("")) {
				output=Integer.toString(i);
			}
			System.out.println(output);
		}

	}

}
