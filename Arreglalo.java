public class Arreglalo {

	//TO-DO Revisar siguiente línea
	public static void main(String... args) {

		Cuadrado cuadrado = new Cuadrado();

		cuadrado.figura.rodar();
	}
}
class Figura{
	public String nombre;
	public void rodar(){
		System.out.println("Rodando");
	}
}
class Cuadrado {

	Figura figura;

	public void Cuadrado() {
		iniciar();
	}

	private void iniciar() {

		this.figura = new Figura();
		
		this.figura.nombre = "cuadrado";
	}
}

class Figura {

	String nombre;

	public void rodar() {
		System.out.println("Estoy rodando...");
	}

}