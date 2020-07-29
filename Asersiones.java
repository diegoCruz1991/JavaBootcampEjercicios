import java.util.*;

public class Aserciones {

    public static void main(String... args){
        String cadena = "Anita lava la tina";

        List<String> mitades = cortarCadena(cadena);
        for(String mitad: mitades){
            System.out.println("Esta es una mitad: " + mitad);
        }
        System.out.println("reversa de cadena: " + Espejo(cadena));
        System.out.println("cadena sin espacios: " + cadena.replace(" ",""));
        System.out.println("Contiene: " + CuentaVocales(cadena) + " vocales");

        AssertionsReversa(cadena);
        AssertionsEspacios(cadena);
        AssertionsCuentaVocales(cadena);
    }

    public static List cortarCadena(String cadena){
        List<String> arregloMitad = new ArrayList<>();
        int indice = cadena.length()/2;
        arregloMitad.add(cadena.substring(0, indice));
        arregloMitad.add(cadena.substring(indice));
        return arregloMitad;
    }

    public static String Espejo(String cadena){
        int longitud = cadena.length();
        String espejo = "";
        longitud = longitud-1;
        for(int i = longitud; i>=0; i--){
            espejo = espejo + cadena.charAt(i);
        }
        return espejo;
    }

    public static String RemoverEspacios(String cadena){
        return cadena.replace(" ","");
    }

    public static int CuentaVocales(String cadena){
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

    public static void AssertionsReversa(String cadena){
        try {
            assert Espejo("Hormiga").equals("agimroH");
            System.out.println("Reverse esta Funcionando");
        }
        catch (AssertionError ae){
            System.out.println("Reverse no esta funcionando");
        }
    }
    public static void AssertionsEspacios(String cadena){
        try {
            assert RemoverEspacios("H o r m i g a").equals("Hormiga");
            System.out.println("Remover espacios esta funcionando");
        }
        catch (AssertionError ae){
            System.out.println("Remover espacios no esta funcionando");
        }
    }
    public static void AssertionsCuentaVocales(String cadena){
        try {
            assert CuentaVocales("Aeroespacial")==7;
            System.out.println("Cuenta Vocales esta funcionando");
        }
        catch (AssertionError ae){
            System.out.println("Cuenta Vocales no esta funcionando");
        }
    }}
    }
}