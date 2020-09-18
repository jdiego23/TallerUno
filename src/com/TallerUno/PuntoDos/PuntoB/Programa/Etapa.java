package com.TallerUno.PuntoDos.PuntoB.Programa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Etapa
{
    private ArrayList<Equipo> equipo;
    private byte numeroEtapa;
    private String lugar;
    private double distancia;

    public Etapa(byte numeroEtape, String lugar, double distancia)
    {
        this.numeroEtapa = numeroEtape;
        this.lugar = lugar;
        this.distancia = distancia;
        equipo = new ArrayList<Equipo>();
    }

    public ArrayList<Equipo> getEquipo()
    {
        return equipo;
    }

    public byte getNumeroEtapa()
    {
        return numeroEtapa;
    }

    public String getLugar()
    {
        return lugar;
    }

    public double getdistancia()
    {
        return distancia;
    }

    public void setNumeroEtapa(byte numeroEtapa)
    {
        this.numeroEtapa = numeroEtapa;
    }

    public void mostrarResultados(ArrayList<Equipo> corredor)
    {
        Collections.shuffle(corredor);

        corredor.forEach(ordenar ->
        {
            System.out.println("El Corredor " + ordenar.getNombre());
        });
    }
}
