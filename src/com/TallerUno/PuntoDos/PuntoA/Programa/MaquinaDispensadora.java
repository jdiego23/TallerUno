package com.TallerUno.PuntoDos.PuntoA.Programa;

import java.util.ArrayList;

public class MaquinaDispensadora
{
    private String serial;
    private String marca;
    private String color;
    private String tamano;
    private ArrayList<Producto> lProducto;

    public MaquinaDispensadora(String serial, String marca, String color, String tamano)
    {
        this.serial = serial;
        this.marca = marca;
        this.color = color;
        this.tamano = tamano;
        lProducto = new ArrayList<>() ;

    }

    public String getSerial()
    {
        return serial;
    }

    public String getMarca()
    {
        return marca;
    }

    public String getColor()
    {
        return color;
    }

    public String getTamano()
    {
        return tamano;
    }

    public ArrayList<Producto> getlProducto()
    {
        return lProducto;
    }

    public void setlProducto(ArrayList<Producto> lProducto)
    {
        this.lProducto = lProducto;
    }

    public void dispensadar(String codigo)
    {
        int unidades ;
        for (int i= 0;i<lProducto.size(); i++)
        {
            if (codigo == lProducto.get(i).getCodigo())
            {
                if (lProducto.get(i).getUnidadesProducto() != 0)
                {
                    unidades = lProducto.get(i).getUnidadesProducto();
                    unidades = unidades -1;
                    lProducto.get(i).setUnidadesProducto(unidades);
                    System.out.println("Acabade sacar una unidad de " + lProducto.get(i).getNombre());
                    System.out.println(lProducto.get(i).getUnidadesProducto());
                } else {
                    System.out.println("No hay unidades disponibles");
                }
            }
        }
    }

    public void consultarAgotados()
    {
        lProducto.forEach(unidad->
        {
            if(unidad.getUnidadesProducto()==0)
            {
                System.out.println("El producto " + unidad.getNombre() + " esta agotado ");
            }

        });
    }

    public void consultarUnidades(String codigo)
    {
        lProducto.forEach(unidades->
        {
            if(codigo == unidades.getCodigo())
            {
                System.out.println("El producto " + unidades.getNombre() + " tiene:" + unidades.getUnidadesProducto() + " Unidades");
            }
        });
    }

    public void consultarProductos(ArrayList<Producto> lProducto)
    {
        lProducto.forEach(unidades ->
        {
            System.out.println("La cantidad del producto " + unidades.getNombre() + " es " + unidades.getUnidadesProducto());
        });
    }

    public void aumentarCantidad(String codigo, byte cantidadesAumentar)
    {
        int unidades ;
        for (int i= 0;i<lProducto.size(); i++)
        {
            if (codigo == lProducto.get(i).getCodigo())
            {
                if (lProducto.get(i).getUnidadesProducto() <= 8)
                {
                    unidades = lProducto.get(i).getUnidadesProducto();
                    unidades = unidades +cantidadesAumentar;
                    lProducto.get(i).setUnidadesProducto(unidades);
                    System.out.println("La cantidad final del producto " + lProducto.get(i).getNombre() + " es " + lProducto.get(i).getUnidadesProducto());
                }
                else{
                    System.out.println("La maquina dispensadora ha llegado a su capacidad maxima que es 8");
                }
            }
        }
    }
}
