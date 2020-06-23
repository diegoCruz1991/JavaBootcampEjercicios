public class Arreglalo2 {
	public Persona persona;

	public static void main(String... args) {
		Persona persona = new Persona();
		Calculadora calculadora = persona.getCalculadora();

		int resultadoSuma = calculadora.sumar(10, 5);

		System.out.println(resultadoSuma);

		double resultadoDividir = calculadora.dividir(5.5, 4.0);

		System.out.println(resultadoDividir);
	}
}

class Persona extends Calculadora {
	Calculadora calculadora;
	Persona persona;

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

	public double dividir(double numero1, double numero2) {
		return numero1 / numero2;
	}
}