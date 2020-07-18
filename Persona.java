package com.qamindslab;

public class Persona {
    private String nombreCompleto;
    private int edad;
    private String telefono;
    private String correo;
    private String domicilio;

    public static final int LONG_MAXIMA_TEL = 10;

    public Persona(String nombreCompleto, int edad){
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
    }

    public Persona(String nombreCompleto, int edad, String telefono, String correo, String domicilio){
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.telefono = telefono;
        this.correo = correo;
        this.domicilio = domicilio;
    }

    public void setNombreCompleto(String nombreCompleto){
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreCompleto(){
        return this.nombreCompleto;
    }

    public boolean setEdad(int edad){
        if (edad < 0 || edad> 100)
            return false;
        this.edad = edad;
        return true;
    }

    public int getEdad(){
        return this.edad;
    }

    public boolean setTelefono(String telefono){
        if (telefono.length() > LONG_MAXIMA_TEL)
            return false;
        this.telefono = telefono;
        return true;
    }

    public String getTelefono(){
        return this.telefono;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public String getCorreo(){
        return this.correo;
    }

    public void setDomicilio(String domicilio){
        this.domicilio = domicilio;
    }

    public String getDomicilio(){
        return this.domicilio;
    }

    public String toString(){
        return "Persona: "+nombreCompleto+" , "+edad+" , "+telefono+" , "+correo+" , "+domicilio;
    }
}
