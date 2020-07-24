public class Arreglalo2 {
	public Persona persona;

	public static void main(String... args) {
		Arreglalo2 arreglalo2=new Arreglalo2 ();

		arreglalo2.persona= new Persona(); ///Nuevo
		 
		Calculadora calculadora = arreglalo2.persona.getCalculadora();

		int resultadoSuma = calculadora.sumar(10, 5); //Aqui en el 10 

		System.out.println(resultadoSuma);

		float resultadoDividir = calculadora.dividir(5.5f, 4.0f); //aqui

		System.out.println(resultadoDividir);
	}
}

class Persona {
	private Calculadora calculadora;

	Persona() { //aqui
		this.calculadora = new Calculadora();
	}

	public Calculadora getCalculadora() { //Se vuelve publico
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

