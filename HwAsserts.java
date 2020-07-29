import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HwAsserts {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String cadena = "FelipeGarcia";
        System.out.println(splitCadena(cadena));
        System.out.println(reverseCadena(cadena));
        System.out.println(eliminarEspacios(cadena));
        System.out.println(cuantasVocales(cadena));

        assert splitCadena("FelipeGarcia").equals("Felipe"): "La cadena no es igual a la esperada";
        assert reverseCadena(" H O L A").equals("HOLA"): "La cadena no es igual a la esperada";
        assert eliminarEspacios(" H O L A").equals("HOLA"): "La cadena no es igual a la esperada";
        assert cuantasVocales("Hormiga") == 3: "El numero de vocales no es el esperado";
    }

    public static String splitCadena(String cadena) {
        int media = cadena.length()/2;
        String[] words = new String[2];

        words[0] = cadena.substring(0,media-1);
        words[1] = cadena.substring(media-1);

        return Arrays.toString(words);
    }

    public static String reverseCadena(String cadena) {
        StringBuilder cadena1 = new StringBuilder();
        cadena1.append(cadena);
        cadena1 = cadena1.reverse();
        return cadena1.toString();
    }

    public static String eliminarEspacios(String cadena) {
        cadena = cadena.replace(" ","");
        return cadena;
    }

    public static int cuantasVocales(String cadena) {
        char[] vocalsDic = {'a', 'e', 'i', 'o', 'u'};
        int vocals = 0;
        for(int i = 0; i < cadena.length(); i++) {
            for(int j = 0; j < vocalsDic.length; j++){
                if(cadena.charAt(i) == vocalsDic[j]) {
                    vocals++;
                }
            }
        }
        return vocals;
    }

}
