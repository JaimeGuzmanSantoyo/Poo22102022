
package cifrado.césar;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author josej
 */
 
public class Ventana extends JFrame{
private JTextField texto2;
    
    public Ventana(){
        this.setSize(500 ,300); // tamaño de la ventana 
         this.setTitle("---------------CIFRADO CESAR---------------------");
         setDefaultCloseOperation(EXIT_ON_CLOSE);
       this.getContentPane() .setBackground(Color.BLACK); // se establece un color 
   componentes ();
    
    }
    
 private void componentes (){
        //private JLabel etiqeuta2;
        JPanel panel = new JPanel(); // creacion de un panel 
        this.getContentPane() .add(panel);
        panel.setBackground(Color.pink);
        
        JLabel etiqueta = new JLabel("Bienvenido al mejor traductor de codigo Cesar ,has entrado en la matrix usario  ");
        panel.add(etiqueta); 
        
        JTextField texto = new JTextField (15); 
        panel.add(texto);
        JButton boton = new JButton ("Convertir el texto a codigo Cesar  ");
        JTextField resultado = texto;
        panel.add(boton);
        
        JLabel etiqueta2 = new JLabel("conversión");
        panel.add(etiqueta2);
        
        JTextField texto2 = new JTextField(20);
        panel.add(texto2);
 };
       private String tabla = "abcdefghijklmnopqrstuvwxyz";

    
        
    public String Encriptar(String t, int key){       
        String texto = LimpiarCadena(t);
        //aqui se almacena el resultado
        String res = "";        
        for(int i = 0; i < texto.length();i++)
        {
            //busca la posicion del caracter en la variable tabla
            int pos = tabla.indexOf(texto.charAt(i));
            //realiza el reemplazo
            if ((pos + key) < tabla.length()){
                res = res + tabla.charAt(pos+key);
            }
            else
            {
              res = res + tabla.charAt((pos+key) - tabla.length());
               
            }    
            
        }        
        return res;
        
    }

    private String LimpiarCadena(String t) {
        throw new UnsupportedOperationException("Not supported yet.");  
    }
            }
        
         
    
  
