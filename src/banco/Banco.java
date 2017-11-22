
package banco;
/**
* Clase para informacion de un banco "direccion, nombre y capital"
 * @author Jose Gimenez
 * @version 1.0 2017-11-21
 */ 

public class Banco {
    
    final private String nombre;
    double capital = 5.2;
    String direccion ="Sin direccion";
    
   public Banco(String nombre) {
        this.nombre = nombre;
    }
    
   public Banco (String nombre, double capital, String direccion){
        
        this.nombre = nombre;
        this.capital = capital;
        this.direccion = direccion;
    }
    /**
     * muestra la informacion del banco
     */
   public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Capital: " + capital);
        System.out.println("Direccion: " + direccion);
        System.out.println("");        
    }
       
    
  
}  

