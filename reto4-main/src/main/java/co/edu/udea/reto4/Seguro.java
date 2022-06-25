package co.edu.udea.reto4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Santiago Graciano
 */
public class Seguro {

    private String nombreEmpresa;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String descripcion;
    private String idPanel;

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

    public String calcularCobertura() {
        long diferenciaDias = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        String mensaje = "El total de días cobertura del seguro es de " + diferenciaDias;
        return mensaje;
    }

    @Override
    public String toString() {
        return "nombreEmpresa= " + nombreEmpresa + "\n fechaInicio= " + fechaInicio + 
                "\n fechaFin= " + fechaFin + "\n descripcion= " + descripcion + 
                "\n idPanel= " + idPanel + "\n dias seguro= " + calcularCobertura() ;
    }
    
    
}
