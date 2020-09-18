package com.TallerUno.PuntoDos.PuntoA.Programa;

public class Producto
{
    private String nombre;
    private String codigo;
    private int unidadesProducto;
    private double precio;

    public Producto(String nombre, String codigo, int unidadesProducto, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.unidadesProducto = unidadesProducto;
        this.precio = precio;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getCodigo()
    {
        return codigo;
    }

    public int getUnidadesProducto()
    {
        return unidadesProducto;
    }

    public double getPrecio()
    {
        return precio;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    public void setUnidadesProducto(int unidadesProducto)
    {
        this.unidadesProducto = unidadesProducto;
    }
}
