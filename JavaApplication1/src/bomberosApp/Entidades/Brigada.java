package bomberosApp.Entidades;

public class Brigada {
    private int id_brigada;
    private String nombre_brigada;
    private String especialidad;
    private boolean estado;
    private Cuartel cuartel;

    
    public Brigada() {
    }

    public Brigada(String nombre_brigada, String especialidad, boolean estado, Cuartel cuartel) {
        this.nombre_brigada = nombre_brigada;
        this.especialidad = especialidad;
        this.estado = estado;
        this.cuartel = cuartel;
    }

    public Brigada(int id_brigada, String nombre_brigada, String especialidad, boolean estado, Cuartel cuartel) {
        this.id_brigada = id_brigada;
        this.nombre_brigada = nombre_brigada;
        this.especialidad = especialidad;
        this.estado = estado;
        this.cuartel = cuartel;
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

    @Override
    public String toString() {
        return " ID" + id_brigada + 
                ", Nombre de la brigada" + nombre_brigada +
                ", Especialidad" + especialidad + 
                ", Estado" + estado + 
                ", Cuartel" + cuartel;
    }

}