package bomberosApp.AccesoADatos;

import bomberosApp.Entidades.Bombero;
import bomberosApp.Entidades.Brigada;
import bomberosApp.Entidades.Cuartel;
import bomberosApp.Enumeraciones.BomberoNombreClave;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class BrigadaData {

    BomberoData bombero = new BomberoData();
    private Connection con = null;

    public BrigadaData() {
        con = ConexionData.getConexion();
    }

    public void GuardarBrigada(Brigada brigada) {
        String SQL = "INSERT INTO brigada (nombre_brigada, especialidad, estado, id_cuartel) VALUES ( ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, brigada.getNombre_brigada());
            ps.setString(2, brigada.getEspecialidad());
            ps.setBoolean(3, brigada.isEstado());
            ps.setInt(4, brigada.getCuartel().getId_cuartel());  //Mepa q era asi  // OJO

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                brigada.setId_brigada(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Brigada agregada exitosamente. ");
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error a Acceder a la tabla Brigada. " + e.getMessage());
        }
    }

    public Brigada BuscarBrigada(int id) {
        Brigada brigada = null;

        String SQL = "SELECT * FROM brigada WHERE id_brigada=? and estado=1";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(SQL);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            Cuartel cuart;

            if (rs.next()) {
                brigada = new Brigada();
                cuart = new Cuartel();

                brigada.setId_brigada(id);
                brigada.setNombre_brigada(rs.getString("nombre_brigada"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setEstado(rs.getBoolean("estado"));//

                cuart.setId_cuartel(rs.getInt("id_brigada"));
                brigada.setCuartel(cuart);

            } else {
                JOptionPane.showMessageDialog(null, "No existe el empleado");
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada" + e.getMessage());////VER ESTO!!!!!!!
        }
        return brigada;
    }

    public void ModificarBrigada(Brigada brigada) {

        String SQL = " UPDATE brigada "
                + "SET nombre_brigada = ?, especialidad = ?, estado = ?, id_cuartel = ? "
                + "WHERE id_brigada = ?";

        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(SQL);

            ps.setString(1, brigada.getNombre_brigada());
            ps.setString(2, brigada.getEspecialidad());
            ps.setBoolean(3, brigada.isEstado());
            ps.setInt(4, brigada.getCuartel().getId_cuartel());
            ps.setInt(5, brigada.getId_brigada());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La Brigada no existe");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada " + e.getMessage());
        }
    }

    public void EliminarBrigada(int id) {
        try {
            String SQL = "UPDATE brigada SET estado = 0 WHERE id_brigada = ? ";

            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, id);

            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se elimino el Bombero. ");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero. " + e.getMessage());
        }
    }

    public List<Brigada> ListarBrigada() {
        List<Brigada> brigadas = new ArrayList<>();

        try {
            String SQL = "SELECT * FROM brigada";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Brigada brigada = new Brigada();
                Cuartel cuartel = new Cuartel();
                brigada.setId_brigada(rs.getInt("id_brigada"));
                brigada.setNombre_brigada(rs.getString("nombre_brigada"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setEstado(rs.getBoolean("estado"));

                cuartel.setId_cuartel(rs.getInt("id_cuartel"));//------ 
                brigada.setCuartel(cuartel);

                brigadas.add(brigada);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Brigada" + ex.getMessage());
        }
        return brigadas;
    }

    
    
    
//    public List<Bombero> BomberosPorBrigada(Bombero[] bomberos) {
//
//        
//        
//        if (bomberos.length > 5) {
//            JOptionPane.showMessageDialog(null, "No se pueden asignar nombres clave a más de 5 bomberos.");
//            return new ArrayList<>(); // Devuelve una lista vacía en caso de error.
//        }
//
//        BomberoNombreClave[] bomberoNombreClave = BomberoNombreClave.values();
//
//        if (bomberoNombreClave.length < bomberos.length) {
//            JOptionPane.showMessageDialog(null, "No hay suficientes nombres clave para todos los bomberos.");
//            return new ArrayList<>();
//        }
//
//        for (int i = 0; i < bomberos.length; i++) {
//            bomberos[i].setNombre_clave(bomberoNombreClave[i].values()[i]);
//            // Aquí debes guardar los cambios en la base de datos usando tu lógica, si es necesario.
//        }
//
//        JOptionPane.showMessageDialog(null, "Nombres clave asignados exitosamente.");
//
//        // Devuelve la lista de bomberos actualizada.
//        return Arrays.asList(bomberos);
//    }
}
