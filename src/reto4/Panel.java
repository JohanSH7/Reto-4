/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3;

/**
 *
 * @author Johan.henao1
 */
public class Panel {
    private String id;
    private String serie;
    private String descripcion;
    private String tipo;
    private String modelo;
    private int anioFabricacion;
    private double precioVenta;
    
// constructores
    public Panel(String id, String serie, String descripcion, String tipo, String modelo, int anioFabricacion, double precioVenta) {
        this.id = id;
        this.serie = serie;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.precioVenta = precioVenta;
    }
    public Panel() {
    } 
//getters and set
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getSerie() {
        return serie;
    }
    public void setSerie(String serie) {
        this.serie = serie;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnioFabricacion() {
        return anioFabricacion;
    }
    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    public double getPrecioVenta() {
        return precioVenta;
    }
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
//metodoDeLaClase
    public String calcularUso(){
        return null;
    }
}
