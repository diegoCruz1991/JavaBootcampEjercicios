import java.time.temporal.Temporal;

public class Strings {

    public static void main (String... args) {

        Strings strings = new Strings();

        Empleado empleado1 = obtenerEmpleado(" Alan | Eli | Terrazas | Montoya ");
        Empleado empleado2 = obtenerEmpleado(" Dayana | Garcia | Rodriguez ");
        Empleado empleado3 = obtenerEmpleado(" Dayana | Garcia ");
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);

    }

    public static String borrarEspacios(String cadena) {
        cadena = cadena.replace(" ", "");
        return cadena;
    }

    public static int contarPipes(String cadena) {
        int totalPipes = 0;
        for(int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) == '|') {
             totalPipes ++;
            }
        }
        return totalPipes;
    }

    public static Empleado obtenerEmpleado(String registro) {
        String cadenaLimpia = borrarEspacios(registro);
        String temporal = ""; // Cadena para ir almacenando cada uno de los nombres del registro.
        int pipesContador = 0; // Contador para los pipes que aparecen en el registro.
        Empleado empleado = new Empleado(); //Inicializar el objeto Empleado y se asigna a una variable de referencia llamada empleado.

        if(contarPipes(cadenaLimpia) == 2) { // Use el metodo contarPipes para saber si el registro es de 1 nombre o 2.
            cadenaLimpia = cadenaLimpia + "|";  // Agregue un pipe extra para poder leer el ultimo apellido.
            for(int i = 0; i < cadenaLimpia.length(); i++) {
                if(cadenaLimpia.charAt(i) == '|') {
                    pipesContador++;
                    temporal = temporal.replace("|", "");
                    switch (pipesContador) {
                        case 1:
                            empleado.nombre = temporal;
                            break;
                        case 2:
                            empleado.primerApellido = temporal;
                            break;
                        case 3:
                            empleado.segundoApellido = temporal;
                            break;
                    }
                    temporal = "";
                }
                temporal += cadenaLimpia.charAt(i);
            }
        }
        else {
            cadenaLimpia = cadenaLimpia + "|";
            for(int i = 0; i < cadenaLimpia.length(); i++) {
                if(cadenaLimpia.charAt(i) == '|') {
                    pipesContador++;
                    temporal = temporal.replace("|", "");
                    switch (pipesContador) {
                        case 1:
                            empleado.nombre = temporal;
                            break;
                        case 2:
                            empleado.segundoNombre = temporal;
                            break;
                        case 3:
                            empleado.primerApellido = temporal;
                            break;
                        case 4:
                            empleado.segundoApellido = temporal;
                            break;
                    }
                    temporal = "";
                }
                temporal += cadenaLimpia.charAt(i);
            }
        }
        return empleado;
    }
}

class Empleado {
    public String nombre;
    public String segundoNombre;
    public String primerApellido;
    public String segundoApellido;

    @Override // Esto sirve para sobreescribir el hashcode del Objeto y que entregue algo impreso y no el ID.
    public String toString() {
        if(primerApellido == null || segundoApellido == null) {
            return "El nombre del registro es invalido, se requieren los dos apellidos.";
        } else
        if(segundoNombre == null) {
            return "Nombre Completo: " + this.nombre + " " + this.primerApellido + " " + this.segundoApellido;
        } else {
            return "Nombre Completo: " + this.nombre + " " + this.segundoNombre + " " + this.primerApellido + " " + this.segundoApellido;
        }
    }

    @Override
    public boolean equals(Object anObject) {
        if(this == anObject) { // This es el objeto que llama el metodo, o sea si mismo, o sea basado en el ejemplo, empleado1.
            return true;
        }
        if(anObject instanceof Empleado) {
            Empleado otroEmpleado = (Empleado)anObject;
            return this.toString().equals(otroEmpleado.toString());
        }
        return false;
    }
}

// Tarea si alguien no tiene segundo nombre, mejorar el codigo.
// Arreglar el codigo porque sale null para el ultimo apellido.
// Agregar un nuevo pipe maybe. ??
// Estandar, 2 apellidos a fuerzas, pero puede ser 1 solo nombre o 2 nombres.
// IDEA: Primero hacer una verificacion de cuantos pipes hay en total para saber si tiene 1 o 2 nombres.
// Tendria que cambiarse lo de switch ???.


