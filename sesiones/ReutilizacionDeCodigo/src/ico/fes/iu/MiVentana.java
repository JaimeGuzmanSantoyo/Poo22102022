/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.iu;

import java.awt.HeadlessException;//importacion de calses 
import javax.swing.JFrame; //importacion de clases de 3ros 

/**
 *
 * @author josej
 */
public class MiVentana extends JFrame{ //el codigo que pinta a la ventana se ncuentra en JFrame 
 
 
 public MiVentana()   throws HeadlessException {   
   this.setSize(600, 400); //dimensiones //sse usa codigo como el setsize y setvisible para ahorrar codigo
   this.setVisible(true);//para que se visualice 
this.setTitle("hola mundo de reutilizacion"); //con title se puede poner el titulo 
 }

}
