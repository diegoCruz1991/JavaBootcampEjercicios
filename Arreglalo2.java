public class Arreglalo2 {
	public Persona persona;

	public static void main(String... args) {
		Calculadora calculadora = new Persona();

		int resultadoSuma = calculadora.sumar(10, 5);

		System.out.println(resultadoSuma);

		float resultadoDividir = calculadora.dividir(5.5f, 4.0f);

		System.out.println(resultadoDividir);
	}
}

class Persona extends Calculadora {
	private Calculadora calculadora;

	Persona() {
		this.calculadora = new Calculadora();
	}

	private Calculadora getCalculadora() {
		return this.calculadora;
	}
}

class Calculadora {

	public int sumar(int a, int b) {
		return a + b;
	}

	public float dividir(float numero1, float numero2) {
		return numero1 / numero2;
	}
}