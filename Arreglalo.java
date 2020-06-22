public class Arreglalo {
	public static void main(String [] args) {
	
		Cuadrado cuadrado = new Cuadrado();

		cuadrado.figura.rodar();
	}
}

class Cuadrado {

		Figura figura = new Figura();

	public Cuadrado() {
		iniciar();
	}

	private void iniciar() {
		this.figura.nombre = "cuadrado";
	}
}

class Figura  {
		public String nombre;

		public void rodar(){
	}
}