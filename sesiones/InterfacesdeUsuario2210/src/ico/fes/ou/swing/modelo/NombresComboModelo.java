/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.ou.swing.modelo;

import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 * Los metdos de esta clase serán invocados de forma AUTOMATICA por EL OBJETO DE LA VISTA 
 * ,en este caso un JComboBox ,nosotros como progrmadoores le proporcionaremos
 * la informacion  que requiere la vista para mostrarle la información al usuario
 *
 * 
 *
 * @author guzma
 */
public class NombresComboModelo implements ComboBoxModel<String>{
    private ArrayList<String> datos;
private String selectedItem;

    public NombresComboModelo() {
    }

    public NombresComboModelo(ArrayList<String> datos, String selectedItem) {
        this.datos = datos;
        this.selectedItem = selectedItem;
    }

   
    public ArrayList<String> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<String> datos) {
        this.datos = datos;
    }

   

    @Override
    public void setSelectedItem(Object o) {
    this.selectedItem = (String)o; // guarda el lemento seleccionado 
    }

    @Override
    public int getSize() {
    return datos.size(); //se usa para los arreglos 
    }

    @Override
    public String getElementAt(int i) {
        return  datos.get(i); // ejecuta los arreglos 
        
    }

    @Override
    public void addListDataListener(ListDataListener l) {
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
    }

    @Override
    public Object getSelectedItem() {
        return  this.selectedItem;
    }

    
   


    
}
