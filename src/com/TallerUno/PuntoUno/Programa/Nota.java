package com.TallerUno.PuntoUno.Programa;

import java.util.ArrayList;
import java.util.List;

public class Nota
{
    private double notaparcial;
    private double notaFinal;
    private List <Double> notasSeguimiento;
    private Asignatura materia;

    public Nota(double notaparcial, double notaFinal, Asignatura materia)
    {
        this.notaparcial = notaparcial;
        this.notaFinal = notaFinal;
        notasSeguimiento = new ArrayList<Double>();
        this.materia = materia;
    }

    public List<Double> getNotasSeguimiento()
    {
        return notasSeguimiento;
    }

    public void setNotasSeguimiento(List<Double> notasSeguimiento)
    {
        this.notasSeguimiento = notasSeguimiento;
    }

    public double getNotaparcial()
    {
        return notaparcial;
    }

    public double getNotaFinal()
    {
        return notaFinal;
    }

    public Asignatura getMateria()
    {
        return materia;
    }
}
