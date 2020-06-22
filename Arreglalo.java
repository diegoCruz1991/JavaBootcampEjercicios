public class Arreglalo {
	public static void main(String[] args) {
		Cuadrado cuadrado = new Cuadrado();
	}
}

class Cuadrado {
	public Cuadrado() {
		iniciar();
	}
	String nombre;
	public void iniciar() {
		this.nombre = "cuadrado";
		System.out.println("Soy un cuadradooooo");
	}
}