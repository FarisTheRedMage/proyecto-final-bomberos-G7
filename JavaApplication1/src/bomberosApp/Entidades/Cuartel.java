package bomberosApp.Entidades;

public class Cuartel {
    
    private int codigo_cuartel;
    private String nombre_cuartel;
    private String direccion;
    private int coord_X;
    private int coord_Y;
    private String telefono;
    private String Correo;

    public Cuartel() {
    }

    public Cuartel(String nombre_cuartel, String direccion, int coord_X, int coord_Y, String telefono, String Correo) {
        this.nombre_cuartel = nombre_cuartel;
        this.direccion = direccion;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.telefono = telefono;
        this.Correo = Correo;
    }

    public Cuartel(int codigo_cuartel, String nombre_cuartel, String direccion, int coord_X, int coord_Y, String telefono, String Correo) {
        this.codigo_cuartel = codigo_cuartel;
        this.nombre_cuartel = nombre_cuartel;
        this.direccion = direccion;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.telefono = telefono;
        this.Correo = Correo;
    }

    public int getCodigo_cuartel() {
        return codigo_cuartel;
    }

    public void setCodigo_cuartel(int codigo_cuartel) {
        this.codigo_cuartel = codigo_cuartel;
    }

    public String getNombre_cuartel() {
        return nombre_cuartel;
    }

    public void setNombre_cuartel(String nombre_cuartel) {
        this.nombre_cuartel = nombre_cuartel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    @Override
    public String toString() {
        return "cuartel{" + "codigo_cuartel=" + codigo_cuartel + ", nombre_cuartel=" + nombre_cuartel + ", direccion=" + direccion + ", coord_X=" + coord_X + ", coord_Y=" + coord_Y + ", telefono=" + telefono + ", Correo=" + Correo + '}';
    }

}
