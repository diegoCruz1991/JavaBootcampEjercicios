package src.Conferencia;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Asistente extends src.Conferencia.Persona {   //Se crea la clase Asistente que hereda los atributos de la clase Persona

    public int ID;

    public Asistente(String nombre, String apellido1, String apellido2, int edad, String correo, String domicilio) {  //Se inicia la clase asistente con sus atributos
        super(nombre, apellido1, apellido2, edad, correo, domicilio);
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.correo = correo;
        this.domicilio = domicilio;
        this.ID = ID;
        
    }
}
