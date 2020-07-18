package com.qamindslab;

public class Asistente extends Persona {
    private int id;

    public Asistente(int id, String nombreCompleto, int edad, String telefono, String correo, String domicilio){
        super(nombreCompleto, edad, telefono, correo, domicilio);
        this.id = id;
    }

    public boolean setId(int id){
        if (id <= 0 )
            return false;
        this.id = id;
        return true;
    }

    public int getId(){
        return this.id;
    }

    public String toString(){
//        return "ID: "+id+" , "+getNombreCompleto()+" , "+getEdad()+" , "+getTelefono()+" , "+getCorreo()+" , "+getDomicilio();
        return "Asistente: ID "+getId()+" , "+getNombreCompleto()+" , "+getEdad()+" , "+getTelefono()+" , "+getCorreo()+" , "+getDomicilio();
    }

}
