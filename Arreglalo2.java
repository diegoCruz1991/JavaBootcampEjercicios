public class Arreglalo2 {
	public Persona persona;

	public static void main(String... args) {
		Calculadora calculadora = persona.getCalculadora();

		short resultadoSuma = calculadora.sumar('10', 5);

		System.out.println(resultado);

		short resultadoDividir = calculadora.dividir(5.5f, 4.0f);

		System.out.println(resultado);
	}
}

class Persona {
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

	public float dividir(double numero1, double numero2) {
		return numero1 / numero2;
	}
}