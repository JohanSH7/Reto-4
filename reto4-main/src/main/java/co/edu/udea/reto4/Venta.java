package co.edu.udea.reto4;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Santiago Graciano
 */
public class Venta {

    private String idPanel;
    private LocalDateTime fechaVenta;
    private String tipoDocumentoComprador;
    private String idComprador;
    private String nombreComprador;
    private String descripcionUso;
    //Constructores

    public Venta(LocalDateTime fechaVenta, String tipoDocumentoComprador, String idComprador, String nombreComprador, String descripcionUso, String idPanel) {
        this.fechaVenta = fechaVenta;
        this.tipoDocumentoComprador = tipoDocumentoComprador;
        this.idComprador = idComprador;
        this.nombreComprador = nombreComprador;
        this.descripcionUso = descripcionUso;
        this.idPanel = idPanel;
    }

    public Venta() {
    }

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

//MetodosPropios
    public String calcularDias() {
        long diferenciaDias = ChronoUnit.DAYS.between(fechaVenta, LocalDateTime.now());
        String mensaje = "El total de días a partir de la venta es de " + diferenciaDias;
        return mensaje;
    }

    @Override
    public String toString() {
        return "idPanel= " + idPanel + "\n fechaVenta= " + fechaVenta + "\n tipoDocumentoComprador= " 
                + tipoDocumentoComprador + "\n idComprador= " + idComprador + "\n nombreComprador= " 
                + nombreComprador + "\n descripcionUso= " + descripcionUso ;
    }
    

}
