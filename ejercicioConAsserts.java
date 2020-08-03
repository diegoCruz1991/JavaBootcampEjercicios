package ejercicios;
import java.util.*;

public class ejercicioConAsserts {
    public static void main (String args[]) {

        //Declaramos e instaciamos el objeto dosCadenams
        operacionesCadenas Cadenas = new operacionesCadenas();

        //El metodos cadenas del objeto dosCdenas divide la cadena en 2 y los combierte en atributos
        Cadenas.divCadenas("HolaHolaHolaHolaHolaHola");
        System.out.println(Cadenas.cad1);
        System.out.println(Cadenas.cad2);
        //assert para validar la cadena dividida en 2
        assert Cadenas.cad1.equals("HolaHolaHola") : "La cadena no es la esperada";

        System.out .println(Cadenas.reverseCadena("hola"));
        //assert para validar la cadena invertida
        assert Cadenas.reverseCadena("Hola").equals("aloH"): "La cadena para poner en reverse no es la esperada";

        System.out.println(Cadenas.quitarEspacios("H o l a 1 2 3 4"));
        //assert para validar la cadena sin espacios
        assert Cadenas.quitarEspacios("H o l a 1 2 3 4").equals("Hola1234"): "La cadena sin espacios no es la esperada";

        System.out.println(Cadenas.contarVocales("hola"));
        //assert para validar el numero de vocales en una cadena
        assert Cadenas.contarVocales("hola") == 3: "La cadena no tiene el numero de vocales esperado";
    }
}

class operacionesCadenas {

    //atrbutos qye almacenaràn la cadena de entrada partida en 2
    public String cad1 = "";
    public String cad2 = "";

    //Método que pate la cadena en 2 y la almacena en los atributos de esta misma clase
    public void divCadenas (String cadEntrada) {
        // //variable que almacenara el entero de dividir el tamaño de la cadena entre 2
        int cadLenght = cadEntrada.length(); //
        int halfIndex = cadLenght / 2;

            this.cad1 = cadEntrada.substring(0, halfIndex);
            this.cad2 = cadEntrada.substring(halfIndex, cadLenght);
    }

    public String reverseCadena(String a) {
        //utilisaremos la clase Stringbuilder ya que cuenta con el metodo reverse, el cual invierte la cadena
        StringBuilder cadenarev = new StringBuilder(a);
        return cadenarev.reverse().toString();
    }

    public String quitarEspacios(String a) {
        return a.replace(" ", "");
    }

    public int contarVocales(String a) {
        int contador = 0;
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
                contador++;
            }
        }
        return contador;
    }
}


