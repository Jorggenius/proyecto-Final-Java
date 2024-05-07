package controladores;

import modelo.Administrativo;
import vistas.VentanaUsAdministrativo;
/**
 *
 * @author JORGE
 */
public class ControlVentanaAdministrativo {


    public ControlVentanaAdministrativo() {
        
    }

    public void abrirVentana(Administrativo admin) {
        Administrativo aux = admin;
        VentanaUsAdministrativo ventanaA = new VentanaUsAdministrativo();
        ventanaA.setVisible(true);
        ventanaA.informacionAdministrativo(admin);
    }
}
