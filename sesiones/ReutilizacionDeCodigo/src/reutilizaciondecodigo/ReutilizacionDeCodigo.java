/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizaciondecodigo;

import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.equipos.Computadora;
import ico.fes.herencia.Alumno;
import ico.fes.herencia.Polimorfismo.Animal;
import ico.fes.herencia.Polimorfismo.Perro;
import ico.fes.iu.MiVentana;

/**
 *
 * @author josej
 */
public class ReutilizacionDeCodigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

      String facultad = new String("FES Aragón"); //objeto string
    char letra = facultad.charAt(4); //con esto selecciona la letra que ocupe el lugar 4
        System.out.println(letra); //muestra la letra en pantalla 
        //MiVentana v1 = new MiVentana(); //imprime la  ventana creada 
         //------------ventana --------------------------
        
        ///-------composicion----------------------
        Computadora compu = new Computadora();
        compu.setMarca("asus");
        
        compu.setModelo("VIvobook 2");
         compu.setCpu( new Procesador("Intel", "i9", 5.0f)  );
         Mouse raton = new Mouse();
         raton.setMarca("LOGITEHC");
         compu.setRaton(raton);
         compu.getRaton().setModelo("GS400");
         compu.setPantalla(new Monitor("Sansung", "led", 45f));
         Monitor pantalla = new Monitor();
         compu.getPantalla().setMarca("LG");//ASI se puede cambiar la marca 
        System.out.println(compu);
        
        
        System.out.println("-------Herencia----------");
        Alumno alul = new Alumno();
        alul.setNombre("Jose");
        alul.setEdad(19);
        System.out.println(alul);

       Alumno alu2 = new Alumno("12134-9", "DERECHO", 2, "jose ", 20);
        System.out.println(alu2);
    
        System.out.println("--------polimorfismo------");
        Animal animal1 = new Animal(4);
        Perro animal2 = new Perro ("  poddle" , 4);
        animal1.hablar();
        animal2.hablar();
        animal2.hablar(5);
        
         
    }
    
    //polimorfismo por el concepoto de sobrecarga de metodo 

public void hablar (int veces){
    for(int i = 0;i< veces; i++){
        System.out.println("Guau");
    }
}

}
