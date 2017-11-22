/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import banco.Banco;
import banco.cuentaCorriente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jose
 */
public class bancoTest {
    
    public bancoTest() {
    }
    
     @Test
    public void testRetirar() {
        
        cuentaCorriente c1,c2,c3;
        Banco b1,b2;
        
        //Instanciem 2 objectes Banc
        
        b1 = new Banco("Tokio Internacional Banc ");
        b2 = new Banco("BNC Internacional Banc",10.5,"C/llacuna, 10");
        
         //Instaciem varies comptes de corrent                
        
        c1 = new cuentaCorriente("Ana Pastor","24876987Y",b1,3);
        c1.ingreso(100000);
       
        
        boolean resultado = c1.retirar(5000);
        boolean esperado = true;
        
         assertEquals(resultado, esperado);
        
    }
    
    @Test
     public void testIngresar() {
        
        cuentaCorriente c1,c2,c3;
        Banco b1,b2;
        
        //Instanciem 2 objectes Banc
        
        b1 = new Banco("Tokio Internacional Banc ");
        b2 = new Banco("BNC Internacional Banc",10.5,"C/llacuna, 10");
        
         //Instaciem varies comptes de corrent                
        
        c1 = new cuentaCorriente("Ana Pastor","24876987Y",b1,3);
        c1.ingreso(100000);
       
        double resultado = c1.getSaldo();
        double esperado = 100000;
        
         assertEquals(resultado, esperado, 2);
        
    }
    
      @Test
     public void testInteresTAE() {
        
        cuentaCorriente c1,c2,c3;
        Banco b1,b2;
        
        //Instanciem 2 objectes Banc
        
        b1 = new Banco("Tokio Internacional Banc ");
        b2 = new Banco("BNC Internacional Banc",10.5,"C/llacuna, 10");
        
         //Instaciem varies comptes de corrent                
        
        c1 = new cuentaCorriente("Ana Pastor","24876987Y",b1,3);
        c1.ingreso(100000);
       
        double resultado = c1.interesTAE();
        double esperado = 3000.0;
        
         assertEquals(resultado, esperado, 2);
        
    }
    
    
    
    
}
