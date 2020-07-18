package com.qamindslab;

import java.lang.String;
import java.util.ArrayList;
import java.util.List;

public class Conferencia {

            /* Ejercicio - Valdra 20 puntos extras - Sobre Calificacion final
            Ingreso a la conferencia
            - Van a manejar las personas que van llegando a una conferencia.
                - Esas personas se tienen que formar antes de registrarse.
                - Su programa tiene que registrar a las personas como van llegando
                - El programa va a registrar en una estructura de datos de facil acceso, y estara indexada por un ID
                - Los datos que se can a pedir son los siguientes:
                    - Nombre completo
                    - Edad
                    - telefono
                    - Correo
                    - Domicilio
                    Extra: Si los datos los ingresan desde consola - 5 puntos mas
                    Basico: Van a tener una cola predefinida con los datos de las personas
            Nota: Limite de 50 personas, por la sana distancia

            Durante la conferencia
            - Van a llamar a las persona con el ID que sea multiplo de 5 y las van a agrupar en un otra lista de persona
                aparte.
            - Van a llamar a las persona con edad menor a 25 años y las van agrupar en una lista aparte
            - La personas que se encuentren en ambas listas, van a ganar un premio.


            Pistas:
            Usar un Queue para la fila de asistentes
            Usar un mapa para el registro
            Recomendacion: Hacer una clase Persona y una clase asistente que herede de Persona
            Recomendacion: Separar clases en diferentes archivos
         */

    public static void main(String[] args) {
        List<Asistente> listaGanadores = new ArrayList<>();

        Registro r = new Registro();

        r.personasFormadasEnCola();
        r.registroDePersonas();
        r.personasLLegando();
        listaGanadores = r.personasGanadorasPremio();

        if (listaGanadores.size() == 0) {
            System.out.println("!!!!  Ninguno de los asistentes cumplieron con los requisitos. !!!!");
        }
        else {
            System.out.println("Las siguientes personas son las ganadoras de un PREMIO.");
            for (Asistente a : listaGanadores) {
                System.out.println(a.toString());
            }
        }
     }
}
