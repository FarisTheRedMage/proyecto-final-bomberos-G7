package bomberosApp.Entidades;

public class Brigada {
    private int codigo_brigada;
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

    public Brigada(int codigo_brigada, String nombre_brigada, String especialidad, boolean estado, Cuartel cuartel) {
        this.codigo_brigada = codigo_brigada;
        this.nombre_brigada = nombre_brigada;
        this.especialidad = especialidad;
        this.estado = estado;
        this.cuartel = cuartel;
    }

    public int getCodigo_brigada() {
        return codigo_brigada;
    }

    public void setCodigo_brigada(int codigo_brigada) {
        this.codigo_brigada = codigo_brigada;
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
        return "Brigada{" + "codigo_brigada=" + codigo_brigada + ", nombre_brigada=" + nombre_brigada + ", especialidad=" + especialidad + ", estado=" + estado + ", cuartel=" + cuartel + '}';
    }
   
}
