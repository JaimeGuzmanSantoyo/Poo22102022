
package ico.fes;

/**
 *
 * @author josej
 */
public class Cuadrado  implements Figura {
    private float alto;
    private float ancho;

    public Cuadrado() {
    }

    public Cuadrado(float alto, float ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "alto=" + alto + ", ancho=" + ancho + '}';
    }

    @Override
    public float calculararea() {
         
    return this.alto * this.ancho;
    
    }

    @Override
    public String saludar() {
        
    
        System.out.println("Hola desde un metodo no abstracto ");
        return "hola";
    }
    
   
}
