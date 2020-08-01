public class Ejercicio3 {

    public static void main (String[] args) {
		
		Calculadora calculadora = new Calculadora();

        Calculadora.sumar = sumar(2 , 3);
		Calculadora.sumar = sumar(1.7, 3.5, 4.9);
		Calculadora.sumar = sumar(1.7, 5);
        Calculadora.restar = restar(3 , 4);
		Calculadora.restar = restar(10 , 5, 1);
        Calculadora.multiplicar = multiplicar(1.1 , 2.2);
		Calculadora.multiplicar = multiplicar(5.5 , 4.3, 3.9);
        Calculadoradividir = dividir(1.5 , .75);

        boolean esIgual = CalculadoraLogica.esIgual(5 / 5 + (4 - 3) * 7 + 10, 18);

        if (esIgual) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    public static int sumar(int a, int b){
        return a + b;
	
	}
	
	public static double sumar(double a, double b, double c){
        return a + b + c;
		
	}
	
	public static double sumar(double a, int b){
        return a + b;
    }

    public static int restar(int a, int b){
        return a - b;
		
	}	
	
	public static int restar(int a, int b, int c){
        return a - b - c;
	
	}
	
	public static float restar(float a, float b){
        return a + b;
    }

    public static float multiplicar(float a , float b){
        return a * b;
	
	}
	
	public static float multiplicar(float a , float b, float c){
        return a * b * c;

    }

    public static double dividir(double a, double b){
        return a / b;

    }

    //Hacer que el metodo sumar() de calculadora me traiga la suma de 2 numeros enteros
    //Hacer que el metodo restar() de calculadora me traiga la suma de 2 numeros enteros
    //Hacer que el metodo dividir() de calculadora me traiga la division de 2 numeros double
    //Hacer que el metodo multiplicar() de calculadora me traiga la multiplicacion de 2 numeros flotantes
    static class CalculadoraLogica {

        public static boolean esIgual(int a, int b) {
            return a == b;
        }

        // Primero, crear el metodo esIgual para que compare que 2 numeros son iguale so no
        // Segundo, hacer que el metodo esIgual regrese true cuando le paso los valores y/o operaciones que estan arriba
    }
}
