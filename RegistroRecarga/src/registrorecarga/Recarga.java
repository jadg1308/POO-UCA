/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrorecarga;

/**
 *
 * @author jadg13
 */
public class Recarga {
    private int numCelular;
    private String telefonia;
    private String tipoRecarga;
    private float montoRecarga;

    public Recarga() {
    }

    public Recarga(int numCelular, String telefonia, String tipoRecarga, float montoRecarga) {
        this.numCelular = numCelular;
        this.telefonia = telefonia;
        this.tipoRecarga = tipoRecarga;
        this.montoRecarga = montoRecarga;
    }

    public int getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(int numCelular) {
        this.numCelular = numCelular;
    }

    public String getTelefonia() {
        return telefonia;
    }

    public void setTelefonia(String telefonia) {
        this.telefonia = telefonia;
    }

    public String getTipoRecarga() {
        return tipoRecarga;
    }

    public void setTipoRecarga(String tipoRecarga) {
        this.tipoRecarga = tipoRecarga;
    }

    public float getMontoRecarga() {
        return montoRecarga;
    }

    public void setMontoRecarga(float montoRecarga) {
        this.montoRecarga = montoRecarga;
    }

    @Override
    public String toString() {
        return "Recarga{" + "numCelular=" + numCelular + ", telefonia=" + telefonia + ", tipoRecarga=" + tipoRecarga + ", montoRecarga=" + montoRecarga + '}';
    }
    
    
    
}
