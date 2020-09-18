package com.TallerUno.PuntoDos.PuntoB.Programa;

public class Corredor
{
    private String nombre;
    private int edad;
    private byte numero;

    public Corredor(String nombre, byte edad, byte numero)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.numero = numero;
    }

    public String getNombre()
    {
        return nombre;
    }

    public int getEdad()
    {
        return edad;
    }

    public byte getNumero()
    {
        return numero;
    }
}
