public class Arreglalo2 {
	public static Persona persona = new Persona();

	public static void main(String... args) {
		
		Calculadora calculadora = persona.getCalculadora();

		int resultadoSuma = calculadora.sumar(10, 5);

		System.out.println(resultadoSuma);

		float resultadoDividir = calculadora.dividir(5.5f, 4.0f);

		System.out.println(resultadoDividir);
	}
}

class Persona {
	private Calculadora calculadora;

	public Persona() {
		this.calculadora = new Calculadora();
	}

	public Calculadora getCalculadora() {
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