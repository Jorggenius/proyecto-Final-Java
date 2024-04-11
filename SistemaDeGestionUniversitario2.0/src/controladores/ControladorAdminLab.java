package controladores;

import java.util.ArrayList;
import modelo.AdminLab;
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
public class ControladorAdminLab {

    public ArrayList<AdminLab> adminLabs;
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

    public ControladorAdminLab(ControladorPrincipal controlP, ControladorAdministrador controlA,
            ControladorEstudiante controlE, ControladorDocente controlD, ControladorAdministrativo controlUA,
            ControladorAdminLab controlAL, ControlVentanaEstudiante controlVE, ControlVentanaDocente controlVD,
            ControlVentanaAdministrativo controlVA, ControlVentanaAdminLab controlVAL, ControlTablaEstudiante controlTE,
            ControlTablaDocente controlTD, ControlTablaAdministrativo controlTA, ControlTablaAdminLab controlTAL,
            PanelPrincipal panelP, PanelAdministrador panelA, PanelIngresarEstudiante panelIE, PanelIngresarDocente panelID,
            PanelIngresarAdministrativo panelIA, PanelIngresarAdminLab panelIAL, VentanaUsEstudiante ventanaE,
            VentanaUsDocente ventanaD, VentanaUsAdministrativo ventanaA, VentanaUsAdminLab ventanaAL) {
        adminLabs = new ArrayList<>();
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

    public ArrayList<AdminLab> getAdminLabs() {
        return adminLabs;
    }

    public void setAdminLabs(ArrayList<AdminLab> adminLabs) {
        this.adminLabs = adminLabs;
    }
    
     public boolean agregarAdminLab(AdminLab ad) {
        AdminLab aux = buscarAdminLab(ad.getId());
        if (aux == null) {
            adminLabs.add(ad);
            return true;
        }
        return false;
    }

    public AdminLab buscarAdminLab(int id) {
        for (int i = 0; i < adminLabs.size(); i++) {
            if (adminLabs.get(i).getId() == id) {
                return adminLabs.get(i);
            }
        }
        return null;
    }
}
