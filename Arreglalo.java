public class Arreglalo {

	public static void main(String... args) {
	
		Cuadrado cuadrado = new Cuadrado();
 		
	
	}
}


class Cuadrado {
		
	Figura figura;

	public Cuadrado() {
		iniciar();
	}

	private void  iniciar() {
		this.figura=new Figura();

		this.figura.nombre = "cuadrado";
	}
}

class Figura {
	String nombre;
	public void rodar(){
		System.out.println("Estoy rodando ");

	}
}