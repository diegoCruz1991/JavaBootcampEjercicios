public class Arreglalo2 {
	public Persona persona;
<<<<<<< HEAD

	public static void main(String... args) {
		Arreglalo2 arreglalo2 = new Arreglalo2();

		arreglalo2.persona = new Persona();

		Calculadora calculadora = arreglalo2.persona.getCalculadora();
=======
	public static void main(String... args) {
		Calculadora calculadora = new Calculadora();
>>>>>>> 0b2034eb60332ed6bf2a0ac142873d40f4119197

		int resultadoSuma = calculadora.sumar(10, 5);

		System.out.println(resultadoSuma);

<<<<<<< HEAD
		float resultadoDividir = calculadora.dividir(5.5f, 4.0f);
=======
		double resultadoDividir = calculadora.dividir(5.5d, 4.0d);
>>>>>>> 0b2034eb60332ed6bf2a0ac142873d40f4119197

		System.out.println(resultadoDividir);
	}
}

<<<<<<< HEAD
class Persona {
=======
class Persona extends Calculadora{
>>>>>>> 0b2034eb60332ed6bf2a0ac142873d40f4119197
	private Calculadora calculadora;

	Persona() {
		this.calculadora = new Calculadora();
	}

	public Calculadora getCalculadora() {
		return this.calculadora;
	}
}

class Calculadora {
<<<<<<< HEAD

=======
	
>>>>>>> 0b2034eb60332ed6bf2a0ac142873d40f4119197
	public int sumar(int a, int b) {
		return a + b;
	}

<<<<<<< HEAD
	public float dividir(float numero1, float numero2) {
		return numero1 / numero2;
	}
}

=======
	public double dividir(double numero1, double numero2) {
		return numero1 / numero2;
	}
}
>>>>>>> 0b2034eb60332ed6bf2a0ac142873d40f4119197
