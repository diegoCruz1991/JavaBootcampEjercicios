public class Arreglalo {
	public static void main(String[] args) {
		Cuadrado cuadrado = new Cuadrado();

		cuadrado.figura.rodar();
	}
}

class Cuadrado {

	Figura figura;

	public Cuadrado() {
		iniciar();
	}

	private void iniciar() {
		this.figura = new Figura();
		this.figura.nombre = "cuadrado";
	}
}

class Figura {
	String nombre;
	
	Figura(){
		this.nombre=nombre;
	}
	public void rodar() {
		System.out.println("Los cuadrados rodando se encuentran...");
	}
		
}
	