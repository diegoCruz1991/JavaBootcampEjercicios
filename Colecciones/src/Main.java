import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        boolean salir = false;
        String opcionSeleccionada;
        Scanner in = new Scanner(System.in);
        Conferencia conf= new Conferencia();

        do {
            System.out.println("\n\n|-----| Welcome to conference |-----|");
            System.out.println("\tSelecciona el número de la opción deseada");
            System.out.println("\ta) Formarse");
            System.out.println("\tb) Registrar asistente");
            System.out.println("\tc) Iniciar conferencia");
            System.out.println("\tx) Salir");

            opcionSeleccionada = in.nextLine();

            switch (opcionSeleccionada.toLowerCase()) {
                case "a":
                    //create a persona, add it to the queue
                    System.out.println("A la cola dijo lola ");
                    conf.formarPersona();
                    break;
                case "b":
                    //add attendant to hashmap
                    if (conf.estaLleno()){
                        System.out.println("oops ya está lleno sorry not sorry");
                    } else {
                        System.out.println("bienvenido pase usted, después de usted ");
                        conf.registrarAsistente();
                    }
                    break;
                case "c":
                    //initiate conference
                    if (conf.vinoGente()) {
                        System.out.println("Aquí vamos! qué ganarán los asistentes? ganarán cosas? averigüémoslo");
                        conf.encontrarIds(5);
                        in.nextLine();
                        conf.encontrarMenores(25);
                        in.nextLine();
                        conf.encontrarGanadores();
                    } else {
                        System.out.println("No vino nadie :C");
                    }
                    in.nextLine();
                case "x":
                    salir = true;
                    System.out.println("bais ¯\\_(ツ)_/¯  ");
                    break;
                default:
                    System.out.println("esa opción no existe que te pasa calabaza, pls try again");
                    break;
            }

        } while (!salir);
    }

}
