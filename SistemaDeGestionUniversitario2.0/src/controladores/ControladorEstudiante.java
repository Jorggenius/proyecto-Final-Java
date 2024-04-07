package controladores;

import java.util.ArrayList;
import modelo.Estudiante;
import vistas.PanelAdministrador;
import vistas.PanelIngresarEstudiante;
import vistas.PanelPrincipal;

/**
 *
 * @author JORGE
 */
public class ControladorEstudiante {

    public ArrayList<Estudiante> ests;
    ControladorAdministrador contrrlA;
    ControladorEstudiante controlE;
    ControladorPrincipal controlP;
    PanelPrincipal panelP;
    PanelAdministrador panelA;
    PanelIngresarEstudiante panelIE;

    public ControladorEstudiante(ControladorAdministrador contrrlA, 
            ControladorEstudiante controlE, ControladorPrincipal controlP, 
            PanelPrincipal panelP, PanelAdministrador panelA, PanelIngresarEstudiante panelIE) {
        ests = new ArrayList<>();
        this.contrrlA = contrrlA;
        this.controlE = controlE;
        this.controlP = controlP;
        this.panelP = panelP;
        this.panelA = panelA;
        this.panelIE = panelIE;
    }

    public ArrayList<Estudiante> getEsts() {
        return ests;
    }

    public void setEsts(ArrayList<Estudiante> ests) {
        this.ests = ests;
    }
    
    
   

}
