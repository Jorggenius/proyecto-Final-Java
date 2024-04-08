/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class ControlTablaDocente {

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

    public ControlTablaDocente(ControladorAdministrador contrrlA, ControladorEstudiante controlE, 
            ControladorPrincipal controlP, ControladorDocente controlD, ControlTablaEstudiante controlTE,
            ControlTablaDocente controlTD, PanelPrincipal panelP, PanelAdministrador panelA, PanelIngresarEstudiante panelIE,
            PanelIngresarDocente panelID) {
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
    
     public ArrayList<Docente> listaDocens() {
        ArrayList<Docente> ests = controlD.docens;
        return ests;
    }
}
