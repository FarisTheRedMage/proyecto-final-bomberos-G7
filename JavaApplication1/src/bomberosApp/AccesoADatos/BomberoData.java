package bomberosApp.AccesoADatos;

import bomberosApp.Entidades.Bombero;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;


public class BomberoData {

    private Connection con = null;

    public BomberoData() {
        con = ConexionData.getConexion();
    }

    public void GuardarBombero(Bombero bombero) {
        String SQL = "INSERT INTO bombero (nombre, apellido, dni, fecha_nacimiento, grupo_sanguineo, codigo_brigada, celular, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, bombero.getNombre());
            ps.setString(2, bombero.getApellido());
            ps.setString(3, bombero.getDni());
            ps.setDate(4, Date.valueOf(bombero.getFecha_nacimiento()));
            ps.setString(5, bombero.getGrupo_sanguineo());
            ps.setInt(6, bombero.getCodigo_brigada());
            ps.setString(7, bombero.getCelular());
            ps.setBoolean(8, bombero.isEstado());
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

        String SQL = "SELECT * FROM bombero WHERE id_bombero=? and estado=1";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(SQL);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                bombero = new Bombero();
                bombero.setId_bombero(id);
                bombero.setNombre(rs.getString("nombre"));
                bombero.setApellido(rs.getString("apellido"));
                bombero.setDni(rs.getString("dni"));
                bombero.setFecha_nacimiento(rs.getDate("fecha_nacimiento").toLocalDate());
                bombero.setGrupo_sanguineo(rs.getString("grupo_sanguineo"));
                bombero.setCodigo_brigada(rs.getInt("codigo_brigada"));
                bombero.setCelular(rs.getString("celular"));

                bombero.setEstado(rs.getBoolean("estado"));//

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
        
        String SQL = " UPDATE bombero SET nombre = ?, apellido = ?"
                         + " fecha_nacimiento = ?, grupo_sanguineo = ?, codigo_brigada = ?, celular = ?, estado = ? ";
                    

        PreparedStatement ps = null;
        try {
            
            ps=con.prepareStatement(SQL);
            
            ps.setString(1, bombero.getNombre());
            ps.setString(2, bombero.getApellido());
            ps.setDate(3, Date.valueOf(bombero.getFecha_nacimiento()));
            ps.setString(4, bombero.getGrupo_sanguineo());
            ps.setInt(5, bombero.getCodigo_brigada());
             ps.setString(6, bombero.getCelular());
            ps.setBoolean(7, bombero.isEstado());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El Bombero no existe");
            } 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Bombero " +e.getMessage());
        }
        
    }
    
    public void EliminarBombero(int id){
        
        try {
            String SQL="UPDATE bombero SET estado = 0 WHERE id_bombero = ? ";
            PreparedStatement ps = con.prepareStatement(SQL);
            
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            
            if (fila == 1) {
                JOptionPane.showMessageDialog(null,"Se elimino el Bombero. ");
            }
            
            ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Bombero. "+ e.getMessage());
        }
        
        
        
    }
    
}
