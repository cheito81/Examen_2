
package banco;
/**
* Esta clase te permite llevar la cuenta corriente de una persona y poder mostrar informacion retirar dinero yt aumentar.
 * @author Jose Gimenez
 * @version 1.0 2017-11-21
 */ 

public class cuentaCorriente {

    private double saldo;
    public String nombre;
    String dni;  
    private double limite;   
    private double interes;
    Banco banco;
    
    
    
    
    public cuentaCorriente(String nombre, String dni, Banco banco, double interes) {
        
        saldo = 0;
        limite = -50;
        this.nombre = nombre;
        this.dni = dni;
        this.banco = banco;
        this.interes = interes;
        
     }
    
      /**
       * retira dinero de la cuenta
       * @param cant cantidad para retirar 
       * @return dinero false si no se puede retirar,de lo contrario true
       */  
    public boolean retirar(double cant) {
        boolean dinero= false;
        
        double aux=0;
        aux = saldo - cant ;
       
        if (aux>=limite) {
            this.saldo = this.saldo - cant;
            dinero = true;
        }
        return dinero;
      
    }
    
     
    /**
     * aumenta al saldo la cantidad ingresado por el paratametro
     * @param cant cantidad deseada para aumenta al saldo
     */
    public void ingreso(double cant){
        //TODO code application logic here
       this.saldo = this.saldo + cant;
    }
    
    /**
     * Mostra la quantitat l' interès en TASA ANUAL EQUIVALENT
     * @return result quantitat l' interès en TASA ANUAL EQUIVALENT
     */
   public double interesTAE() {        
       //TODO code application logic here
       double result = 0;
       result = (this.saldo*this.interes)/100;
       
       return result;
    }
    
    /**
     * cambia el la direccion de banco
     * @param banco direccion del banco a cambiar.
     */
  public  void cambiarBanco(Banco banco){
        this.banco = banco;        
    }
    
    /**
     * muestra la informacion de la cuenta corriente
     */
   public void mostrarInformacion() {
        
       //TODO code application logic here
        System.out.println("saldo= " + saldo + ", nombre=" + nombre + ", dni=" + dni + ", limite=" + limite + ", interes=" + interes + ", banco=" + banco);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

 
    
    
    
 
    
}
