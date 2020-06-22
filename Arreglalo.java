public class Arreglalo {
	public static void main() {
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
		this.figura.nombre = "cuadrado";
	}
}