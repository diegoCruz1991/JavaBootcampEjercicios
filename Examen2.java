//Arreglalo para que d sea igual a 129

public class Examen2 {
	// hacer la variable estática, punto y coma
	public static short a = 5;

	public static void main(String... args) {
		int a = 10;
		short b = 20;
		short c = 30;
		char d = 's';
		// en lugar de usar this. llamar por medio de la clase
		a = b * Examen2.a;

		a++;

		c--;
		// se realiza la operación sobre otra varialbe de tipo int
		int f = (c + Examen2.a * b);
		//a esta variable se le hace un casting a char para asignarlo a d
		d = (char) f;
		
		//comillas a 's' para que tome el valor y no el símbolo
		int x = d + (d + 1) * 100 / Examen2.a * 's';

		System.out.println("Aqui d tiene que ser igual a 129");
		System.out.println("d: " + d);
		// no imprime nada porque 129 no está en la tabla ascii
	}
}
