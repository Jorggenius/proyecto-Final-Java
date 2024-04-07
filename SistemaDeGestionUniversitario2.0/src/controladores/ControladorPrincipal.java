package controladores;

import vistas.PanelAdministrador;
import vistas.PanelIngresarEstudiante;
import vistas.PanelPrincipal;

/**
 *
 * @author JORGE
 */
public class ControladorPrincipal {

    ControladorAdministrador contrrlA;
    ControladorEstudiante controlE;
    ControladorPrincipal controlP;
    PanelPrincipal panelP;
    PanelAdministrador panelA;
    PanelIngresarEstudiante panelIE;

    public ControladorPrincipal(ControladorAdministrador contrrlA, ControladorEstudiante controlE,
            ControladorPrincipal controlP, PanelPrincipal panelP,
            PanelAdministrador panelA, PanelIngresarEstudiante panelIE) {
        this.contrrlA = contrrlA;
        this.controlE = controlE;
        this.controlP = controlP;
        this.panelP = panelP;
        this.panelA = panelA;
        this.panelIE = panelIE;
    }

    
    
}
