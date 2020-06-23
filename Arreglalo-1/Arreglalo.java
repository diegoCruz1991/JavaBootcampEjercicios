/**
	Created the day 20/06/2020
	@Author:Eduardo Avila Carranza
	Program: Solución para el arreglo.
*/

public class Arreglalo {

	public void rodar(){
		System.out.println("ESTROY RODANDO");
	}
	public void iniciar(){
		System.out.println("Corriendo proceso...");
	}

	public static void main(String[] args) {
		Cuadrado cuadrado = new Cuadrado();

		cuadrado.rodar();
		cuadrado.iniciar();
	}
}

class Cuadrado extends Arreglalo{

private String Formulario;

	String figura;
	String nombre;

	public void Cuadrado() {

		Cuadrado compilar = new Cuadrado();
		compilar.iniciar("test");
	}

	public void iniciar(String actualizacion) {
		this.Formulario = actualizacion;
		this.figura = actualizacion;
		this.nombre = actualizacion;
	}
}