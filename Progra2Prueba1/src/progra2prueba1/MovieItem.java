/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra2prueba1;

/**
 *
 * @author Josue Gavidia
 */
public class MovieItem extends BlockBusterItem{
   int codigo;
    String nombre;
    double precio;
    public String estado;
    public String tipo;

    public MovieItem(int codigo, String nombre, double precio) {
        super(codigo, nombre, precio);
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        estado = "ESTRENO";
    }
    
    
    
    
    
    @Override
    public String toString(){
        return super.toString()+" "+estado+" -Movie";
    }
    
    
    @Override
    public double pagoRenta(int dias){
        if(estado.equals("ESTRENO")&&dias>2){
            return 50*dias;
        }else if(estado.equals("NORMAL")&&dias>5){
            return 30*dias;
        }
            return 0;
    }
    
    public void verEstado(){
        
    }

}
