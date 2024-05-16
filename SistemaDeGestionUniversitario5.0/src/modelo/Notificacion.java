/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author JORGE
 */
public class Notificacion implements Serializable{
    
    LocalDateTime fechaEmvio;
    String mensaje;
    String motivo;

    public Notificacion(LocalDateTime fechaEmvio, String mensaje, String motivo) {
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


    public LocalDateTime getFechaEmvio() {
        return fechaEmvio;
    }

    public void setFechaEmvio(LocalDateTime fechaEmvio) {
        this.fechaEmvio = fechaEmvio;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
    
}
