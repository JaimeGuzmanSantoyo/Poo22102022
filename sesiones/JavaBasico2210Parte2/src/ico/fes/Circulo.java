/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author josej
 */
public class Circulo  implements Figura  {
   
    
    public static final float Pi = 3.1416f;// se declara una constante 
    float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public float calculararea() {
        return Pi* (this.radio * this.radio);// formula
    }

    @Override
    public String saludar() {
        System.out.println("hola desde el circulo");
    
    return "hola C";
    }
    
    
    
    
    
}
