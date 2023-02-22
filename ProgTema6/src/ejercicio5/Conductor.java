package ejercicio5;

public class Conductor {

	public static void main(String[] args) {
		Empleado[] e = new Empleado[50];
		
		final String[] nombres = {"Juan", "Pepe", "Pedro", "Sonia", "Carla", "raul", "Karina"};
		
		int creados = 0;
		while (creados < 50) {
			Empleado aux = new Empleado();
			if (Math.random()<0.8) {
				aux.setNombre(nombres[(int)(Math.random()*nombres.length)]);
				e[creados++] = aux;
			}//if
		}//while
		
		for (int i=0; i<e.length; i++) {
			System.out.println("Visualizo datos empleado "+e[i]);
		}
	}

}
