/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.componentes;

/**
 *
 * @author josej
 */
public class Teclado {
   private String marca;
   private int numerodeTeclas;
   private boolean multimedia; //true = multimedia 

    public Teclado() {
    }

    public Teclado(String marca, int numerodeTeclas, boolean multimedia) {
        this.marca = marca;
        this.numerodeTeclas = numerodeTeclas;
        this.multimedia = multimedia;
    }

    public boolean isMultimedia() {
        return multimedia;
    }

    public void setMultimedia(boolean multimedia) {
        this.multimedia = multimedia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumerodeTeclas() {
        return numerodeTeclas;
    }

    public void setNumerodeTeclas(int numerodeTeclas) {
        this.numerodeTeclas = numerodeTeclas;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + ", numerodeTeclas=" + numerodeTeclas + ", multimedia=" + multimedia + '}';
    }



}
