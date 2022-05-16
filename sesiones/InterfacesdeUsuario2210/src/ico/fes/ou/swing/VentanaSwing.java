/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.ou.swing;

import ico.fes.ou.swing.modelo.NombresComboModelo;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author lenovo
 */
public class VentanaSwing extends JFrame {

    private FlowLayout layout;
    private JTextField Cuadrotexto;
    private JButton boton;
    private JLabel resultado;
    private JComboBox<String> lista;
    private NombresComboModelo modelo ;

    public VentanaSwing() throws HeadlessException {
        this.setTitle("Mi ventana Swing");
        this.setSize(300, 200);
        this.setVisible(true);
        layout = new FlowLayout();
        this.setLayout(layout);
        Cuadrotexto = new JTextField(15);
        boton = new JButton("Convertir a F.");
        resultado = new JLabel("grados F.");
        lista = new JComboBox<String>(); // contiene string y tiene un add item donde agrega componenetes genericos <
        //usando defaultcomboboxmodel
        modelo = new NombresComboModelo();
        ArrayList<String> info = new ArrayList ();
        
       info.add("jESUs");
       info.add("topo");
    info.add("rodolfo");
   
modelo.setDatos(info);
lista.setModel(modelo);
        this.getContentPane().add(Cuadrotexto);
        this.getContentPane().add(boton);
        this.getContentPane().add(resultado);
        this.getContentPane().add(lista);
        this.pack();
        this.setVisible(true);
        //this.validate();

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
                //((JFrame)e.getSource()).setVisible(false);
            }
        });

        //this.boton.addMouseListener(new MouseAdapter() {
            //@Override
            //public void mouseClicked(MouseEvent e) {
                //al sig. le hará falta manejo de excepciones???
                float centigrados = Float.parseFloat(Cuadrotexto.getText());
                // °F = (°C × 9/5) + 32
                float farenheit = (centigrados * (9.0f / 5.0f)) + 32.0f;
                resultado.setText(farenheit + " °F");
            }

        

        /*this.lista.addItemListener(new ItemAdapter() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                System.out.println("Cambio el item");
                System.out.println(ie.getItem());
            }

        });

    }

}
