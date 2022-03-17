/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizaciondeLibro;

import libro.componentes.ico.editorial;
import libro.componentes.ico.autor;
import libro.libro.ico.libro;

public class Libroreutilizacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        libro Libro = new libro();
         autor Autor  = new autor ();
         //Autor.setNombredelAutor("LOVECRAFT");
        Libro.setNombreDelLibro(" El llamado de Chulhhu");
        Libro.setColorDelaPortada(" Rojo");
        Libro.setSubtitulo(" no tiene");
        Libro.setNumeroDePaginas(360);
        Libro.setEdit(new editorial(" Debolsillo",  2 ,  5 , 1934, " Mexico"));
        Libro.setAutor(new autor(" LOVECRAFT", 1930, " no hay"));
        
        Libro.setSubtitulo("no tiene");
        Libro.abrir();
        Libro.leerlibro();
         Libro.guardarPagina();
        Libro.cerrarLibro();
       
        System.out.println(Libro);
       
    }
    
}
