public class Arreglalo2 {
	public Persona persona;

	public static void main(String... args) {
		Persona calculadora = new Persona(); 
		//calculadora.getCalculadora();

		int resultadoSuma = calculadora.getCalculadora().sumar(10, 5);

		System.out.println(resultadoSuma);

		float resultadoDividir = calculadora.getCalculadora().dividir(5.5f, 4.0f);

		System.out.println(resultadoDividir);
	}
}

class Persona extends Calculadora{
	private Calculadora calculadora;

	Persona() {
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