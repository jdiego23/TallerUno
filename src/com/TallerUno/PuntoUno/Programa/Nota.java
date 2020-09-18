package com.TallerUno.PuntoUno.Programa;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Nota
{
    private double notaParcial;
    private double notaFinal;
    private ArrayList <Double> notasSeguimiento;
    private Asignatura materia;

    public Nota(double notaparcial, double notaFinal, Asignatura materia)
    {
        this.notaParcial = notaparcial;
        this.notaFinal = notaFinal;
        notasSeguimiento = new ArrayList<Double>();
        this.materia = materia;
    }

    public ArrayList<Double> getNotasSeguimiento()
    {
        return notasSeguimiento;
    }

    public void setNotasSeguimiento(ArrayList<Double> notasSeguimiento)
    {
        this.notasSeguimiento = notasSeguimiento;
    }

    public double getNotaparcial()
    {
        return notaParcial;
    }

    public double getNotaFinal()
    {
        return notaFinal;
    }

    public Asignatura getMateria()
    {
        return materia;
    }

    public double calcularSeguimiento(List <Double> notasSeguimiento)
    {
        int tamaño = notasSeguimiento.size();
        double NotaSeguimiento = 0;

        for (int i = 0; i < tamaño; i++)
        {
            NotaSeguimiento = NotaSeguimiento + notasSeguimiento.get(i);
        }

        NotaSeguimiento = NotaSeguimiento/tamaño;

        return NotaSeguimiento;
    }

    public double calcularDefinitiva(double notaParcial, double notaFinal, double NotaSeguimiento)
    {
        double Definitiva = 0;

        Definitiva = (notaParcial + notaFinal)/2;

        Definitiva = Definitiva*0.6;

        NotaSeguimiento = NotaSeguimiento*0.4;

        Definitiva = Definitiva + NotaSeguimiento;

        return Definitiva;
    }


}
