package bomberosApp.Entidades;

import java.time.LocalDate;



public class bombero {
    private int id_bombero;
    private String dni;
    private String nombre_apellido;
    private LocalDate fecha_nacimiento;
    private String celular;
    private int codigo_brigada;

    public bombero() {
    }

    public bombero(int id_bombero, String dni, String nombre_apellido, LocalDate fecha_nacimiento, String celular, int codigo_brigada) {
        this.id_bombero = id_bombero;
        this.dni = dni;
        this.nombre_apellido = nombre_apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.celular = celular;
        this.codigo_brigada = codigo_brigada;
    }

    public bombero(String dni, String nombre_apellido, LocalDate fecha_nacimiento, String celular, int codigo_brigada) {
        this.dni = dni;
        this.nombre_apellido = nombre_apellido;
        this.fecha_nacimiento = fecha_nacimiento;
        this.celular = celular;
        this.codigo_brigada = codigo_brigada;
    }

    public int getId_bombero() {
        return id_bombero;
    }

    public void setId_bombero(int id_bombero) {
        this.id_bombero = id_bombero;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre_apellido() {
        return nombre_apellido;
    }

    public void setNombre_apellido(String nombre_apellido) {
        this.nombre_apellido = nombre_apellido;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getCodigo_brigada() {
        return codigo_brigada;
    }

    public void setCodigo_brigada(int codigo_brigada) {
        this.codigo_brigada = codigo_brigada;
    }

    @Override
    public String toString() {
        return "bombero{" + "id_bombero=" + id_bombero + ", dni=" + dni + ", nombre_apellido=" + nombre_apellido + ", fecha_nacimiento=" + fecha_nacimiento + ", celular=" + celular + ", codigo_brigada=" + codigo_brigada + '}';
    }
    
    
    
    
}
