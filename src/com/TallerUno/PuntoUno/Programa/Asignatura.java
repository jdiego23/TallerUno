package com.TallerUno.PuntoUno.Programa;

public class Asignatura
{
    private String nombre;
    private int numeroCreditos;
    private Estudiante estudiantes;
    private Docente docente;

    public Asignatura(String nombre, int numeroCreditos, Docente docente)
    {
        this.nombre = nombre;
        this.numeroCreditos = numeroCreditos;
        this.docente = docente;
    }

    public String getNombre()
    {
        return nombre;
    }

    public int getNumeroCreditos()
    {
        return numeroCreditos;
    }

    public Estudiante getEstudiantes()
    {
        return estudiantes;
    }

    public Docente getDocente()
    {
        return docente;
    }

    public void setEstudiantes(Estudiante estudiantes)
    {
        this.estudiantes = estudiantes;
    }

    public void setDocente(Docente docente)
    {
        this.docente = docente;
    }
}
