/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra2prueba1;

/**
 *
 * @author Josue Gavidia
 */
public class VideoGameItem extends BlockBusterItem {
    public double renta;
    public static final String consola1="PLAYSTATION";
    public static final String consola2="XBOX";
    public static final String consola3="WII";
    public String tipo;

    public VideoGameItem(int codigo, String nombre, double precio, String type) {
        super(codigo, nombre, precio, type);
        renta = 30;
        tipo = type;
    }
    @Override
    public String toString(){
        return super.toString()+" Game";
    }
    
    public double pagoRenta(int dias){
        return super.precio*dias;
}  
}
