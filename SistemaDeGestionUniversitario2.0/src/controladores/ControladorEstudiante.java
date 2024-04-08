package controladores;

import java.util.ArrayList;
import modelo.Estudiante;
import vistas.PanelAdministrador;
import vistas.PanelIngresarDocente;
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
    ControladorDocente controlD;
    PanelPrincipal panelP;
    PanelAdministrador panelA;
    PanelIngresarEstudiante panelIE;
    PanelIngresarDocente panelID;

    public ControladorEstudiante(ControladorAdministrador contrrlA, ControladorDocente controlD, 
            ControladorEstudiante controlE, ControladorPrincipal controlP, 
            PanelPrincipal panelP, PanelAdministrador panelA, PanelIngresarEstudiante panelIE,PanelIngresarDocente panelID) {
        ests = new ArrayList<>();
        this.contrrlA = contrrlA;
        this.controlE = controlE;
        this.controlP = controlP;
        this.controlD = controlD;
        this.panelP = panelP;
        this.panelA = panelA;
        this.panelIE = panelIE;
        this.panelID = panelID;
    }

    public ArrayList<Estudiante> getEsts() {
        return ests;
    }

    public void setEsts(ArrayList<Estudiante> ests) {
        this.ests = ests;
    }
    
      public boolean agregarEstudiante(Estudiante e){
         Estudiante aux = buscarEstudiante(e.getId());
        if(aux == null){
            ests.add(e);
            return true;
        }
        return false; 
    }
    
     public Estudiante buscarEstudiante(int id){
        for (int i = 0; i < ests.size(); i++) {
            if(ests.get(i).getId() == id){
                return ests.get(i);
            }
        }
        return null;
    }

}
