package src.Conferencia;

import java.util.*;

class Conferencia {
    public static void main(String... args) {

        Map<Integer, String> Registro = new HashMap<>();
        int contador = 0;

        List<String> ListaAsistentes = new ArrayList<>();

        ListaAsistentes.add("Rogelio Ramirez Zertuche");
        ListaAsistentes.add("Juan Pablo Gonzalez Ortega");
        ListaAsistentes.add("Pedro Leon Piñera Hernandez");
        ListaAsistentes.add("Angelica Robledo Lopez");
        ListaAsistentes.add("Anayansi Perez Luque");
        ListaAsistentes.add("Mariano Castro Reyes");

        List<Integer> EdadRegistro = new ArrayList<>();
        EdadRegistro.add(25);
        EdadRegistro.add(39);
        EdadRegistro.add(30);
        EdadRegistro.add(25);
        EdadRegistro.add(32);
        EdadRegistro.add(26);

        List<String> Mayor_de_25 = new ArrayList<>();

        int mayores = EdadRegistro.size();

        for (int i = 0; i < mayores; i++) {
            if (EdadRegistro.get(i) > 25) {
                Mayor_de_25.add(ListaAsistentes.get(i));
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println(Mayor_de_25.get(i));

        }

        int AsistenciaTotal = ListaAsistentes.size();

        for (int i = 0; i < AsistenciaTotal; i++) {
            Registro.put(i, ListaAsistentes.get(i));
            contador++;
        }
        System.out.println("------------------------------------------");
        List<String> MultiploCinco = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            if (i % 5 == 0 && i != 0) {
                MultiploCinco.add(ListaAsistentes.get(i));
            }
        }
        int mayorveinticinco = Mayor_de_25.size();
        int multiplodecinco = MultiploCinco.size();

        System.out.println("Aqui estan los ganadores... FELICIDADES Y GRACIAS POR ASISTIR... Los esperamos en la siguiente conferencia");
        for (int i = 0; i < mayorveinticinco; i++) {
            for (int x = 0; i < multiplodecinco; i++) {
                if (Mayor_de_25.get(i) == MultiploCinco.get(i)) {
                    System.out.println(MultiploCinco.get(i));
                }
            }
        }
    }
}