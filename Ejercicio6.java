/*
Hacer un metodo trimSpecial()

-Quitar espacios al inicio
-Quitar espacios al final
-Quitar espacios de enmedio

trimSpecial(" H  ola   ")

-No usar el metodo trim()

--> Subir al repositorio Ejercicio6.java
*/

public class Ejercicio6 {

	public static void main(String... args){
		
		Ejercicio6 ejercicio = new Ejercicio6();
	
		String cadena = "      Ho      la       como    estas   ";
		
		System.out.println("RESULTADO: <"+ejercicio.trimSpecial(cadena)+">");
	}
	
	public String trimSpecial(String cadena){
		
		// Quita espacios al principio si los hay
		
		int i = 0;
		int inicio = 0;
		int fin = 0;
		while(i < cadena.length() && cadena.charAt(i) == ' ') {
			i++;
		}

		cadena = cadena.substring(i);

		// Quita espacios al final si los hay
		
		i = cadena.length();
		if (i != 0){
			while(i >= 0 && cadena.charAt(i-1) == ' ') {
				i--;
			}
			cadena = cadena.substring(0, i);
		}
	
		// Quita espacios de enmedio si los hay
		
		cadena = cadena.replace(" ", "");

		return cadena;
	}
}