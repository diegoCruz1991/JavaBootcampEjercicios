package ejercicios;

public class AssertionExercises {

    // Escribir una clase con 4 metodos basicos

    public static void main(String[] args) {

        // asserts de cortar cadena a la mitad. Cuando es impar el numero de caracteres, la primera mitad lleva el caracter adicional
        String[] mitades;
        mitades = cortarCadena(" H O L A");
        assert mitades[0].equals(" H O") && mitades[1].equals(" L A") : String.format ("Las mitades de cadena no son las esperadas");
        mitades = cortarCadena("Dulce Maria Gomez Barranco");
        assert mitades[0].equals("Dulce Maria G") && mitades[1].equals("omez Barranco") : String.format ("Las mitades de cadena no son las esperadas");
        //Genera excepcion
        mitades = cortarCadena("Dulce");
        //assert mitades[0].equals("Du") && mitades[1].equals("lce") : String.format ("Las mitades de cadena no son las esperadas : "+mitades[0]+" / "+mitades[1]);


        // asserts de eliminar espacios
        assert eliminarEspacios("Anita perdió su silla por haberse ido a la Villa.").equals("AnitaperdiósusillaporhaberseidoalaVilla.") : String.format("La cadena no es igual a la esperada");
        assert eliminarEspacios("  Hola cómo     estamos  en tiempos de pandemia        ").equals("Holacómoestamosentiemposdepandemia") : String.format("La cadena no es igual a la esperada");
        assert eliminarEspacios("     ").equals("") : String.format("La cadena no es igual a la esperada");
        assert eliminarEspacios("").equals("") : String.format("La cadena no es igual a la esperada");
        //Genera excepcion
        //assert eliminarEspacios("Encerraditos para cuidarnos del covid 19").equals("Encerraditosparacuidarnosdelcovid 19") : String.format("La cadena no es igual a la esperada");

        // asserts de contar vocales
        assert contarVocales("Hormiga") == 3 : String.format ("El numero de vocales no es el esperado");
        assert contarVocales("HORMIGA") == 3 : String.format ("El numero de vocales no es el esperado");
        assert contarVocales("parangaricutirimicuaro") == 11 : String.format ("El numero de vocales no es el esperado");
        //Genera excepcion
        //assert contarVocales("parAngarIcUtirimicuar0") == 11 : String.format ("El numero de vocales no es el esperado");

        // asserts de invertir cadena
        assert reverseCadena("Dulce").equals("ecluD") : String.format ("La cadena no es igual a la esperada");
        assert reverseCadena("Allí va Ramón y no maravilla").equals("allivaram on y nómaR av íllA") : String.format ("La cadena no es igual a la esperada");
        assert reverseCadena("Anita lava la tina").equals("anit al aval atinA") : String.format ("La cadena no es igual a la esperada");
        //Genera excepcion
        //assert reverseCadena("0123456789").equals("987654321") : String.format ("La cadena no es igual a la esperada");

    }

    // Cortar una cadena a la mitad y regresar un arreglo de 2 elementos con esas 2 mitades
    public static String[] cortarCadena (String cadena){
        String mitades[] = new String[2];
        int longitud = cadena.length();
        if ((longitud % 2) == 0) {
            // es par y ambas mitades son iguales en mumero de caracteres
            mitades[0] = cadena.substring(0, longitud / 2);
            mitades[1] = cadena.substring(longitud / 2);
        } else {
            // es impar y la primera mitad tiene un caracter mas
            mitades[0] = cadena.substring(0, longitud / 2 + 1);
            mitades[1] = cadena.substring((longitud / 2) + 1);
        }
        return mitades;
    }


    // Eliminar TODOS los espacios de una cadena
    public static String eliminarEspacios (String cadena) {
        return cadena.replace(" ", "");
    }


    // Hacer reverse a una cadena
    public static String reverseCadena(String cad) {
        if (cad == null) {
            return cad;
        }
        String reverse = "";
        for (int i = cad.length() - 1; i >= 0; i--) {
            reverse = reverse + cad.charAt(i);
        }
        return reverse;
    }

    // Regresar cuantas VOCALES se encuentran en una cadena
    public static int contarVocales (String cadena) {
        int contador = 0;
        for (int i=0; i<cadena.length(); ++i) {
            switch (cadena.charAt(i)) {
                case 'a':
                case 'A':
                    contador++;
                    break;
                case 'e':
                case 'E':
                    contador++;
                    break;
                case 'i':
                case 'I':
                    contador++;
                    break;
                case 'o':
                case 'O':
                    contador++;
                    break;
                case 'u':
                case 'U':
                    contador++;
             }
        }
        return contador;
    }

}




