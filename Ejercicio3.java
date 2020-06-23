public class Ejercicio3 {
	public static void main(String... args) {
		Calculadora calculadora = new Calculadora();
		int a = 10; // Variable utilizada para los metodos sumar() y restar()
		int b = 100; // Variable utilizada para los metodos sumar() y restar()
		double x = 5.4356; // Variable utilizada para el metodo dividir()
		double y = 1.3829; // Variable utilizada para el metodo dividir()
		float m = 83.69f; // Variable utilizada para el metodo multiplicar()
		float n = 8.78f; // Variable utilizada para el metodo multiplicar()
		int numA = 100; // Variable utilizada para comparar que 2 numeros son iguales o no
		int numB = 100; // Variable utilizada para comparar que 2 numeros son iguales o no
		calculadora.sumar(a, b); //Hacer que el metodo sumar() de calculadora me traiga la suma de 2 numeros enteros
		calculadora.restar(a, b); //Hacer que el metodo restar() de calculadora me traiga la suma de 2 numeros enteros
		calculadora.dividir(x, y); //Hacer que el metodo dividir() de calculadora me traiga la division de 2 numeros double
		calculadora.multiplicar(m, n); //Hacer que el metodo multiplicar() de calculadora me traiga la multiplicacion de 2 numeros flotantes
		CalculadoraLogica calculadoraLogica = new CalculadoraLogica(); //Creo la variable calculadoraLogica de tipo CalculadoraLogica
		System.out.println("Are the two numbers equal?: " + calculadoraLogica.esIgual(numA, numB)); //Imprimo el resultado de la comparacion que obtengo al enviar dos variables numA y NumB
		boolean esIgual = calculadoraLogica.esIgual(((5/5)+((4-3)*7))+10, 18); // Guarda en la variable "esIgual" el resultado de mi comparación
		System.out.println("Are the two numbers, provided by Diego, equal?: " + esIgual); //Imprimo el valor de "esIgual"
		/*
		*	Primero, crear el metodo esIgual para que compare que 2 numeros son iguales o no 
		*	Segundo, hacer que el metodo esIgual regrese true cuando le paso los valores y/o operaciones que estan arriba
		*/
		
	}
}

class Calculadora{
	void sumar(int num1, int num2){ 
		int resultado = num1 + num2; //Sumo ambos numeros y lo guardo en resultado
		System.out.println(num1 + " + " + num2 + " = " + resultado); //Imprimo el resultado, podria hacerlo asi en una sola linea System.out.println(num1 + num2)
	}
	
	void restar(int num1, int num2){
		int resultado = num1 - num2; //Resto ambos numeros
		System.out.println(num1 + " - " + num2 + " = " + resultado); //Imprimo el resultado
	}

	void dividir(double num1, double num2){
		double resultado = num1 / num2; //Divido ambos numeros
		System.out.println(num1 + " / " + num2 + " = " + resultado); //Imprimo el resultado
	}

	void multiplicar(float num1, float num2){
		float resultado = num1 * num2; //Multiplico ambos numeros
		System.out.println(num1 + " * " + num2 + " = " + resultado); //Imprimo el resultado
	}
}

class CalculadoraLogica{ 
	boolean esIgual(double numA, double numB){ // uso este metodo para hacer las comparaciones 
		return numA == numB; //regreso el valor boleano de la comparacion entre ambos numeros
	}	
}