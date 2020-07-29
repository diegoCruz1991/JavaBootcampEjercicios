package ejercicios;

import java.util.Iterator;

public class TareaAsserts {
    public static void main(String[] args) throws InterruptedException {
        String cadena = "Once a king or queen of Narnia, always a king or queen of Narnia";
        cortarString(cadena);
        reverseString(cadena);
        eliminarEspacios(cadena);
        contarVocales(cadena);
    }

    public static void cortarString(String cadena){
        int mitad = cadena.length() / 2;
        String[] cadenas = {cadena.substring(0,mitad),cadena.substring(mitad)};
        System.out.println(cadenas[0]);
        System.out.println(cadenas[1]);
        assert cadenas[0].equals("Once a king or queen of Narnia, "): "La cadena 1 no coincide con lo esperado";
        assert cadenas[1].equals("always a king or queen of Narnia"): "La cadena 2 no coincide con lo esperado";
    }
    public static void reverseString(String cadena){
        StringBuilder reverso = new StringBuilder();
        reverso.append(cadena);
        reverso.reverse();
        System.out.println(reverso);
        assert  reverso.toString().equals("ainraN fo neeuq ro gnik a syawla ,ainraN fo neeuq ro gnik a ecnO"): "La cadena en reversa no coincide con lo esperado";
    }
    public static void eliminarEspacios(String cadena){
        cadena = cadena.replace(" ","");
        System.out.println(cadena);
        assert cadena.equals("OnceakingorqueenofNarnia,alwaysakingorqueenofNarnia"): "La cadena sin espacios no coincide con lo esperado";
    }
    public static void contarVocales(String cadena){
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u' ||
                cadena.charAt(i) == 'A' || cadena.charAt(i) == 'E' || cadena.charAt(i) == 'I' || cadena.charAt(i) == 'O' || cadena.charAt(i) == 'U') {
                contador++;
            }
        }
        System.out.println("El numero de vocales es: " + contador);
        assert contador == 24: "El numero de vocales no coincide";
    }

}
