package com.TallerUno.PuntoUno.Programa;

public class Docente
{
    private String identificacion;
    private String nombre;
    private int edad;

    public Docente(String identificacion, String nombre, int edad)
    {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getIdentificacion()
    {
        return identificacion;
    }

    public String getNombre()
    {
        return nombre;
    }

    public int getEdad()
    {
        return edad;
    }
}
