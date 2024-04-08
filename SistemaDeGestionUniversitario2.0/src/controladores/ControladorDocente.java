package controladores;

import java.util.ArrayList;
import modelo.Docente;
import vistas.PanelAdministrador;
import vistas.PanelIngresarDocente;
import vistas.PanelIngresarEstudiante;
import vistas.PanelPrincipal;

/**
 *
 * @author JORGE
 */
public class ControladorDocente {

    public ArrayList<Docente> docens;
    ControladorAdministrador contrrlA;
    ControladorEstudiante controlE;
    ControladorPrincipal controlP;
    ControladorDocente controlD;
    PanelPrincipal panelP;
    PanelAdministrador panelA;
    PanelIngresarEstudiante panelIE;
    PanelIngresarDocente panelID;

    public ControladorDocente(ControladorAdministrador contrrlA, ControladorEstudiante controlE, ControladorPrincipal controlP, ControladorDocente controlD, PanelPrincipal panelP, PanelAdministrador panelA, PanelIngresarEstudiante panelIE, PanelIngresarDocente panelID) {
        docens = new ArrayList<>();
        this.contrrlA = contrrlA;
        this.controlE = controlE;
        this.controlP = controlP;
        this.controlD = controlD;
        this.panelP = panelP;
        this.panelA = panelA;
        this.panelIE = panelIE;
        this.panelID = panelID;
    }

    public ArrayList<Docente> getDocens() {
        return docens;
    }

    public void setDocens(ArrayList<Docente> docens) {
        this.docens = docens;
    }
    
      public boolean agregarDocente(Docente e){
         Docente aux = buscarDocente(e.getId());
        if(aux == null){
            docens.add(e);
            return true;
        }
        return false; 
    }
    
     public Docente buscarDocente(int id){
        for (int i = 0; i < docens.size(); i++) {
            if(docens.get(i).getId() == id){
                return docens.get(i);
            }
        }
        return null;
    }

}
