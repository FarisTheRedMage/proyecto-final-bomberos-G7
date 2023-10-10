package bomberosApp.Entidades;

import bomberosApp.Enumeraciones.TipoSiniestro;
import java.sql.Date;
import java.time.LocalDate;

public class Siniestro {

    private int id_siniestro;
    private int coord_X;
    private int coord_Y;
    private LocalDate fecha_siniestro;
    private TipoSiniestro tipo;
    private String detalles;
    private Brigada brigada;
    private LocalDate fecha_resolucion;
    private int calificacion;
    private Boolean estado;

    public Siniestro() {
    }

    public Siniestro(int coord_X, int coord_Y, LocalDate fecha_siniestro, TipoSiniestro tipo, String detalles, Brigada brigada, LocalDate fecha_resolucion, int calificacion, Boolean estado) {
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.fecha_siniestro = fecha_siniestro;
        this.tipo = tipo;
        this.detalles = detalles;
        this.brigada = brigada;
        this.fecha_resolucion = fecha_resolucion;
        this.calificacion = calificacion;
        this.estado = estado;
    }

    public Siniestro(int id_siniestro, int coord_X, int coord_Y, LocalDate fecha_siniestro, TipoSiniestro tipo, String detalles, Brigada brigada, LocalDate fecha_resolucion, int calificacion, Boolean estado) {
        this.id_siniestro = id_siniestro;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.fecha_siniestro = fecha_siniestro;
        this.tipo = tipo;
        this.detalles = detalles;
        this.brigada = brigada;
        this.fecha_resolucion = fecha_resolucion;
        this.calificacion = calificacion;
        this.estado = estado;
    }

    public int getId_siniestro() {
        return id_siniestro;
    }

    public void setId_siniestro(int id_siniestro) {
        this.id_siniestro = id_siniestro;
    }

    public int getCoord_X() {
        return coord_X;
    }

    public void setCoord_X(int coord_X) {
        this.coord_X = coord_X;
    }

    public int getCoord_Y() {
        return coord_Y;
    }

    public void setCoord_Y(int coord_Y) {
        this.coord_Y = coord_Y;
    }

    public LocalDate getFecha_siniestro() {
        return fecha_siniestro;
    }

    public void setFecha_siniestro(LocalDate fecha_siniestro) {
        this.fecha_siniestro = fecha_siniestro;
    }

    public TipoSiniestro getTipo() {
        return tipo;
    }

    public void setTipo(TipoSiniestro tipo) {
        this.tipo = tipo;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Brigada getBrigada() {
        return brigada;
    }

    public void setBrigada(Brigada brigada) {
        this.brigada = brigada;
    }

    public LocalDate getFecha_resolucion() {
        return fecha_resolucion;
    }

    public void setFecha_resolucion(LocalDate fecha_resolucion) {
        this.fecha_resolucion = fecha_resolucion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public Boolean isEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

 
    

    @Override
    public String toString() {
        return "ID" + id_siniestro
                + ", Coordenadas X" + coord_X
                + ", Coordenadas Y" + coord_Y
                + ", Fecha Del Siniestro=" + fecha_siniestro
                + ", Tipo" + tipo //revisar
                + ", Detalles" + detalles
                + ", Brigada" + brigada
                + ", Fecha Resolucion" + fecha_resolucion
                + ", Calificacion" + calificacion
                + ", Estado" + estado;
    }

}
