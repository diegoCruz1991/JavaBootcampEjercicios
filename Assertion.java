package ejercicios;

import org.testng.Assert;

public class Assertion {
    public static void main(String[] args) {
        //               012345678    Referencia de las posiciones de cada caracter
        String cadena = "MILANNEZA";
        String chain = " Hola a todo el mundo ";

        String cadenapartida = cadena.substring(0, 5); //De la cadena se crea otro string de la posicion 0 a la 4
        String cadenacortada = cadena.substring(5, 9); //De la cadena se crea otro string de la posicion 5 a la 9
        System.out.println(cadenapartida);  //Imprime la variable cadenapartida que indica las posiciones 0, 1, 2, 3 y 4
        System.out.println(cadenacortada);   //Imprime la variable cadenacortada que indica las posiciones 5, 6, 7, 8 y 9

        String cadenaInversa = "";   //Defino una string vacia
        for (int x = cadena.length() - 1; x >= 0; x--) {    //en este for se especifican las posiciones
            //la longitud de la variable cadena para que vaya de derecha a izquierda
            cadenaInversa = cadenaInversa + cadena.charAt(x);      //Con esta indicación se invierte el orden de la cadena


            //Con el replace eliminamos espacios y especificamos con que se van a reemplazar
            chain.trim();

        }
        System.out.println(cadenaInversa);

        int contador = 0;   //una variable entera de valor 0
        for (int v = 0; v < chain.length(); v++) { // se define donde empieza el ciclo y hasta donde termina recorriendo toda la longitud de la cadena para encontrar las vocales
            if ((chain.charAt(v) == 'a') || (chain.charAt(v) == 'e') || (chain.charAt(v) == 'i') || (chain.charAt(v) == 'o') || (chain.charAt(v) == 'u')) { //
                contador++; //el contador incrementara su cuenta en 1 hasta que termine el ciclo

            }
                    }
        System.out.println(chain.trim());
        System.out.println("El numero de vocales es la cadena " + contador);  //Concatena la cadena con la variable contador

        Assert.assertEquals(cadenapartida, "MILAN");
        Assert.assertEquals(cadenacortada, "NEZA");
        Assert.assertEquals(chain.trim(), "Holaatodoelmundo");
        Assert.assertEquals(cadenaInversa, "AZEN NALIM");
        Assert.assertEquals(contador, 8);

    }
}
