
import java.io.InputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author promitheas
 */
public class TestResources {
    
    public static void main(String[] args){
        new TestResources().testResource();
        
    }
    
    
    public void testResource(){
                InputStream  is =  Thread.currentThread().getContextClassLoader().getResourceAsStream("./KS/keystore.jks");
                if (is == null)
                    System.out.println("Is null.....");
    }
    
    
}
