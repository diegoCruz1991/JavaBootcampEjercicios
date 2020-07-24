public class Ejercicio3_2 {

	public static void main(String... args) {
		Calculadora calculadora = new Calculadora(); //Objeto de la clase calculados

		
		System.out.println("El resultado de la suma + de 2 es: " + calculadora.sumar(5,5,9,2) ); //Se imprime y envía la suma de más de 2 números de cualquier tipo

		System.out.println("El resultado de la suma de 2 enteros es: " + calculadora.sumar(1,7));


		System.out.println("El resultado de la resta es: " + calculadora.restar(10,10));

		System.out.println("El resultado de la divici\u00f3n es: " + calculadora.dividir(15.1236d,75.36d));

		System.out.println("El resultado de la multiplicaci\u00f3n es: " + calculadora.multiplicar(6.2f,8.1f));	

			
		CalculadoraLogica calculadoraLogica = new CalculadoraLogica(); //Objeto de la clase calculadora lógica

		boolean esIgual = calculadoraLogica.esIgual((5 / 5) +(( 4 - 3 )* 7 )+ 10, 18);
		System.out.println("El resultado de igualar los n\u00fameros es: " + esIgual);	
		
	}
}

 class Calculadora{

	public static double sumar(double... a) { //Método Sumar que suma varios números 
		int sum=0; //Variable que va a guardar la suma de los N datos de entrada
		for(int i=0; i<a.length ; i++){ //Este for suma los N datos de entrada
			sum +=a[i]; // Suma los N datos de entrada
		}
		return sum; //Regresa el reultado de la suma
	}

	public static int sumar(int a, int b) { //Método summar que solo  imprime la suma de 2 enteros
		return a + b;
	}


	public static double restar(double a, double b) {
		return a - b;

	}
	public static double dividir(double a, double b) {
		return a / b;
	}
	public static double multiplicar(double a, double b) {
		return a * b;
	}

}

class CalculadoraLogica{

	//Primero, crear el metodo esIgual y regresa si los números son iguales
    public boolean esIgual(int uno, int dos){
    		return uno==dos;
   

	}



}
