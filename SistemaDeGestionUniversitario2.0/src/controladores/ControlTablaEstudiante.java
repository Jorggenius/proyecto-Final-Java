/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class ControlTablaEstudiante {

    ControladorAdministrador contrrlA;
    ControladorEstudiante controlE;
    ControladorPrincipal controlP;
    ControladorDocente controlD;
    ControlTablaEstudiante controlTE;
    ControlTablaDocente controlTD;
    PanelPrincipal panelP;
    PanelAdministrador panelA;
    PanelIngresarEstudiante panelIE;
    PanelIngresarDocente panelID;

    public ControlTablaEstudiante(ControladorAdministrador contrrlA, ControladorEstudiante controlE, 
            ControladorPrincipal controlP, ControladorDocente controlD, ControlTablaEstudiante controlTE,
            ControlTablaDocente controlTD, PanelPrincipal panelP, PanelAdministrador panelA, 
            PanelIngresarEstudiante panelIE, PanelIngresarDocente panelID) {
        this.contrrlA = contrrlA;
        this.controlE = controlE;
        this.controlP = controlP;
        this.controlD = controlD;
        this.controlTE = controlTE;
        this.controlTD = controlTD;
        this.panelP = panelP;
        this.panelA = panelA;
        this.panelIE = panelIE;
        this.panelID = panelID;
    }
    
    

    public ArrayList<Estudiante> listaEsts() {
        ArrayList<Estudiante> ests = controlE.ests;
        return ests;
    }

}
