public class Persona {
    private String nombre;
    private String apellido;
    private String domicilio;
    private int edad;
    private int telefono;
    private String correo;

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getDomicilio() {
        return this.domicilio;
    }

    public int getEdad() {
        return this.edad;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
