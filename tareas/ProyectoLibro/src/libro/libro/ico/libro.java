/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro.libro.ico;
import libro.componentes.ico.editorial;
import libro.componentes.ico.autor;
/**
 *
 * @author josej
 */
public class libro {
     private String nombreDelLibro;
     private int numeroDePaginas;
     private String subtitulo;
     private String colorDelaPortada;
      
       
   
   private editorial edit;
   private autor Autor;

    public libro() {
    }

    public libro(String nombreDelLibro, int numeroDePaginas, String subtitulo, String colorDelaPortada, editorial edit, autor Autor) {
        this.nombreDelLibro = nombreDelLibro;
        this.numeroDePaginas = numeroDePaginas;
        this.subtitulo = subtitulo;
        this.colorDelaPortada = colorDelaPortada;
        this.edit = edit;
        this.Autor = Autor;
    }

    public autor getAutor() {
        return Autor;
    }

    public void setAutor(autor Autor) {
        this.Autor = Autor;
    }

    public String getNombreDelLibro() {
        return nombreDelLibro;
    }

    public void setNombreDelLibro(String nombreDelLibro) {
        this.nombreDelLibro = nombreDelLibro;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getColorDelaPortada() {
        return colorDelaPortada;
    }

    public void setColorDelaPortada(String colorDelaPortada) {
        this.colorDelaPortada = colorDelaPortada;
    }

    public editorial getEdit() {
        return edit;
    }

    public void setEdit(editorial edit) {
        this.edit = edit;
    }
    public void abrir(){
        
        System.out.println("----------Abriendo libro--------- ");
        
    }
    public void leerlibro(){
        System.out.println(".....leyendo.......zzzzzz.....Dormido......");
        
    }
    
    public void guardarPagina(){
        System.out.println("------------Marcar la pagina en la que me quede------ ");
        
    }
    public void cerrarLibro(){
        System.out.println("------cerrando libro-----");
        
    }
    public void guardarLibro(){
        System.out.println("----guardando-----");
    }
    @Override
    public String toString() {
        return "libro{" + "nombreDelLibro=" + nombreDelLibro + ", numeroDePaginas=" + numeroDePaginas + ", subtitulo=" + subtitulo + ", colorDelaPortada=" + colorDelaPortada + ", edit=" + edit + ", Autor=" + Autor + '}';
    
    
     
    
     
    }

   

   
}
