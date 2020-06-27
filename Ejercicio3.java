public class Ejercicio3 {

	public static void main(String... args) {
		
			
		Calculadora calculadora = new Calculadora();
	 //int resultadoSuma=calculadora.sumar(23, 62);
	 double resultadoSuma=calculadora.sumar(63.2,54.9);
	 //float resultadoSuma=calculadora.sumar(87.25f,61.9f);
	 System.out.println("El resultado de la suma de dos numeros enteros fue:"+resultadoSuma);
	 
	// int resultadoResta=calculadora.restar(70, 59);
	 //double resultadoResta=calculadora.restar(70.3, 59.1);
	 float resultadoResta=calculadora.restar(52.1f, 25.1f);
	System.out.println("El resultado de la resta de dos numeros enteros fue:"+resultadoResta);
	
//	double resultadoDivision=calculadora.dividor(25, 6);
	int resultadoDivision=calculadora.dividor(25, 6);
	//float resultadoDisision=calculadora.dividor(25, 6);
	System.out.println("El resultado de la division fue:"+resultadoDivision);

	//float resultadoMultiplicacion=calculadora.multiplicar(6, 8);
	//double resultadoMultiplicacion=calculadora.multiplicar(6, 8);
	int resultadoMultiplicacion=calculadora.multiplicar(9, 8);
	System.out.println("El resultado de la multiplicacion es:"+resultadoMultiplicacion);
		CalculadoraLogica calculadoraLogica = new CalculadoraLogica();

	boolean esIgual = calculadoraLogica.esIgual(5 / 5 + (4 - 3) * (7 + 10), 18);
	System.out.println(esIgual);
	
		
	}
}

class Calculadora{


		public static int sumar(int nro1,int nro2){
			return nro1+nro2;
		}
		public static double sumar(double a, double b){
			return a+b;
		}
		public static float sumar(float a, float b){
			return a+b;
		}
		public static double sumar(int a, double b){
			return a+b;
		}
		public static float sumar(float a, int b){
			return a+b;
		}
		

		public static int restar(int nro1,int nro2){
			return nro1-nro2;
		}
		
		public static double restar(double a, double b){
			return a-b;
		}
		
		public static float restar(float a, float b){
			return a-b;
		}
		public static float restar(int a, float b){
			return a-b;
		}
		public static double restar(int a, double b){
			return a-b;
		}
	
		public static double multiplicar(double d1,double d2){
			return d1*d2;
		}
		
		public static float multiplicar(float b, float a){
			return a*b;
		}
		public static int multiplicar(int a, int b){
			return a*b;
		}
		public static double multiplicar(double a, int b){
			return a*b;
		}
		public static float multiplicar(int a, float b){
			return a*b;
		}
		public static float dividor(float d1,float d2){
			return d1/d2;
		}
		public static double dividor(double a, double b){
			return a/b;
		}
		public static int dividor(int a, int b){
			return a/b;
		}
		public static double dividor(double a, int b){
			return a/b;
		}
		public static float dividor(int a, float b){
			return a/b;
		}
		
}

class CalculadoraLogica extends Calculadora{
	public boolean esIgual(int na, int nb){
		if(na==nb) return true;
		else return false;
	}
}