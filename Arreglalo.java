public class Arreglalo {
	public static void main() {
		Cuadrado cuadrado = Cuadrado();

		cuadrado.figura.rodar();
	}
}

class Cuadrado {

	Figura figura;

	public Cuadrado() {
		iniciar();
	}

	private void iniciar() {
		this.figura.nombre = cuadrado;
	}
}