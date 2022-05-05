/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia;

/**
 *
 * @author josej
 */
public class EstudianteDeportistaArtista extends Persona implements Deportista,Artista{ //esta heredado a persona e implentando a deportista y artista 
    private String carrera;
    private String numeroCuenta;
    private int semestre;

    public EstudianteDeportistaArtista() {
    }

    public EstudianteDeportistaArtista(String carrera, String numeroCuenta, int semestre) {
        this.carrera = carrera;
        this.numeroCuenta = numeroCuenta;
        this.semestre = semestre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "EstudianteDeportistaArtista{" + "carrera=" + carrera + ", numeroCuenta=" + numeroCuenta + ", semestre=" + semestre + '}';
    }
    public void estudiar(){
        System.out.println("Estudiando............");
    }

    @Override
    public void entrenar() {
        System.out.println(this.getNombre() +"Esta entrenando ");
                
    }

    @Override
    public void jugar() {
        System.out.println(this.getNombre()+this.getNumeroCuenta()+"Esta jugando");
    }

    @Override
    public void enseyar() {
        System.out.println(this.getNombre() +"Esta ensayandp ");
    }
    @Override
    public void presentar() {
    System.out.println(this.getNombre() +"se esta presentando ");
    }
    
    
    
}
