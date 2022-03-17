/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizaciondecodigo;

import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.equipos.Computadora;
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
        System.out.println(compu);
    }
}
