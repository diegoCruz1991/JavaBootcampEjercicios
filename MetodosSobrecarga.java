public class MetodosSobrecarga{
	
	public static void main(String[] args){
		//Using int	
		System.out.println("Suma usando enteros: " + Calculadora.sumar(5, 5));
		System.out.println("Resta usando enteros: " + Calculadora.restar(5, 5));
		System.out.println("Multiplica usando enteros: " + Calculadora.multiplicar(5, 5));
		System.out.println("Divide usando enteros: " + Calculadora.dividir(5, 5));
		//Using double
		System.out.println("Suma usando doubles: " + Calculadora.sumar(5.5, 5.8));
		System.out.println("Resta usando doubles: " + Calculadora.restar(5.5, 5.8));
		System.out.println("Multiplica usando doubles: " + Calculadora.multiplicar(5.5, 5.8));
		System.out.println("Divide usando doubles: " + Calculadora.dividir(5.5, 5.8));
		//Using float
		System.out.println("Suma usando floats: " + Calculadora.sumar(5.2318f, 5.4231f));
		System.out.println("Resta usando floats: " + Calculadora.restar(5.2318f, 5.4231f));
		System.out.println("Multiplica usando floats: " + Calculadora.multiplicar(5.2318f, 5.4231f));
		System.out.println("Divide usando floats: " + Calculadora.dividir(5.2318f, 5.4231f));
		//Using void
		Calculadora.sumar(5, 6.4231f);
		Calculadora.restar(5, 6.4231f);
		Calculadora.multiplicar(5, 6.4231f);
		Calculadora.dividir(5, 6.4231f);
		//Using var args
		System.out.println("Suma de var args igual a: " + Calculadora.sumar(2, 4, 6));
		System.out.println("Resta de var args igual a: " + Calculadora.restar(2, 4, 6));
		System.out.println("Multiplicacion de var args igual a: " + Calculadora.multiplicar(2, 4, 6));
		System.out.println("Division de var args igual a: " + Calculadora.dividir(48, 4, 2, 2));
	}
}

class Calculadora{

	//Sumar

	public static int sumar (int x, int y){
		return x + y;
	}

	public static void sumar (int x, float y){
		System.out.println("Sumar Void: " +(x + y));	
	}

	public static double sumar (double a, double b){
		return a + b;
	}

	public static float sumar (float d, float e){
		return d + e;
	}
	
	public static int sumar (int... cadenaNumeros){
	int suma=0;
	for (int index=0; index<cadenaNumeros.length; index++)
		suma+=cadenaNumeros[index];
	return suma;
	}

	//Restar	

	public static int restar (int x, int y){
		return x - y;
	}

	public static void restar (int x, float y){
		System.out.println("Restar Void: " + (x - y));
	}

	public static double restar (double a, double b){
		return a - b;
	}

	public static float restar (float d, float e){
		return d - e;
	}

	public static int restar (int... cadenaNumeros){
	int resta=0;
	for (int index=0; index<cadenaNumeros.length; index++)
		resta-=cadenaNumeros[index];
	return resta;
	}

	//Multiplicar

	public static int multiplicar (int x, int y){
		return x * y;
	}

	public static void multiplicar (int x, float y){
		System.out.println("Multiplicar Void: " + (x * y));
	}

	public static double multiplicar (double a, double b){
		return a * b;
	}

	public static float multiplicar (float d, float e){
		return d * e;
	}

	public static int multiplicar (int... cadenaNumeros){ //Inicialice en 1 la variable multiplicacion para que en la primer multiplicacion no igualara a 0, y dado que 1 funge como factor neutro
	int multiplicacion=1;
	for (int index=0; index<cadenaNumeros.length; index++)
		multiplicacion*=cadenaNumeros[index];
	return multiplicacion;
	}

	// Dividir

	public static int dividir (int x, int y){
		return x / y;
	}

	public static void dividir (int x, float y){
		System.out.println("Dividir Void: "+ (x / y));
	}

	public static double dividir (double a, double b){
		return a / b;
	}

	public static float dividir (float d, float e){
		return d / e;
	}
	
	public static int dividir (int... cadenaNumeros){ //Decidi igualar el primer numero a la variable division y empezar el ciclo for a partir del segundo numero del array para hacerlo trabajar mejor
	int division=cadenaNumeros[0];
	for (int index=1; index<cadenaNumeros.length; index++)
		division/=cadenaNumeros[index];
	return division;
	}
}