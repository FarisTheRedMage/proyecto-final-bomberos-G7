package bomberosApp.Entidades;

import java.time.LocalDate;

public class Bombero {
    private int id_bombero;
    private String nombre;
    private String apellido;
    private String dni;
    private LocalDate fecha_nacimiento;
    private String grupo_sanguineo;
    private int codigo_brigada;
    private String celular;
    private boolean estado;

    public Bombero() {
    }

    public Bombero(String nombre, String apellido, String dni, LocalDate fecha_nacimiento, String grupo_sanguineo, int codigo_brigada, String celular, boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
        this.grupo_sanguineo = grupo_sanguineo;
        this.codigo_brigada = codigo_brigada;
        this.celular = celular;
        this.estado = estado;
    }
    
    public Bombero(int id_bombero, String nombre, String apellido, String dni, LocalDate fecha_nacimiento, String grupo_sanguineo, int codigo_brigada, String celular, boolean estado) {
        this.id_bombero = id_bombero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
        this.grupo_sanguineo = grupo_sanguineo;
        this.codigo_brigada = codigo_brigada;
        this.celular = celular;
        this.estado = estado;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
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

    public int getCodigo_brigada() {
        return codigo_brigada;
    }

    public void setCodigo_brigada(int codigo_brigada) {
        this.codigo_brigada = codigo_brigada;
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

    @Override
    public String toString() {
        return "bombero{" + "id_bombero=" + id_bombero + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", fecha_nacimiento=" + fecha_nacimiento + ", grupo_sanguineo=" + grupo_sanguineo + ", codigo_brigada=" + codigo_brigada + ", celular=" + celular + ", estado=" + estado + '}';
    }

}
