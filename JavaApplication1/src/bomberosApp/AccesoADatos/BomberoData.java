package bomberosApp.AccesoADatos;

import bomberosApp.Entidades.Bombero;
import bomberosApp.Entidades.Brigada;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class BomberoData {

    private Connection con = null;

    public BomberoData() {
        con = ConexionData.getConexion();
    }

    public void GuardarBombero(Bombero bombero) {
        String SQL = "INSERT INTO bombero (nombre, apellido, dni, fecha_nacimiento, grupo_sanguineo, id_brigada, celular, estado, nombre_clave) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, bombero.getNombre());
            ps.setString(2, bombero.getApellido());
            ps.setInt(3, bombero.getDni());
            ps.setDate(4, Date.valueOf(bombero.getFecha_nacimiento()));
            ps.setString(5, bombero.getGrupo_sanguineo());
            ps.setInt(6, bombero.getBrigada().getId_brigada());
            ps.setString(7, bombero.getCelular());
            ps.setBoolean(8, bombero.isEstado());
            ps.setString(9, bombero.getNombre_clave());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                bombero.setId_bombero(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Personal agregado exitosamente");
            }

            rs.close();
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error a Acceder a la tabla Bombero" + e.getMessage());
        }
    }

    public Bombero BuscarBombero(int id) {
        Bombero bombero = null;

        String SQL = "SELECT * FROM bombero WHERE id_bombero=?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(SQL);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            Brigada brg;// -------
            if (rs.next()) {
                bombero = new Bombero();
                brg = new Brigada();// -------

                bombero.setId_bombero(id);
                bombero.setNombre(rs.getString("nombre"));
                bombero.setApellido(rs.getString("apellido"));
                bombero.setDni(rs.getInt("dni"));
                bombero.setFecha_nacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
                bombero.setGrupo_sanguineo(rs.getString("grupo_sanguineo"));
                brg.setId_brigada(rs.getInt("id_brigada"));
                bombero.setBrigada(brg);
                bombero.setCelular(rs.getString("celular"));
                bombero.setEstado(rs.getBoolean("estado"));
                bombero.setNombre_clave(rs.getNString("nombre_clave"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe el empleado");
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero" + e.getMessage());
        }
        return bombero;
    }

    public void ModificarBombero(Bombero bombero) {

        String SQL = " UPDATE bombero "
                + "SET nombre = ?, apellido =?, fecha_nacimiento = ?, grupo_sanguineo = ?, id_brigada = ?, celular = ?, estado = ?, nombre_clave = ? "
                + "WHERE dni = ?";//LO CAMBIE AL ULTIMO DATO POR DNI NO ID_BOMBERO
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(SQL);

            ps.setString(1, bombero.getNombre());
            ps.setString(2, bombero.getApellido());
            ps.setDate(3, Date.valueOf(bombero.getFecha_nacimiento()));
            ps.setString(4, bombero.getGrupo_sanguineo());
            ps.setInt(5, bombero.getBrigada().getId_brigada());
            ps.setString(6, bombero.getCelular());
            ps.setBoolean(7, bombero.isEstado());
            ps.setString(8, bombero.getNombre_clave());
            ps.setInt(9, bombero.getDni());

            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El Bombero no existe");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero " + e.getMessage());
        }
    }

    public void EliminarBombero(String dni) {
        try {
            String SQL = "UPDATE bombero SET estado = 0 WHERE dni = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setString(1, dni);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se marcó el bombero como inactivo.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un bombero con este DNI.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero: " + e.getMessage());
        }
    }

    public Bombero BuscarBomberoPorDni(String dni) {
        Bombero bombero = null;
        String SQL = "SELECT * FROM bombero WHERE dni = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(SQL);
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();
            Brigada brg;
            if (rs.next()) {
                bombero = new Bombero();
                brg = new Brigada();
                bombero.setDni(rs.getInt("dni"));
                bombero.setId_bombero(rs.getInt("id_bombero"));
                bombero.setNombre(rs.getString("nombre"));
                bombero.setApellido(rs.getString("apellido"));
                bombero.setFecha_nacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
                bombero.setGrupo_sanguineo(rs.getString("grupo_sanguineo"));
                brg.setId_brigada(rs.getInt("id_brigada"));
                bombero.setBrigada(brg);
                bombero.setCelular(rs.getString("celular"));
                bombero.setEstado(rs.getBoolean("estado"));
                bombero.setNombre_clave(rs.getString("nombre_clave"));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró un bombero con este DNI.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero: " + ex);
        }
        return bombero;
    }

    public List<Bombero> ListarBomberos() {
        List<Bombero> bomberos = new ArrayList<>();

        try {
            String SQL = "SELECT * FROM bombero";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Bombero bombero = new Bombero();
                Brigada brigada = new Brigada();
                bombero.setId_bombero(rs.getInt("id_bombero"));
                bombero.setNombre(rs.getString("nombre"));
                bombero.setApellido(rs.getString("apellido"));
                bombero.setDni(rs.getInt("dni"));
                bombero.setFecha_nacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
                bombero.setGrupo_sanguineo(rs.getString("grupo_sanguineo"));
                brigada.setId_brigada(rs.getInt("id_brigada"));
                bombero.setBrigada(brigada);
                bombero.setCelular(rs.getString("celular"));
                bombero.setEstado(true);
                bombero.setNombre_clave(rs.getNString("nombre_clave"));
                bomberos.add(bombero);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero" + ex.getMessage());
        }
        return bomberos;
    }

    public List<Bombero> ListarBomberosPorBrigada(int id) {
        List<Bombero> bomberos = new ArrayList<>();

        try {

            String SQL = "SELECT * FROM bombero WHERE id_brigada = ?";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Bombero bombero = new Bombero();
                Brigada brigada = new Brigada();
                bombero.setId_bombero(rs.getInt("id_bombero"));
                bombero.setNombre(rs.getString("nombre"));
                bombero.setApellido(rs.getString("apellido"));
                bombero.setDni(rs.getInt("dni"));
                bombero.setFecha_nacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
                bombero.setGrupo_sanguineo(rs.getString("grupo_sanguineo"));
                brigada.setId_brigada(rs.getInt("id_brigada"));
                bombero.setBrigada(brigada);
                bombero.setCelular(rs.getString("celular"));
                bombero.setEstado(true);
                bombero.setNombre_clave(rs.getNString("nombre_clave"));
                bomberos.add(bombero);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero" + ex.getMessage());
        }
        return bomberos;
    }

}
