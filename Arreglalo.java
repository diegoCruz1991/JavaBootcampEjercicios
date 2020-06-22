public class Arreglalo {
	public static void main(String[] args) {
		Cuadrado cuadrado = new Cuadrado();

		cuadrado.figura.rodar();
	}
}

class Cuadrado {

	Figura figura;

	public Cuadrado() {
		figura = new Figura();
		iniciar();
	}

	private void iniciar() {
		this.figura.nombre = "cuadrado";
	}
}

class Figura {
	String nombre;

	public void rodar(){
		System.out.println(nombre);
	}
}
