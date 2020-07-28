package ejercicios;

import java.util.*;

public class tarea27Julio {

    public static void main(String... args){
        String cadena = "Eder Adrian Montano Ramos";

        List<String> mitades = AMitad(cadena);
        for(String mitad: mitades){
            System.out.println("Esta es una mitad: " + mitad);
        }
        System.out.println("Esta es la cadena en reversa: " + Espejo(cadena));
        System.out.println("Esta es la cadena sin espacios: " + RemoverEspacios(cadena));
        System.out.println("Contiene: " + CuentaVocales(cadena) + " vocales");
        AssertionsReverse(cadena);
        AssertionsSinEspacios(cadena);
        AssertionsCuentaVocales(cadena);
        NegativeAssertionsReverse(cadena);
        NegativeAssertionsSinEspacios(cadena);
        NegativeAssertionsCuentaVocales(cadena);
    }

    static List AMitad(String cadena){
        int longitud = cadena.length();
        List<String> arregloMitad = new ArrayList<>();
        int indice = longitud/2;
        arregloMitad.add(cadena.substring(0, indice));
        arregloMitad.add(cadena.substring(indice));
        return arregloMitad;
    }

    static String Espejo(String cadena){
        int longitud = cadena.length();
        String espejo = "";
        longitud = longitud-1;
        for(int i = longitud; i>=0; i--){
            espejo = espejo + cadena.charAt(i);
        }
        return espejo;
    }

    static String RemoverEspacios(String cadena){
        return cadena.replace(" ","");
    }

    static int CuentaVocales(String cadena){
        int longitud = cadena.length();
        int numVocales=0;
        Character caracter;
        for(int i = 0; i<longitud; i++){
           caracter = cadena.charAt(i);
           if(caracter.equals('a')||caracter.equals('e')||caracter.equals('i')||caracter.equals('o')||caracter.equals('u')){
               numVocales++;
           }
           if(caracter.equals('A')||caracter.equals('E')||caracter.equals('I')||caracter.equals('O')||caracter.equals('U')){
                numVocales++;
           }
        }
        return numVocales;
    }

    static void AssertionsReverse(String cadena){
        try {
            assert Espejo("Hormiga").equals("agimroH");
            System.out.println("Reverse esta Funcionando");
        }
        catch (AssertionError ae){
            System.out.println("Reverse no esta funcionando");
        }
    }
    static void AssertionsSinEspacios(String cadena){
        try {
            assert RemoverEspacios("H o r m i g a").equals("Hormiga");
            System.out.println("Remover espacios esta funcionando");
        }
        catch (AssertionError ae){
            System.out.println("Remover espacios no esta funcionando");
        }
    }
    static void AssertionsCuentaVocales(String cadena){
        try {
            assert CuentaVocales("Aeroespacial")==7;
            System.out.println("Cuenta Vocales esta funcionando");
        }
        catch (AssertionError ae){
            System.out.println("Cuenta Vocales no esta funcionando");
        }
    }
    static void NegativeAssertionsReverse(String cadena){
        try {
            assert Espejo("Hormiga").equals("agimro");
            System.out.println("Reverse esta Funcionando");
        }
        catch (AssertionError ae){
            System.out.println("Reverse no esta funcionando");
        }
    }
    static void NegativeAssertionsSinEspacios(String cadena){
        try {
            assert RemoverEspacios("H o r m i g a").equals("Hormig a");
            System.out.println("Remover espacios esta funcionando");
        }
        catch (AssertionError ae){
            System.out.println("Remover espacios no esta funcionando");
        }
    }
    static void NegativeAssertionsCuentaVocales(String cadena){
        try {
            assert CuentaVocales("Casa")==1;
            System.out.println("Cuenta Vocales esta funcionando");
        }
        catch (AssertionError ae){
            System.out.println("Cuenta Vocales no esta funcionando");
        }
    }
}
