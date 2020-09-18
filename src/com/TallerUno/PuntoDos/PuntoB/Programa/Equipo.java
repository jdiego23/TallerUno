package com.TallerUno.PuntoDos.PuntoB.Programa;

import java.lang.reflect.Array;
import java.util.*;

public class Equipo
{
    private ArrayList<Corredor> corredor;
    private String nombre;
    private String pais;

    public Equipo(String nombre, String pais)
    {
        this.nombre = nombre;
        this.pais = pais;
        corredor = new ArrayList<>();
    }

    public ArrayList<Corredor> getCorredor()
    {
        return corredor;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getPais()
    {
        return pais;
    }

    public void ordenarEquipo(ArrayList<Corredor> corredor)
    {
        Collections.sort(corredor, new Comparator<Corredor>()
        {
            @Override
            public int compare(Corredor o1, Corredor o2)
            {
                return new Integer(o1.getEdad()).compareTo(new Integer(o2.getEdad()));
            }
        });

        corredor.forEach(ordenar ->
        {
            System.out.println("El Corredor "+ ordenar.getNombre() + " tiene " + ordenar.getEdad() + " años, con numero " + ordenar.getNumero());
        });
    }


}
