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
        
   public void agregarItem(int codigo, String nombre, double p,String tipoItem){
       for(BlockBusterItem search : items){
        if(tipoItem.equals("GAME")){   
            if(codigo!=search.codigo&&!tipoItem.equals(search.tipo)){
                items.add(new VideoGameItem(codigo,nombre,p,tipoItem));
            }
           }else if(tipoItem.equals("MOVIE")){
               items.add(new MovieItem(codigo,nombre,p,tipoItem));
           }
       }
   }

}
