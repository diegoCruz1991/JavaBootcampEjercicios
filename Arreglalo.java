public class Arreglalo {
<<<<<<< HEAD
	
	public static void main(String[] args) {
		Cuadrado cuadrado = new Cuadrado();
=======
	public static void main(String... args) {
		Cuadrado cuadrado = new Cuadrado();

>>>>>>> master
		cuadrado.figura.rodar();
		System.out.println("Testing by Adriana");
	}
}

class Figura {

	 void rodar() {

	}
	
}

class Cuadrado extends Figura {

	Figura figura=new Figura();

	public void Cuadrado() {
		iniciar();
	}

	private void iniciar() {
<<<<<<< HEAD
		Cuadrado cuadrado = new Cuadrado(); 
		this.figura = cuadrado;
=======
		this.figura = new Figura();
		this.figura.nombre = "cuadrado";
>>>>>>> master
	}
}

class Figura {

	String nombre;

	public void rodar() {
		System.out.println("Estoy rodando...");
	}

}