/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro.componentes.ico;

/**
 *
 * @author josej
 */
public class autor {
  private String nombredelAutor;
  private int añoDePublicacion;
  private String coAutor;

    public autor() {
    }

    public autor(String nombredelAutor, int añoDePublicacion, String coAutor) {
        this.nombredelAutor = nombredelAutor;
        this.añoDePublicacion = añoDePublicacion;
        this.coAutor = coAutor;
    }

    public autor(String lovecraft) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getCoAutor() {
        return coAutor;
    }

    public void setCoAutor(String coAutor) {
        this.coAutor = coAutor;
    }

    public String getNombredelAutor() {
        return nombredelAutor;
    }

    public void setNombredelAutor(String nombredelAutor) {
        this.nombredelAutor = nombredelAutor;
    }

    public int getAñoDePublicacion() {
        return añoDePublicacion;
    }

    public void setAñoDePublicacion(int añoDePublicacion) {
        this.añoDePublicacion = añoDePublicacion;
        
   
     
    
        
    }
    @Override
    public String toString() {
        return "autor{" + "nombredelAutor=" + nombredelAutor + ", a\u00f1oDePublicacion=" + añoDePublicacion + ", coAutor=" + coAutor + '}';
    }
  
  

   
    
    
}
