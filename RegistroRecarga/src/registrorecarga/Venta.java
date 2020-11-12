/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrorecarga;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jadg13
 */
public class Venta {

    public ArrayList<Recarga> lista;

    public Venta() {
        this.lista = new ArrayList<>();
    }

    public void agregarVenta(Recarga recarga) {

        lista.add(recarga);

    }

    public float montoClaro() {
        float monto = 0;
        try {
            for (Recarga r : lista) {
                if (r.getTelefonia().equals("CLARO")) {
                    monto += r.getMontoRecarga();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return monto;

    }

    public float montoTigo() {
        float monto = 0;
        try {
            for (Recarga r : lista) {
                if (r.getTelefonia().equals("TIGO")) {
                    monto += r.getMontoRecarga();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return monto;
    }

    public float obtenerGanancia() {
        float ganancia = 0, porcGanancia = 0, monto = 0;
        try {
            for (Recarga r : lista) {
                monto += r.getMontoRecarga();
            }
            if (monto >= 1 && monto <= 1000) {
                porcGanancia = (float) 0.06;
            } else {
                if (monto >= 1001 && monto <= 3000) {
                    porcGanancia = (float) 0.08;
                } else {
                    if (monto >= 3001 && monto <= 5000) {
                        porcGanancia = (float) 0.1;
                    } else {
                        if (monto >= 5001) {
                            porcGanancia = (float) 0.15;
                        }
                    }
                }
            }
            ganancia = monto * porcGanancia;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return ganancia;
    }

    public DefaultTableModel verVenta() {
        DefaultTableModel tbl = new DefaultTableModel();
        try {
            String[] titulo = {"Número", "Compañía", "Tipo Recarga", "Monto C$"};
            tbl.setColumnIdentifiers(titulo);
            for (Recarga r : lista) {
                Object[] fila = new Object[4];
                fila[0] = r.getNumCelular();
                fila[1] = r.getTelefonia();
                fila[2] = r.getTipoRecarga();
                fila[3] = r.getMontoRecarga();
                tbl.addRow(fila);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return tbl;
    }

}
