/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrobd;

/**
 *
 * @author jadg13
 */
public class Ciudad {
    private int id;
    private String nombre;
    private int poblacion;
    private float extension;

    public Ciudad() {
    }

    public Ciudad(int id, String nombre, int poblacion, float extension) {
        this.id = id;
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.extension = extension;
    }

    public float getExtension() {
        return extension;
    }

    public void setExtension(float extension) {
        this.extension = extension;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }
    
    
    
}
