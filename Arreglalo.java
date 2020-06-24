public class Arreglalo {
<<<<<<< HEAD
	public static void main(String[] args) {
=======
	public static void main(String... args) {
>>>>>>> master
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
<<<<<<< HEAD
=======
		this.figura = new Figura();
>>>>>>> master
		this.figura.nombre = "cuadrado";
	}
}

class Figura {
<<<<<<< HEAD
	String nombre;

	public void rodar(){
		System.out.println(nombre);
	}
}
=======

	String nombre;

	public void rodar() {
		System.out.println("Estoy rodando...");
	}

}
>>>>>>> master
