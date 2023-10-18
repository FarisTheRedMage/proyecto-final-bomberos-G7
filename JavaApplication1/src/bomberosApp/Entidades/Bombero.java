package bomberosApp.Entidades;

import java.time.LocalDate;

public class Bombero {
    private int id_bombero;
    private String nombre;
    private String apellido;
    private int dni;
    private LocalDate fecha_nacimiento;
    private String grupo_sanguineo;
    private Brigada brigada;
    private String celular;
    private boolean estado;
    private String nombre_clave;

    public Bombero() {
    }

    public Bombero(String nombre, String apellido, int dni, LocalDate fecha_nacimiento, String grupo_sanguineo, Brigada brigada, String celular, boolean estado, String nombre_clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
        this.grupo_sanguineo = grupo_sanguineo;
        this.brigada = brigada;
        this.celular = celular;
        this.estado = estado;
        this.nombre_clave = nombre_clave;
    }

    public Bombero(int id_bombero, String nombre, String apellido, int dni, LocalDate fecha_nacimiento, String grupo_sanguineo, Brigada brigada, String celular, boolean estado,String nombre_clave) {
        this.id_bombero = id_bombero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
        this.grupo_sanguineo = grupo_sanguineo;
        this.brigada = brigada;
        this.celular = celular;
        this.estado = estado;
        this.nombre_clave = nombre_clave;
    }

    public int getId_bombero() {
        return id_bombero;
    }

    public void setId_bombero(int id_bombero) {
        this.id_bombero = id_bombero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getGrupo_sanguineo() {
        return grupo_sanguineo;
    }

    public void setGrupo_sanguineo(String grupo_sanguineo) {
        this.grupo_sanguineo = grupo_sanguineo;
    }

    public Brigada getBrigada() {
        return brigada;
    }

    public void setBrigada(Brigada brigada) {
        this.brigada = brigada;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getNombre_clave() {
        return nombre_clave;
    }

    public void setNombre_clave(String nombre_clave) {
        this.nombre_clave = nombre_clave;
    }

    
    @Override
    public String toString() {
        return "ID" + id_bombero + 
                ", Nombre" + nombre +
                ", Apellido" + apellido + 
                ", Dni" + dni +
                ", Fecha Nacimiento" + fecha_nacimiento +
                ", Grupo Sanguineo" + grupo_sanguineo + 
                ", Brigada" + brigada + 
                ", Celular" + celular + 
                ", Estado" + estado +
                ", Nombre clave" + nombre_clave;
                
    }

    
}
