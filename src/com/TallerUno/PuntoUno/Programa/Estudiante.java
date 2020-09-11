package com.TallerUno.PuntoUno.Programa;

public class Estudiante
{
    private String identificacion;
    private String nombre;
    private int semestreActual;
    private char genero;
    private Nota nota;

    public Estudiante(String identificacion, String nombre, int semestreActual, char genero, Nota nota)
    {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.semestreActual = semestreActual;
        this.genero = genero;
        this.nota = nota;
    }

    public String getIdentificacion()
    {
        return identificacion;
    }

    public String getNombre()
    {
        return nombre;
    }

    public int getSemestreActual()
    {
        return semestreActual;
    }

    public char getGenero()
    {
        return genero;
    }

    public Nota getNota()
    {
        return nota;
    }

    public void setSemestreActual(int semestreActual)
    {
        this.semestreActual = semestreActual;
    }

    public void setNota(Nota nota)
    {
        this.nota = nota;
    }
}
