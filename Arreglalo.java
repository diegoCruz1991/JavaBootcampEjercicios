public class Arreglalo {
	public static void main(String... args) {
		Cuadrado cuadrado = new Cuadrado();

		cuadrado.figura.rodar();

	}
}

class Cuadrado {

	Figura figura = new Figura();

	public void Cuadrado() {
		iniciar();
	}

	private void iniciar() {
		//figura.rodar;
		this.figura.nombre = "cuadrado";
	}
}

class Figura {

	String nombre;

	public void rodar() {
		System.out.println("Estoy rodando...");
	}

}
