package bomberosApp.Entidades;

import java.sql.Date;

public class Siniestro {
    
    private int codigo_siniestro;
    private int  coord_X;
    private int coord_Y;
    private Date fecha_siniestro;
    private String tipo;
    private String detalles;
    private Brigada brigada;
    private Date fecha_resolucion;
    private int calificacion;

    public Siniestro() {
    }

    public Siniestro(int coord_X, int coord_Y, Date fecha_siniestro, String tipo, String detalles, Brigada brigada, Date fecha_resolucion, int calificacion) {
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.fecha_siniestro = fecha_siniestro;
        this.tipo = tipo;
        this.detalles = detalles;
        this.brigada = brigada;
        this.fecha_resolucion = fecha_resolucion;
        this.calificacion = calificacion;
    }

    public Siniestro(int codigo_siniestro, int coord_X, int coord_Y, Date fecha_siniestro, String tipo, String detalles, Brigada brigada, Date fecha_resolucion, int calificacion) {
        this.codigo_siniestro = codigo_siniestro;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.fecha_siniestro = fecha_siniestro;
        this.tipo = tipo;
        this.detalles = detalles;
        this.brigada = brigada;
        this.fecha_resolucion = fecha_resolucion;
        this.calificacion = calificacion;
    }

    public int getCodigo_siniestro() {
        return codigo_siniestro;
    }

    public void setCodigo_siniestro(int codigo_siniestro) {
        this.codigo_siniestro = codigo_siniestro;
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

    public Date getFecha_siniestro() {
        return fecha_siniestro;
    }

    public void setFecha_siniestro(Date fecha_siniestro) {
        this.fecha_siniestro = fecha_siniestro;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
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

    public Date getFecha_resolucion() {
        return fecha_resolucion;
    }

    public void setFecha_resolucion(Date fecha_resolucion) {
        this.fecha_resolucion = fecha_resolucion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Siniestro{" + "codigo_siniestro=" + codigo_siniestro + ", coord_X=" + coord_X + ", coord_Y=" + coord_Y + ", fecha_siniestro=" + fecha_siniestro + ", tipo=" + tipo + ", detalles=" + detalles + ", brigada=" + brigada + ", fecha_resolucion=" + fecha_resolucion + ", calificacion=" + calificacion + '}';
    }

}
