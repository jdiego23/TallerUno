package com.TallerUno.PuntoDos.PuntoB.App;

import com.TallerUno.PuntoDos.PuntoB.Programa.Corredor;
import com.TallerUno.PuntoDos.PuntoB.Programa.Equipo;
import com.TallerUno.PuntoDos.PuntoB.Programa.Etapa;

import java.util.Arrays;

public class AppPuntoB
{
    public static void main(String[] args)
    {
        Equipo equipo = new Equipo("Postobon","Colombia");
        Etapa etapa1 = new Etapa((byte) 1, "Paris", 40);

        Corredor corredor1 = new Corredor("Juan Diego", (byte) 22, (byte) 10 );
        Corredor corredor2 = new Corredor("Aleja", (byte) 25, (byte) 7 );
        Corredor corredor3 = new Corredor("Yuber", (byte) 28, (byte) 9 );
        Corredor corredor4 = new Corredor("Esteban", (byte) 21, (byte) 35 );

        equipo.getCorredor().addAll(Arrays.asList(corredor1,corredor2,corredor3,corredor4));

        equipo.ordenarEquipo(equipo.getCorredor());

        etapa1.mostrarResultados(equipo.getCorredor());

}
