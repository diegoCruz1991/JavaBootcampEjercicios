// encontrar numero de veces que se repite una cadena dentro de otra

public class Ejercicio1_String {
  public static void main(String[] args) {
    Ejercicio1_String str =new Ejercicio1_String();
    int repeticiones = str.numeroDePalabras("ashhhhashhhhhbbbbasnnnnas", "as");
    System.out.println(repeticiones);
  }

  public int numeroDePalabras(String cadena, String palabra){
    int cont = 0;
    int index = cadena.indexOf(palabra);
    while (index >= 0) {
        cont++;
        cadena = cadena.substring(index + palabra.length());
        index = cadena.indexOf(palabra);
    }
    return cont;
  }
}
