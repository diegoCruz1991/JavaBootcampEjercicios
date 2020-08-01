public class Ejercicio33 {

    public static void main (String[] args) {

        int a = 2;
        int b = 4;
        double c = 6.5d;
        double d = 8.1d;
        float e = 5.4f;
        float f = 3.2f;

        int sumar = sumar(a , b);
        int restar = restar(a , b);
        float multiplicar = multiplicar(e , f);
        double dividir = dividir(c , d);

        System.out.println(sumar);
        System.out.println(restar);
        System.out.println(multiplicar);
        System.out.println(dividir);

        boolean esIgual = CalculadoraLogica.esIgual(5 / 5 + (4 - 3) * 7 + 10, 18);

        if (esIgual) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }

    static int sumar(int a, int b){
        return a + b;

    }

    static int restar(int a, int b){
        return a - b;

    }

    static float multiplicar(float e , float f){
        return e * f;

    }

    static double dividir(double c, double d){
        return c / d;

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
