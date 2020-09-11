package com.TallerUno.PuntoUno.App;

import com.TallerUno.PuntoUno.Programa.Asignatura;
import com.TallerUno.PuntoUno.Programa.Docente;
import com.TallerUno.PuntoUno.Programa.Estudiante;
import com.TallerUno.PuntoUno.Programa.Nota;

public class AppAsignatura
{
    public static void main(String[] args)
    {
        double definitivaS, definitivaT;
        Docente alejandro = new Docente("54484458", "Alejandro", 35);
        Asignatura POO = new Asignatura("Programación Orientada A Objetos", 4, alejandro);
        Nota notaEsteban = new Nota(5, 4.5, POO);
        Estudiante esteban = new Estudiante("1038418594", "Esteban", 4,'H', notaEsteban);

        notaEsteban.getNotasSeguimiento().add(4.5);
        notaEsteban.getNotasSeguimiento().add(3.8);
        notaEsteban.getNotasSeguimiento().add(2.9);
        notaEsteban.getNotasSeguimiento().add(4.1);

        definitivaS = notaEsteban.calcularSeguimiento(notaEsteban.getNotasSeguimiento());

        System.out.println("La nota de total del seguimiento es: " + definitivaS);

        definitivaT = notaEsteban.calcularDefinitiva(5,4,definitivaS);

        System.out.println("La nota de total definitiva es: " + definitivaT);
    }
}
