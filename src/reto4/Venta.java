/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3;
import java.time.LocalDateTime;

/**
 *
 * @author Johan.henao1
 */
public class Venta {
    private String idPanel;
    private LocalDateTime fechaVenta;
    private String tipoDocumentoComprador;
    private String idComprador;
    private String nombreComprador;
    private String descripcionUso;
    
// getter and setter
    public LocalDateTime getFechaVenta() {
        return fechaVenta;
    }
    public void setFechaVenta(LocalDateTime fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    public String getTipoDocumentoComprador() {
        return tipoDocumentoComprador;
    }
    public void setTipoDocumentoComprador(String tipoDocumentoComprador) {
        this.tipoDocumentoComprador = tipoDocumentoComprador;
    }
    public String getIdComprador() {
        return idComprador;
    }
    public void setIdComprador(String idComprador) {
        this.idComprador = idComprador;
    }
    public String getNombreComprador() {
        return nombreComprador;
    }
    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }
    public String getDescripcionUso() {
        return descripcionUso;
    }
    public void setDescripcionUso(String descripcionUso) {
        this.descripcionUso = descripcionUso;
    }
    public String getIdPanel() {
        return idPanel;
    }
    public void setIdPanel(String idPanel) {
        this.idPanel = idPanel;
    }
//Constructores
    public Venta(LocalDateTime fechaVenta, String tipoDocumentoComprador, String idComprador, String nombreComprador, String descripcionUso, String idPanel) {
        this.fechaVenta = fechaVenta;
        this.tipoDocumentoComprador = tipoDocumentoComprador;
        this.idComprador = idComprador;
        this.nombreComprador = nombreComprador;
        this.descripcionUso = descripcionUso;
        this.idPanel= idPanel;
    }
    public Venta() {
    }
//MetodosPropios
    public String calcularDias(){
        return null;   
    }
    
    
}
