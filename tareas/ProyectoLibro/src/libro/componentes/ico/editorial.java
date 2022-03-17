/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro.componentes.ico;

 
/**
 *
 * @author josej
 */
public class editorial {
    private String nombredelaEditorial;
    private int volumen;
    private int edicion;
    private int añoDeEdicion;
    private String lugarDeEdcion;

    public editorial() {
    }

    public editorial(String nombredelaEditorial, int volumen, int edicion, int añoDeEdicion, String lugarDeEdcion) {
        this.nombredelaEditorial = nombredelaEditorial;
        this.volumen = volumen;
        this.edicion = edicion;
        this.añoDeEdicion = añoDeEdicion;
        this.lugarDeEdcion = lugarDeEdcion;
    }

    public String getLugarDeEdcion() {
        return lugarDeEdcion;
    }

    public void setLugarDeEdcion(String lugarDeEdcion) {
        this.lugarDeEdcion = lugarDeEdcion;
    }

    public String getNombredelaEditorial() {
        return nombredelaEditorial;
    }

    public void setNombredelaEditorial(String nombredelaEditorial) {
        this.nombredelaEditorial = nombredelaEditorial;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public int getAñoDeEdicion() {
        return añoDeEdicion;
    }

    public void setAñoDeEdicion(int añoDeEdicion) {
        this.añoDeEdicion = añoDeEdicion;
    }

    @Override
    public String toString() {
        return "editorial{" + "nombredelaEditorial=" + nombredelaEditorial + ", volumen=" + volumen + ", edicion=" + edicion + ", a\u00f1oDeEdicion=" + añoDeEdicion + ", lugarDeEdcion=" + lugarDeEdcion + '}';
    }

   
    
    
}
