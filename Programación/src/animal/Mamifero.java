package animal;

public class Mamifero extends Animal {
	int huesos, extremidades;
	
	public Mamifero() {
		System.out.print(", mamifero");
	}
	
	public void setHuesos(int huesos) {
		this.huesos = huesos;
	}
	
	public void setExtremidades(int extremidades) {
		this.extremidades = extremidades;
	}
	
	public void visualizaMamifero() {
		visualizaDatos();
		System.out.println("Huesos: "+huesos);
		System.out.println("Extremidades: "+extremidades);
	}
}
