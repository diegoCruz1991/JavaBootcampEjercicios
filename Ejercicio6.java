public class Ejercicio6 {

	public static void main(String... args) {

		/* Subir a Git, Ejercicio6.java
	Hacer un metodo trimSpecial()

	- Quitar espacios al inicio,
	- Quitar espacios al final.
	- Quitar espacion enmedio

	trimSpecial(" H    ola  ") -> "Hola"

	- NO usar metodo trim() */

		Ejercicio6 ejercicio = new Ejercicio6();
		ejercicio.trimSpecial(" H o      l a     ");

	}

	public String trimSpecial(String cadena) {
		cadena = cadena.replace(" ", "");
		System.out.println(cadena);
		return cadena;
	}

}