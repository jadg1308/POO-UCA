/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listapersona;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class TablaPersona {
    private ArrayList<Persona> lista = new ArrayList<>();
    
    public void agregarPersona(Persona pers){
        lista.add(pers);
    }
    
    public Persona primerReg(){
        if (lista.isEmpty()){
            JOptionPane.showMessageDialog(null, "La lista esta vacía",
                    "Lista Persona", JOptionPane.WARNING_MESSAGE);
            return null;
        }
        return lista.get(0);
    }
    
    public Persona ultReg(){
        int ultReg= lista.size()-1;
        if (lista.isEmpty()){
            JOptionPane.showMessageDialog(null, "La lista esta vacía",
                    "Lista Persona", JOptionPane.WARNING_MESSAGE);
            return null;
        }
        return lista.get(ultReg);
    }
    
    public Persona regAnt(int indice){
        
        if (indice < 0){
            JOptionPane.showMessageDialog(null, "El registro actual es el primer registro",
                    "Lista Persona", JOptionPane.WARNING_MESSAGE);
            indice=0;
            return lista.get(indice);
            
        }
        return lista.get(indice);
    }
    
    public Persona regSig(int indice){
       
        int tam = lista.size()-1;
        if (indice > tam){
            JOptionPane.showMessageDialog(null, "El registro actual es el último registro.",
                    "Lista Persona", JOptionPane.WARNING_MESSAGE);
            indice = tam;
            return lista.get(indice);
        }
        return lista.get(indice);
    }

    public ArrayList<Persona> getLista() {
        return lista;
    }
    
    
}
