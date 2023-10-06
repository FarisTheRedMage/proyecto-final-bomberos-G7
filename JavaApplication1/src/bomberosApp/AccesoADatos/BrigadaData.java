package bomberosApp.AccesoADatos;

import bomberosApp.Entidades.Bombero;
import bomberosApp.Entidades.Brigada;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class BrigadaData {
    
     private Connection con = null;
     
    public BrigadaData() {
        con = ConexionData.getConexion();
    }
//probar en main
    
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

        String SQL = "SELECT * FROM bombero WHERE id_bombero=? and estado=1";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(SQL);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                brigada = new Brigada();
                brigada.setId_brigada(id);
                brigada.setNombre_brigada(rs.getString("nombre_brigada"));
                brigada.setEspecialidad(rs.getString("especialidad"));
                brigada.setEstado(rs.getBoolean("estado"));//
                brigada.getCuartel().setId_cuartel(rs.getInt("id_cuartel"));

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
    
    
    
    
    
    
    
}
