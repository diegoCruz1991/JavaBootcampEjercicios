package com.company;

import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Metodos m1 = new Metodos();
    m1.CadenaUno();
    Metodos m2 = new Metodos();
    m2.CadenaDos();
    Metodos m3 = new Metodos();
    m3.metodoTres();
    Metodos m4 = new Metodos();
    m4.metodoCuatro();
    }
}

class Metodos{
    public void CadenaUno(){
        String c=  "Esto es una cadena de caracteres";
        String c2 = "Cadena diferente a la primera en cuanto elementos";
        System.out.println(c.substring(0,11));
        System.out.println(c.substring(12,32));
        //System.out.println(c.charAt(c.length()-1));

        assert c2.equals(40): "Los elementos de la cadena son menores a 40";
        //assert c.equals(c2): "Los elementos de la cadena uno y dos son iguales";

    }
    public void CadenaDos(){
        String s = "Cadena de Caracteres"; //  Se crea variable
        StringTokenizer frase = new StringTokenizer(s); // La clase StringTokenizer permite dividir una cadena en tokens (Un token es la secuencia maxima de caracteres consecutivos que no son delimitadores, por ejemplo | , etc.)

        Stack pila = new Stack(); // se crea el objeto pila

        while(frase.hasMoreTokens()){ // se itera por medio del objeto frase con el metodo hasMoreTokens, que permite conocer si se extrajeron todos los elementos
            pila.push(frase.nextToken()); //  Se extraen los elementos de frase con el metodo nextToken, se insertan los elementos en la pila con el metodo push
        }
        while (!pila.empty()){  // si la pila no esta vacia sigue iterando.
            System.out.print(pila.pop() + " "); // con el metodo pop se extrae cada elemento de la pila y se imprime

        }
    }

    public void metodoTres(){
        String cadena1 = "Esto es otra cadena con espacios";
        System.out.println(cadena1.replace(" ",""));
        /*String cadena2= "Esto es una cadena con espacios y \t tabulares y \n retornos de carro";
        System.out.println(cadena2.replaceAll("\\s", ""));*/
    }

    public void metodoCuatro(){
        String c = "Frase con vocabulario";
        int cont=0;
        for(int i= 0; i<c.length(); i++){
            if (c.charAt(i) == 'a' || c.charAt(i) == 'e' || c.charAt(i) == 'i' || c.charAt(i) == 'o' || c.charAt(i) == 'u'){
                cont++;
            }
        }
        System.out.println("La Oracion: " + " " + c + " " + "contiene " + " " + cont + " " + "vocales");
    }


}



