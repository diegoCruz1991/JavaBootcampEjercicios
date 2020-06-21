public class Arreglalo{
	public static void main(String... args) {
		Cuadrado cuadrado = new Cuadrado();
		System.out.println(cuadrado.nombre);
	}
}

class Cuadrado{
	String nombre;
	public Cuadrado() {
		iniciar();
	}
	private void iniciar() {
		this.nombre = "Cuadrado";
	}
}