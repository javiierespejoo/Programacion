package animal;

public class Persona extends Mamifero{
	String profesion;
	
	public Persona() {
		System.out.println(" y persona");
	}
	
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	
	public void visualizaPersona() {
		System.out.println("Crias: "+numCrias);
		System.out.println("Huesos: "+huesos);
		System.out.println("Extremidades: "+extremidades);
		System.out.println("Profesion: "+profesion);
	}
}
