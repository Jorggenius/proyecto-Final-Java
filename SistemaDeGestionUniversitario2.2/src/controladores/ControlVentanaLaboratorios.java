/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Curso;
import modelo.Laboratorio;
import vistas.PanelAdministrador;
import vistas.PanelIngresarAdminLab;
import vistas.PanelIngresarAdministrativo;
import vistas.PanelIngresarDocente;
import vistas.PanelIngresarEstudiante;
import vistas.PanelPrincipal;
import vistas.VentanaCursos;
import vistas.VentanaLaboratorios;
import vistas.VentanaUsAdminLab;
import vistas.VentanaUsAdministrativo;
import vistas.VentanaUsDocente;
import vistas.VentanaUsEstudiante;

/**
 *
 * @author JORGE
 */
public class ControlVentanaLaboratorios {

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
    ControlVentanaCursos controlVC;
    ControlVentanaLaboratorios controlVL;
    ControlTablaEstudiante controlTE;
    ControlTablaDocente controlTD;
    ControlTablaAdministrativo controlTA;
    ControlTablaAdminLab controlTAL;
    ControlTablaUsuarioEstudiante controlTUE;
    ControlTablaUsuarioDocente controlTUD;
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
    VentanaCursos ventanaC;
    VentanaLaboratorios ventanaL;

    public ControlVentanaLaboratorios(ControladorPrincipal controlP, ControladorAdministrador controlA,
            ControladorEstudiante controlE, ControladorDocente controlD, ControladorAdministrativo controlUA,
            ControladorAdminLab controlAL, ControlVentanaEstudiante controlVE, ControlVentanaDocente controlVD,
            ControlVentanaAdministrativo controlVA, ControlVentanaAdminLab controlVAL, ControlVentanaCursos controlVC,
            ControlVentanaLaboratorios controlVL, ControlTablaEstudiante controlTE, ControlTablaDocente controlTD,
            ControlTablaAdministrativo controlTA, ControlTablaAdminLab controlTAL, ControlTablaUsuarioEstudiante controlTUE,
            ControlTablaUsuarioDocente controlTUD, PanelPrincipal panelP, PanelAdministrador panelA,
            PanelIngresarEstudiante panelIE, PanelIngresarDocente panelID, PanelIngresarAdministrativo panelIA,
            PanelIngresarAdminLab panelIAL, VentanaUsEstudiante ventanaE, VentanaUsDocente ventanaD,
            VentanaUsAdministrativo ventanaA, VentanaUsAdminLab ventanaAL, VentanaCursos ventanaC,
            VentanaLaboratorios ventanaL) {

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
        this.controlVC = controlVC;
        this.controlVL = controlVL;
        this.controlTE = controlTE;
        this.controlTD = controlTD;
        this.controlTA = controlTA;
        this.controlTAL = controlTAL;
        this.controlTUE = controlTUE;
        this.controlTUD = controlTUD;
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
        this.ventanaC = ventanaC;
        this.ventanaL = ventanaL;
    }

    public Curso inscribirCurso(String programaCurso) {
        System.out.println(programaCurso);
        ArrayList<Curso> cursos = controlP.obtenerCursos();
        for (int i = 0; i < cursos.size(); i++) {
            if (programaCurso.equals(cursos.get(i).getPrograma())) {
                Curso curso = cursos.get(i);
                System.out.println(curso.getPrograma());
                return curso;
            }
        }
        return null;
    }

    public boolean crearLaboratorio(Laboratorio lab) {
        Laboratorio aux = buscarLaboratorio(lab.getIdLaboratorio());
        if (aux != null) {
            controlP.labs.add(lab);
            return true;
        } else {
            return false;
        }
    }

    public Laboratorio buscarLaboratorio(int id) {
        for (int i = 0; i < controlP.getLabs().size(); i++) {
            if (id == controlP.getLabs().get(i).getIdLaboratorio()) {
                return controlP.getLabs().get(i);

            }
        }
        return null;
    }
}
