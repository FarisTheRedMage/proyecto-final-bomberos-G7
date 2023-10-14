package bomberosApp.Entidades;

public class Brigada {
    private int id_brigada;
    private String nombre_brigada;
    private String especialidad;
    private boolean estado;
    private Cuartel cuartel;
    private Boolean disponibilidad;
    
    public Brigada() {
    }

    public Brigada(String nombre_brigada, String especialidad, boolean estado, Cuartel cuartel, Boolean disponibilidad) {
        this.nombre_brigada = nombre_brigada;
        this.especialidad = especialidad;
        this.estado = estado;
        this.cuartel = cuartel;
        this.disponibilidad = disponibilidad;
    }

    public Brigada(int id_brigada, String nombre_brigada, String especialidad, boolean estado, Cuartel cuartel,Boolean disponibilidad) {
        this.id_brigada = id_brigada;
        this.nombre_brigada = nombre_brigada;
        this.especialidad = especialidad;
        this.estado = estado;
        this.cuartel = cuartel;
        this.disponibilidad = disponibilidad;
    }

    public int getId_brigada() {
        return id_brigada;
    }

    public void setId_brigada(int id_brigada) {
        this.id_brigada = id_brigada;
    }

    public String getNombre_brigada() {
        return nombre_brigada;
    }

    public void setNombre_brigada(String nombre_brigada) {
        this.nombre_brigada = nombre_brigada;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Cuartel getCuartel() {
        return cuartel;
    }

    public void setCuartel(Cuartel cuartel) {
        this.cuartel = cuartel;
    }

    public Boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibiblidad) {
        this.disponibilidad = disponibiblidad;
    }

    @Override
    public String toString() {
        return " ID" + id_brigada + 
                ", Nombre de la brigada" + nombre_brigada +
                ", Especialidad" + especialidad + 
                ", Estado" + estado + 
                ", Cuartel" + cuartel + 
                ", Disponibilidad" + disponibilidad;
        
    }

}