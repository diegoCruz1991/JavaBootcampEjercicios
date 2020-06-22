//Le agregue al main method --> String[] args
//Para poder crear el objeto cuadrado le agregue new 
//Para poder crear el objeto figura le agregue new Figura()
//Cree la clase Figura
//Agregue la varible nombre en la clase Figura y...Segun yo ---Cree mi constructor en la clase figura pero - la inicializacion fue la correcta??
//Agregue el metodo rodar
//Al final quise imprimir el nombre - tratando de utilizar el get/set - tratando de entenderlo


public class Arreglalo {
	public static void main(String[] args) {
		Cuadrado cuadrado = new Cuadrado();
		cuadrado.figura.rodar();
		cuadrado.getName();
	}
}

class Cuadrado {

	Figura figura = new Figura();

	public Cuadrado() {
		iniciar();
	}

	private void iniciar() {
		this.figura.nombre = "cuadrado";
	}

	public void getName(){
		System.out.println(this.figura.nombre);
	}
}

class Figura{
	String nombre;
	public Figura(){
		this.nombre = "";
	}

	public static void rodar(){
		System.out.println("Los cuadrados ruedan ?... ");
	}
}