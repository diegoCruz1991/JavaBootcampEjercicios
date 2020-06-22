public class Arreglalo {
	
	public static void main(String[] args) {
		Cuadrado cuadrado = new Cuadrado();
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
		Cuadrado cuadrado = new Cuadrado(); 
		this.figura = cuadrado;
	}
}