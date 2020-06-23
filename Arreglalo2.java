public class Arreglalo2 {
	public Persona persona;
	public static void main(String... args) {
		Calculadora calculadora = new Calculadora();

		int resultadoSuma = calculadora.sumar(10, 5);

		System.out.println(resultadoSuma);

		double resultadoDividir = calculadora.dividir(5.5d, 4.0d);

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

	public double dividir(double numero1, double numero2) {
		return numero1 / numero2;
	}
}