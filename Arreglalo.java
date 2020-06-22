public class Arreglalo {

	public static void main(String... args) {
	
		Cuadrado cuadrado = new Cuadrado();
 		System.out.println("Esto es un "+ cuadrado.figura);
	
	}
}


class Cuadrado {
		
	String figura;

	public Cuadrado() {
		iniciar();
	}

	private void  iniciar() {
		this.figura = "Cuadrado";
	}
}