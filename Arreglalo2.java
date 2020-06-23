public class Arreglalo2 {
	public Persona persona;

	public static void main(String... args) {
		Arreglalo2 arreglalo2 = new Arreglalo2();
		arreglalo2.persona = new Persona();
		
		Calculadora calculadora = arreglalo2.persona.getCalculadora();

		int resultadoSuma = calculadora.sumar(10, 5);

		System.out.println("resultadosuma");

		float resultadoDividir = calculadora.dividir(5.5f, 4.0f);

		System.out.println("resultadoDividir");
	}
}

class Persona {
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