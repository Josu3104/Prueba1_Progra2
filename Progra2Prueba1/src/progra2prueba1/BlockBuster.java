/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra2prueba1;

/**
 *
 * @author Josue Gavidia
 */
import java.util.ArrayList;
public class BlockBuster {
    ArrayList<BlockBusterItem> items;
    
    public BlockBuster(){
        items = new ArrayList<BlockBusterItem>();
    }
    
    public BlockBusterItem buscarItem(int codigo,String tipo){
        for(BlockBusterItem search : items){
            if(codigo==search.codigo&&tipo.equals(search.tipo)){
                return search;
            }
        }
        return null;
    }
    
    public boolean agregarItem(int codigo, String nombre,String item){
        
        if(buscarItem(codigo,item)==null){
            if(item.equalsIgnoreCase("GAME")){   
                items.add(new VideoGameItem(codigo,nombre,BlockBusterItem.precio));
                System.out.println("game");
                return true;
           }else if(item.equalsIgnoreCase("MOVIE")){
               items.add(new MovieItem(codigo,nombre,BlockBusterItem.precio));
               System.out.println("movie");
               return true;
           }
        }
        return false;
    }
        
   static String rentaNombre="";
   static String rentaCodigo="";
   static String rentaTipo="";
   static String rentaFecha="";
   static String rentaPago="";
   static String imprimir=rentaNombre+"\n"+rentaCodigo+"\n"+rentaTipo+"\n"+rentaPago;
   public boolean rentar(int codigo, String tipoItem, int dias){
       if(buscarItem(codigo,tipoItem)!=null){
           rentaNombre= buscarItem(codigo,tipoItem).nombre;
           rentaCodigo= buscarItem(codigo,tipoItem).codigo+"";
           rentaTipo=buscarItem(codigo,tipoItem).tipo;
           rentaPago=String.valueOf(buscarItem(codigo,tipoItem).pagoRenta(dias));
           return true;
       }
       return false;
   }
   

   
}
