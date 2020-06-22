public class Arreglalo {
	public static void main(String... args) {
		
		Cuadrado cuadrado = new Cuadrado();

		cuadrado.figura.rodar();
	}
}

class Cuadrado extends Figura {
	Figura figura= new Figura();
	String cuadrado;

	public Cuadrado() {
		iniciar();
	}

	private void iniciar() {
		this.figura.nombre = cuadrado;
	}
	
	
}

class Figura{
String nombre;

Figura(){
	this.nombre=nombre;
}	
	public void rodar(){
		System.out.println("Esta figura pudo rodar...");
	}
	
}