/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2210parte2;

import ico.fes.Circulo;
import ico.fes.Cuadrado;
import ico.fes.Figura;
import java.awt.Color;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class JavaBasico2210Parte2 {

    
    public static void main(String[] args) {

        Cuadrado c = new Cuadrado(4.0f,4.0f); 
        Circulo cir = new Circulo(5.0f);
        
        System.out.println(c.calculararea());
        System.out.println(cir.calculararea());
    
    
        Scanner teclado = new Scanner(System.in);
        System.out.println("1) cuadrado 2) crculo 3)triangulo 4)rectangulo\n elige una opcion   " );
    
    int opcion = teclado.nextInt(); //Excepciones 
    
        switch (opcion ) {
            case Figura.CUADRADO:
                System.out.println(c.calculararea());
                break;
            case Figura.CIRCULO:
                System.out.println(cir.calculararea());
                break;
            case Figura.TRINAGULO:
                //area triangulo
                break;
            case Figura.RECTANGULO:
                // area del rectangulo 
                break;
                
            default:
               System.out.println("Opcion no valida ");
        }
        JOptionPane.showMessageDialog(null, "hola", 
                "el titulo ",JOptionPane.INFORMATION_MESSAGE );
        
    Color color =new Color (Color.GREEN);
    Color micolor = new Color(Color.BLACK); 
    }
    
}
