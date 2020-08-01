package src.Conferencia;

public class Persona {

    String nombre;           //Se crea la clase y se definen los atributos de la clase
    public String apellido1;
    public String apellido2;
    public int edad;
    public String correo;
    public String domicilio;

    public Persona(String nombre, String apellido1, String apellido2, int edad,  String correo, String domicilio) {  //Se aplican los constructores de la clase Persona
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.correo = correo;
        this.domicilio = domicilio;
    }
}