
package pruebaejemplo;

/**
 *
 * @author josej
 */
public class PruebaEjemplo {

    
    public static void main(String[] args) {
          
        Cuentahabiente usuario1 = new Cuentahabiente("Alejandra", 422938540, 50000);
        Cuentahabiente usuario2 = new Cuentahabiente("Denilson ", 122222222, 20000);
        Cuentahabiente usuario3 = new Cuentahabiente("GUILLERMO ", 19191911, 30000);
       
        System.out.println(usuario1);
        
      usuario1.retirarDinero(50000);
      
      
      System.out.println(usuario2);

      
       usuario2.retirarDinero(20000);
       
       
       System.out.println(usuario3);
       
       usuario3.retirarDinero(30000);
    
    
       System.out.println("--------------LISTA DEL  ARREGLO---------- ");
      
      Cuentahabiente[] lista =  new Cuentahabiente[5];
        
       
      lista[0] =new Cuentahabiente("Juana", 34321111, 70000 );  
        
      lista[1] =new Cuentahabiente("Raul", 0201010101, 12000); 
      
      lista[2] =new Cuentahabiente("Sergio", 49678902, 45000);
      
      lista[3] =new Cuentahabiente("Andrea", 49678902, 75000);
      
      lista[4] =new Cuentahabiente("Marcela ", 49678902, 85000);
       //System.out.println("datos de los usuarios ");
       
     
   
        for (Cuentahabiente cuentahabiente : lista) {
            cuentahabiente.retirarDinero(70000);
             
 
          
            
        }
            
        
       
      
        }
    
    }
    
    

    

