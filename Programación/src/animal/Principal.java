package animal;

public class Principal {
	public static void main(String[] args) {
		Animal animal;
		Mamifero mamifero;
		
		animal = new Animal();
		System.out.println();
		animal.numCrias = 3;
		animal.visualizaDatos();
		animal.setNumCrias(5);
		animal.visualizaDatos();
		animal.alimentar();
		
		mamifero = new Mamifero();
		mamifero.setNumCrias(4);
		mamifero.setExtremidades(4);
		mamifero.setHuesos(120);
		mamifero.alimentar();
		System.out.print("animal\t");
		mamifero.visualizaDatos();
		System.out.println("mamifero-------");
		mamifero.visualizaMamifero();
		
		Persona persona;
		
		persona = new Persona();
		//p2 = new Persona();
		System.out.println();
		persona.setNumCrias(5);
		persona.setExtremidades(4);
		persona.setHuesos(120);
		persona.setProfesion("Estudiante");
		persona.visualizaPersona();
	}
}
