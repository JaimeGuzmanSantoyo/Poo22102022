/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.herencia.Polimorfismo;


public class Perro extends Animal {
    
    private String raza;

    public Perro() {
    }

    public Perro(String raza, int numeroPatas) {
        super(numeroPatas);
        this.raza = raza;
    

  
    }
     @Override
    public void hablar(){
        System.out.println("El perro de raza " + this.raza + "Esta ladrando");
            System.out.println("Guau guau!!!");
    }
    
    
    //Polimorfismo por el concepto de sobrecarga de método
    public void hablar(int veces){
        for (int i = 0; i < veces; i++) {
            System.out.println("Guau ");
            
        }
        System.out.println("!!!");
    }
    
}

    
    
    

