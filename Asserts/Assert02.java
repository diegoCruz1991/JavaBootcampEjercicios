
public class Assert02 {

    public static void main(String...args){
        String[] arreglo = cadenaDividida("paraperoo");
        assert arreglo[0].equals("Eduardo"): "Primer valor de cadena dividida no es igual a la esperada";
        assert arreglo[1].equals("Avila"): "Segundo valor de cadena dividida no es igual a la esperada";
        assert cadenaReverse("Hola").equals("aloH"): "La cadena en Reversa no es igual a la esperada";
        assert cadenaReverse("Kia").equals("aik"): "La cadena en Reversa no es igual a la esperada";
        assert cadenaSinEspacios(" H O    L A").equals("HOLA"): "La cadena sin Espacios no es igual a la esperada";
        assert cadenaTotalVocales("Escorpion") == 3: "El numero de vocales no es el esperado";
        assert cadenaTotalVocales("tarantula") == 5: "El numero de vocales no es el esperado";
    }

    public static String[] cadenaDividida(String cadena){
        int numeroCharacters = cadena.length();
        String[] cadenaNueva = new String[2];
        cadenaNueva[0]= cadena.substring(0, numeroCharacters/2);
        cadenaNueva[1]= cadena.substring(numeroCharacters/2, numeroCharacters);
        return cadenaNueva;
    }

    public static String cadenaReverse(String cadena){
        String cadenaNueva = "";
        String valor = "";
        int x = 0;
        for(int i= cadena.length(); i>0; i--){
            x = i - 1;
            valor = Character.toString(cadena.charAt(x));
            cadenaNueva+= valor;
        }
        return cadenaNueva;
    }

    public static String cadenaSinEspacios(String cadena){
        String cadenaNueva = "";
        cadenaNueva = cadena.replace(" ", "");
        return cadenaNueva;

    }

    public static int cadenaTotalVocales(String cadena){
        int contador = 0;
        for(int i=0 ; i<cadena.length(); i++){
            if(cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u'){
                contador++;
            }
        }
        return contador;
    }
}


