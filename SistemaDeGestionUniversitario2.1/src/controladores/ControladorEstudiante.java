package controladores;

import java.util.ArrayList;
import modelo.Estudiante;
import modelo.Usuario;
import vistas.PanelAdministrador;
import vistas.PanelIngresarAdminLab;
import vistas.PanelIngresarAdministrativo;
import vistas.PanelIngresarDocente;
import vistas.PanelIngresarEstudiante;
import vistas.PanelPrincipal;
import vistas.VentanaUsAdminLab;
import vistas.VentanaUsAdministrativo;
import vistas.VentanaUsDocente;
import vistas.VentanaUsEstudiante;

/**
 *
 * @author JORGE
 */
public class ControladorEstudiante {

    public ArrayList<Estudiante> ests;
    ControladorPrincipal controlP;
    ControladorAdministrador controlA;
    ControladorEstudiante controlE;
    ControladorDocente controlD;
    ControladorAdministrativo controlUA;
    ControladorAdminLab controlAL;
    ControlVentanaEstudiante controlVE;
    ControlVentanaDocente controlVD;
    ControlVentanaAdministrativo controlVA;
    ControlVentanaAdminLab controlVAL;
    ControlTablaEstudiante controlTE;
    ControlTablaDocente controlTD;
    ControlTablaAdministrativo controlTA;
    ControlTablaAdminLab controlTAL;
    PanelPrincipal panelP;
    PanelAdministrador panelA;
    PanelIngresarEstudiante panelIE;
    PanelIngresarDocente panelID;
    PanelIngresarAdministrativo panelIA;
    PanelIngresarAdminLab panelIAL;
    VentanaUsEstudiante ventanaE;
    VentanaUsDocente ventanaD;
    VentanaUsAdministrativo ventanaA;
    VentanaUsAdminLab ventanaAL;

    public ControladorEstudiante(ControladorPrincipal controlP, ControladorAdministrador controlA,
            ControladorEstudiante controlE, ControladorDocente controlD, ControladorAdministrativo controlUA,
            ControladorAdminLab controlAL, ControlVentanaEstudiante controlVE, ControlVentanaDocente controlVD,
            ControlVentanaAdministrativo controlVA, ControlVentanaAdminLab controlVAL, ControlTablaEstudiante controlTE,
            ControlTablaDocente controlTD, ControlTablaAdministrativo controlTA, ControlTablaAdminLab controlTAL,
            PanelPrincipal panelP, PanelAdministrador panelA, PanelIngresarEstudiante panelIE, PanelIngresarDocente panelID,
            PanelIngresarAdministrativo panelIA, PanelIngresarAdminLab panelIAL, VentanaUsEstudiante ventanaE,
            VentanaUsDocente ventanaD, VentanaUsAdministrativo ventanaA, VentanaUsAdminLab ventanaAL) {
        ests = new ArrayList<>();
         this.controlP = controlP;
        this.controlA = controlA;
        this.controlE = controlE;
        this.controlD = controlD;
        this.controlUA = controlUA;
        this.controlAL = controlAL;
        this.controlVE = controlVE;
        this.controlVD = controlVD;
        this.controlVA = controlVA;
        this.controlVAL = controlVAL;
        this.controlTE = controlTE;
        this.controlTD = controlTD;
        this.controlTA = controlTA;
        this.controlTAL = controlTAL;
        this.panelP = panelP;
        this.panelA = panelA;
        this.panelIE = panelIE;
        this.panelID = panelID;
        this.panelIA = panelIA;
        this.panelIAL = panelIAL;
        this.ventanaE = ventanaE;
        this.ventanaD = ventanaD;
        this.ventanaA = ventanaA;
        this.ventanaAL = ventanaAL;
    }

    public ArrayList<Estudiante> getEsts() {
        return ests;
    }

    public void setEsts(ArrayList<Estudiante> ests) {
        this.ests = ests;
    }

    public boolean agregarEstudiante(Usuario e) {
        Estudiante aux = (Estudiante) buscarEstudiante(e.getId());
        if (aux == null) {
            controlP.usuarios.add(e);
            return true;
        }
        return false;
    }

    public Usuario buscarEstudiante(int id) {
        for (int i = 0; i < controlP.usuarios.size(); i++) {
            if (controlP.usuarios.get(i).getId() == id) {
                return controlP.usuarios.get(i);
            }
        }
        return null;
    }

}
