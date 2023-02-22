package animal;

public class Animal {

	int numCrias;
	
	public Animal() {
		System.out.print("Ha nacido un animal");
	}
	
	public void setNumCrias(int crias) {
		numCrias = crias;
	}
	
	public void visualizaDatos() {
		System.out.println("Crias: "+numCrias);
	}
	
	public void alimentar() {
		System.out.println("Estoy alimentando al animal");
	}
}
