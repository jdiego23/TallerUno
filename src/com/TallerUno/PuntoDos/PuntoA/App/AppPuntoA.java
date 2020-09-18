package com.TallerUno.PuntoDos.PuntoA.App;

import com.TallerUno.PuntoDos.PuntoA.Programa.MaquinaDispensadora;
import com.TallerUno.PuntoDos.PuntoA.Programa.Producto;

import java.util.Arrays;

public class AppPuntoA
{
    public static void main(String[] args)
    {
        MaquinaDispensadora nutresa = new MaquinaDispensadora("123450","Mendoza","Blanco","1 metro");

        Producto doritos = new Producto("Doritos","do1",8,1.200);
        Producto malta = new Producto("Malta","ma2",8,1.000);
        Producto chocolatina = new Producto("Chocolatina","ch3",8,5.00);
        Producto chicles = new Producto("Trident","ch4",8,300);
        Producto jumbo = new Producto("Jumbo","ju5",8,1.700);
        Producto gomitas = new Producto("Trululo","go6",8,8.00);
        Producto galletas = new Producto("Festival","ga7",8,8.00);
        Producto boloquesos = new Producto("Boliqueso","bo8",0,1.000);
        Producto hit = new Producto("Hit de Mango","hi9",8,1.000);
        Producto chocorramo = new Producto("Chocorramo","cho10",8,2.000);

        nutresa.getlProducto().addAll(Arrays.asList(doritos,malta,chocolatina,chicles,jumbo,gomitas,galletas,boloquesos,hit,chocorramo));
        nutresa.dispensadar(hit.getCodigo());
        nutresa.consultarAgotados();
        nutresa.consultarUnidades(chocolatina.getCodigo());
        nutresa.consultarProductos(nutresa.getlProducto());
        nutresa.aumentarCantidad(boloquesos.getCodigo(), (byte) 4);
    }
}
