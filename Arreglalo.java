public class Arreglalo {
	
	public static void main(String[] args) {
		
		Cuadrado cuadrado = new Cuadrado();
		System.out.println("Mi nombre es: "+cuadrado.nombre);

		cuadrado.rodar();
	}
}


class Figura {
	
	String nombre;
}


class Cuadrado extends Figura {

	public Cuadrado() {
		iniciar();
	}

	public void iniciar() {
		this.nombre = "cuadrado";
	}
	
	public void rodar() {
		System.out.println("Un cuadrado rodando ...");
	}
}
