package ejercicios;

public class EjercicioAsserts {
    public static void main(String[] args) {
       assert cortarCadena("HOLA LALO!")[1].equals("LALO!") : "Cortar cadena no regresa la cadena esperada";

       assert reverse("HOLA LALO!").equals("!OLAL ALOH"): "Reverse no regresa la cadena esperada";

       assert eliminarEspacios(" H OLA  LA LO !  ").equals("HOLALALO!"): "Eliminar espacios no regresa la cadena esperada";

       assert numeroVocales("HOOLA LAALO!") == 6 : "el numero de vocales es incorrecto";

       System.out.println("Everything went better than expected");
    }

    static String[] cortarCadena(String cadena){
        String[] cadenaDividida = new String[2];
        int mitad = cadena.length() / 2;
        cadenaDividida[0] = cadena.substring(0, mitad);
        cadenaDividida[1] = cadena.substring(mitad);
        return cadenaDividida;
    }

    static String reverse(String cadena){
        StringBuilder cadenaInvertida = new StringBuilder("");
        for (int i = cadena.length() - 1; i >= 0 ; i--){
            cadenaInvertida.append(cadena.charAt(i));
        }
        return cadenaInvertida.toString();
    }

    static String eliminarEspacios(String cadena){
        return cadena.replace(" ","");
    }

    static int numeroVocales(String cadena){
        char[] vocales = new char[]{'a', 'e', 'i', 'o', 'u'};
        int contadorVocales = 0;
        cadena = cadena.toLowerCase();
        for (int i = 0; i < cadena.length(); i++){
            for (char vocal : vocales) {
                if (cadena.charAt(i) == vocal) {
                    contadorVocales++;
                }
            }
        }
        return contadorVocales;
    }
}
