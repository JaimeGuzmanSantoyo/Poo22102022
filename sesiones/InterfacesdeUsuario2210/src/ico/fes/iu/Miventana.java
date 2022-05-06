
package ico.fes.iu;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Miventana extends Frame implements MouseListener {
    private Button boton1;
    private FlowLayout layaout;
    private TextField cuadroTexto;
    private Label etiqueta;
    private EventosRaton eventosRaton;
    
    
    
    public Miventana() throws HeadlessException {
        setTitle("mi ventana");
        setSize(300,200); 
        layaout = new FlowLayout();
        setLayout(layaout);
        
        boton1 = new Button("Saludar");
        cuadroTexto = new TextField(15);// se indica cuantas columnas tiene 
        etiqueta = new Label("valor inicial "); //etiqueta 
       
        this.boton1.addMouseListener(this);// se agrega un oyente de eventos 
        
        this.add(cuadroTexto);
        this.add(boton1);
        this.add(etiqueta);
        
        setVisible(true);
        
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
         System.out.println("clic");
    }
    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("presionado");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Liberado");
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("entró");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("salió");
    }   
    
    
    
    
}
