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

/**
 * Git steps to upload to remote branch
 * 1 - git add Arreglalo2.java
 * 2 - git commit -m "Arreglalo 2 terminado"
 * 3 - git push -u origin LuisAntonio_branch
 */

/**
 * Git steps to pull latest changes from master
 * 1 - git checkout master  
 * 2 - git pull origin master 
 * 3 - git checkout LuisAntonio_branch
 * 4 - git merge master
 */