/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author JORGE
 */
public class Notificacion implements Serializable{
    
    Date fechaEmvio;
    String mensaje;
    String motivo;

    public Notificacion(Date fechaEmvio, String mensaje, String motivo) {
        this.fechaEmvio = fechaEmvio;
        this.mensaje = mensaje;
        this.motivo = motivo;
    }

    public String getRazon() {
        return motivo;
    }

    public void setRazon(String Razon) {
        this.motivo = Razon;
    }


    public Date getFechaEmvio() {
        return fechaEmvio;
    }

    public void setFechaEmvio(Date fechaEmvio) {
        this.fechaEmvio = fechaEmvio;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    
}
