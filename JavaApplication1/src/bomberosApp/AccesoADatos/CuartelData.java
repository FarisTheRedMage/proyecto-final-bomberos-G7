package bomberosApp.AccesoADatos;

import bomberosApp.Entidades.Cuartel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class CuartelData {

    private Connection con = null;

    public CuartelData() {
        con = ConexionData.getConexion();
    }

    public void GuardarCuartel(Cuartel cuartel) {
        String SQL = "INSERT INTO cuartel (nombre_cuartel, direccion, coord_X, coord_Y, telefono, correo) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, cuartel.getNombre_cuartel());
            ps.setString(2, cuartel.getDireccion());
            ps.setInt(3, cuartel.getCoord_X());
            ps.setInt(4, cuartel.getCoord_Y());
            ps.setString(5, cuartel.getTelefono());
            ps.setString(6, cuartel.getCorreo());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                cuartel.setId_cuartel(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Cuartel Agregado Exitosamente. ");
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cuartel" + e.getMessage());
        }
    }

    public Cuartel BuscarCuartelPorId(int id) {
        Cuartel cuartel = null;

        String SQL = "SELECT * FROM cuartel WHERE id_cuartel = ? ";

        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(SQL);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                cuartel = new Cuartel();
                cuartel.setId_cuartel(id);
                cuartel.setNombre_cuartel(rs.getString("nombre_cuartel"));
                cuartel.setDireccion(rs.getString("direccion"));
                cuartel.setCoord_X(rs.getInt("coord_X"));
                cuartel.setCoord_Y(rs.getInt("coord_Y"));
                cuartel.setTelefono(rs.getString("telefono"));
                cuartel.setCorreo(rs.getString("correo"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe el Cuartel. ");
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Cuartel" + e.getMessage());
        }
        return cuartel;
    }

    
    
    
}
