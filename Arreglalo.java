// Que compile y corra.
// Debe estar en el repositorio.

public class Arreglalo {
	public void rodar() {
		System.out.println("y estoy rodando!!");
	}
	
	public static void main(String args[]) {
		Cuadrado cuadrado = new Cuadrado();
		Circulo circulo = new Circulo();

		cuadrado.iniciar();
		cuadrado.rodar();
	}
}

class Cuadrado extends Arreglalo {
	public String figura = "Cuadrado";

	public void iniciar() {
		System.out.println("Iniciando con la figura " + figura);
	}
}

class Circulo extends Arreglalo {
	public String figura = "Circulo";
}