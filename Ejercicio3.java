public class Ejercicio3 {

	public static void main(String... args) {
		
			
		Calculadora calculadora = new Calculadora();
	 int resultadoSuma=calculadora.sumar(23, 62);
	 System.out.println("El resultado de la suma de dos numeros enteros fue:"+resultadoSuma);
	 
	 int resultadoResta=calculadora.restar(70, 59);
	System.out.println("El resultado de la resta de dos numeros enteros fue:"+resultadoResta);
	
	double resultadoDivision=calculadora.dividor(25, 6);
	System.out.println("El resultado de la division fue:"+resultadoDivision);

	double resultadoMultiplicacion=calculadora.multiplicar(6, 8);
	System.out.println("El resultado de la multiplicacion es:"+resultadoMultiplicacion);
		CalculadoraLogica calculadoraLogica = new CalculadoraLogica();

	boolean esIgual = calculadoraLogica.esIgual(5 / 5 + 4 - 3 * 7 + 10, 18);
	System.out.println(esIgual);
	
		
	}
}

class Calculadora{


		public int sumar(int nro1,int nro2){
			return nro1+nro2;
		}

		public int restar(int nro1,int nro2){
			return nro1-nro2;
		}
	
		public double multiplicar(double d1,double d2){
			return d1*d2;
		}
		public double dividor(double d1,double d2){
			return d1/d2;
		}
		
		
}

class CalculadoraLogica extends Calculadora{
	public boolean esIgual(int na, int nb){
		na=na*(-3);
		if(na==nb) return true;
		else return false;
	}
}