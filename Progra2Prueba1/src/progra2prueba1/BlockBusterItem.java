/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra2prueba1;

import java.util.Calendar;
public abstract class BlockBusterItem { 
     int codigo;
    String nombre;
    static double precio;
    String tipo;
    Calendar fechaDeAdicion;

    public BlockBusterItem(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    
     public String toString(){
        return "Codigo: "+codigo+" , Nombre: "+nombre+"Precio: "+precio;
    }
    
    public abstract double pagoRenta(int dias);
}    
