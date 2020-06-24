
public class Ejercicio3 {

	
	public static void main(String... args) {
		Calculadora calculadora = new Calculadora();
		int resultadoSuma = calculadora.sumar(10, 5);
		System.out.println(resultadoSuma);

		int resultadoResta = calculadora.restar(15, 5);
		System.out.println(resultadoResta);

		double resultadoDivide= calculadora.dividir(2.5, 0.5);
		System.out.println(resultadoDivide);

		float resultadoMultiplica = calculadora.multiplicar(234.5f, 1.1f);
		System.out.println(resultadoMultiplica);
//
		CalculadoraLogica calculadoraLogica = new CalculadoraLogica();

		boolean esIgual = calculadoraLogica.esIgual(5 / 5 + 4 - 3 * 7 + 10, 18);
		calculadoraLogica.esIgual(5 / 5 + (4 - 3) * (7 + 10), 18);
		
	}

}
 class Calculadora {

	public int sumar(int a, int b) {
		return a + b;
	}

	public int restar(int a, int b){
		return a - b;
	}

	public double dividir(double numero1, double numero2) {
		return numero1 / numero2;
	}

	public float multiplicar (float numero1, float numero2) {
		return numero1 * numero2;
	}
}

class CalculadoraLogica{

	boolean esIgual(int value1, int value2)
	{
		System.out.println("esIgual value1: "+value1+" y value2: "+ value2 + (value1 == value2 ? " Si":" No"));
		return value1 == value2;
	}

}
