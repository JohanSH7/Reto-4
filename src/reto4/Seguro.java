/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3;

import java.time.LocalDate;

/**
 *
 * @author Johan.henao1
 */
public class Seguro {
    private String nombreEmpresa;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String descripcion;
    private String idPanel;
//Getter and set
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public LocalDate getFechaFin() {
        return fechaFin;
    }
    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getIdPanel() {
        return idPanel;
    }
    public void setIdPanel(String idPanel) {
        this.idPanel = idPanel;
    }   
//Constructores
    public Seguro(String nombreEmpresa, LocalDate fechaInicio, LocalDate fechaFin, String descripcion, String idPanel) {
        this.nombreEmpresa = nombreEmpresa;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.idPanel = idPanel;
    }
    public Seguro() {
    }
   
    
    public String calcularCobertura(){
        return null;
    }
}
