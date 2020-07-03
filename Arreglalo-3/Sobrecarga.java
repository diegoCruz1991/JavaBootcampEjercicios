public class Sobrecarga{

	public static void main(String... args){

		Operador operador  = new Operador();

		operador.suma(2.5, 7);
		operador.suma(8, 6.6);
		operador.suma(5.6, 7.8);
		operador.suma(2.3, 7);
		operador.suma(3, 5.5);
		operador.suma(3.5, 5.5);
		operador.suma(2.3);
		operador.suma(2, 4, 6);
		operador.resta(5, 6);
		operador.resta(8, 6.6);
		operador.resta(5.6, 7.8);
		operador.resta(2.3, 7);
		operador.resta(3, 5.5);
		operador.resta(3.5, 5.5);
		operador.resta(2.3);
		operador.resta(2, 4, 6);
		operador.division(5, 6);
		operador.division(8, 6.6);
		operador.division(5.6, 7.8);
		operador.division(2.3, 7);
		operador.division(3, 5.5);
		operador.division(3.5, 5.5);
		operador.dividir(48, 4, 2, 2);
		operador.multiplicacion(5, 6);
		operador.multiplicacion(2.3);
		operador.multiplicacion(2, 4, 6);

	}


}

class Operador{


	public static double suma(double a) {
		System.out.println(a);
		return a;
	}

	public static int suma(int a, int b) {
		System.out.println(a + b);
		return a + b;
	}

	public static double suma(int a, float b) {
		System.out.println(a + b);
		return a + b;
	}

	public static double suma(double a, double b) {
		System.out.println(a + b);
		return a + b;
	}

	public static float suma(float a, int b) {
		System.out.println(a + b);
		return a + b;
	}

	public static double suma(int a, double b) {
		System.out.println(a + b);
		return a + b;
	}

	public static double suma(double a, int b) {
		System.out.println(a + b);
		return a + b;
	}

	public static int suma(int... numeros){
		int suma=0;
		for (int index=0; index<numeros.length; index++)
			suma+=numeros[index];
		return suma;
	}


	public static double resta(double a) {
		System.out.println(a);
		return a;
	}
	public static int resta(int a, int b) {
		System.out.println(a - b);
		return a - b;
	}

	public static double resta(float a, float b) {
		System.out.println(a - b);
		return a - b;
	}

	public static float resta(float a, int b) {
		System.out.println(a - b);
		return a - b;
	}

	public static float resta(int a, float b) {
		System.out.println(a - b);
		return a - b;
	}

	public static double resta(double a, double b) {
		System.out.println(a - b);
		return a - b;
	}

	public static double resta(int a, double b) {
		System.out.println(a - b);
		return a - b;
	}

	public static double resta(double a, int b) {
		System.out.println(a - b);
		return a - b;
	}

	public static int restar(int... numeros){
		int resta=0;
		for (int index=0; index<numeros.length; index++)
			resta-=numeros[index];
		return resta;
	}


	public static double division(double a) {
		System.out.println(a);
		return a;
	}

	public static double division(double a, double b) {
		System.out.println(a / b);
		return a / b;
	}

	public static int division(int a, int b) {
		System.out.println(a / b);
		return a / b;
	}


	public static double multiplicacion(double a) {
		System.out.println(a);
		return a;
	}

	public static float multiplicacion(float a) {
		System.out.println(a );
		return a;
	}

	public static int multiplicacion(int a, int b) {
		System.out.println(a * b);
		return a * b;
	}

	public static int multiplicacion(int... numeros){
		int multiplicacion=1;
		for (int index=0; index<numeros.length; index++)
			multiplicacion*=numeros[index];
		return multiplicacion;
	}
}



