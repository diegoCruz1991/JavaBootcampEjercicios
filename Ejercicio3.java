public class Ejercicio3 {

	public static void main(String... args) {
		Calculadora calculadora = new Calculadora(); //Objeto de la clase calculados

		int resultSuma= calculadora.sumar(5,5); 
		System.out.println("El resultado de la suma es: " + resultSuma);

		int resultResta=calculadora.restar(10,10);
		System.out.println("El resultado de la resta es: " + resultResta);

		double resultDividir=calculadora.dividir(15.1236d,75.36d);
		System.out.println("El resultado de la divici\u00f3n es: " + resultDividir);

		float resultMultiplicar=calculadora.multiplicar(6.2f,8.1f);
		System.out.println("El resultado de la multiplicaci\u00f3n es: " + resultMultiplicar);	

			
		CalculadoraLogica calculadoraLogica = new CalculadoraLogica(); //Objeto de la clase calculadora lógica

		boolean esIgual = calculadoraLogica.esIgual((5 / 5) +(( 4 - 3 )* 7 )+ 10, 18);
		System.out.println("El resultado de igualar los n\u00fameros es: " + esIgual);	
		
	}
}

 class Calculadora{

	//Hacer que el metodo sumar() de calculadora me traiga la suma de 2 numeros enteros
	public int sumar(int entero1, int entero2) {
		return entero1 + entero2;
	}
	//Hacer que el metodo restar() de calculadora me traiga la suma de 2 numeros enteros
	public int restar(int entero1, int entero2) {
		return entero1 - entero2;

	}
	//Hacer que el metodo dividir() de calculadora me traiga la division de 2 numeros double
	public double dividir(double num1, double num2) {
		return num1 / num2;
	}
	//Hacer que el metodo multiplicar() de calculadora me traiga la multiplicacion de 2 numeros flotantes
	public float multiplicar(float flotante1, float flotante2) {
		return flotante1 * flotante2;
	}

}

class CalculadoraLogica{

	//Primero, crear el metodo esIgual para que compare que 2 numeros son iguales o no
    public boolean esIgual(int uno, int dos){
    		if(uno==dos) //Compara los números
    		return true; //Segundo, hacer que el metodo esIgual regrese true cuando le paso los valores y/o operaciones que estan arriba
    		else 
    		return false;
    		//System.out.println("Los números no son iguales");	

	}

}
