package bomberosApp.AccesoADatos;

import bomberosApp.Entidades.Brigada;
import bomberosApp.Entidades.Siniestro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class SiniestroData {

    private Connection con = null;
    private BrigadaData brigadaD = new BrigadaData();

    public SiniestroData() {
        con = ConexionData.getConexion();
    }

    public void GuardarSiniestro(Siniestro siniestro) {
        String SQL = "INSERT INTO siniestro (coord_X, coord_Y, fecha_siniestro, tipo, detalles, id_brigada, fecha_resolucion, calificacion, estado) VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);

            ps.setDouble(1, siniestro.getCoord_X());
            ps.setDouble(2, siniestro.getCoord_Y());
            ps.setDate(3, Date.valueOf(siniestro.getFecha_siniestro()));
            ps.setString(4, siniestro.getTipo());
            ps.setString(5, siniestro.getDetalles());

            if (siniestro.getBrigada() == null) {
                ps.setString(6, null);
            } else {
                ps.setInt(6, siniestro.getBrigada().getId_brigada());//----------
            }

            if (siniestro.getFecha_resolucion() != null) {
                ps.setDate(7, Date.valueOf(siniestro.getFecha_resolucion()));

            } else {
                ps.setNull(7, java.sql.Types.NULL);
            }
            ps.setInt(8, siniestro.getCalificacion());
            ps.setBoolean(9, siniestro.isEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                siniestro.setId_siniestro(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Siniestro agregado exitosamente");
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error a Acceder a la tabla Siniestro" + e.getMessage());
        }
    }

    public Siniestro BuscarSiniestroPorID(int id) {
        Siniestro siniestro = new Siniestro();
        String SQL = "SELECT * FROM siniestro WHERE id_siniestro = ?";

        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Brigada brg;

            if (rs.next()) {
                siniestro = new Siniestro();
                brg = new Brigada();
                siniestro.setId_siniestro(id);
                siniestro.setCoord_X(rs.getDouble("coord_X"));
                siniestro.setCoord_Y(rs.getDouble("coord_Y"));
                siniestro.setFecha_siniestro(rs.getDate("fecha_siniestro").toLocalDate());
                siniestro.setTipo(rs.getString("tipo"));
                siniestro.setDetalles(rs.getString("detalles"));
              
                int idBrigi = rs.getInt("id_brigada");
                if (!rs.wasNull()) {
                    brg = brigadaD.BuscarBrigada(rs.getInt("id_brigada"));
                    siniestro.setBrigada(brg);
                } else {
                    siniestro.setBrigada(null);
                }

                if (rs.getDate("fecha_resolucion") != null) {
                    siniestro.setFecha_resolucion(rs.getDate("fecha_resolucion").toLocalDate());
                    siniestro.setCalificacion(rs.getInt("calificacion"));
                } else {
                    siniestro.setFecha_resolucion(null);
                    siniestro.setCalificacion(0);
                }

                siniestro.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe el Siniestro");
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Siniestro: " + e.getMessage());
        }
        return siniestro;
    }

    public Siniestro BuscarSiniestro_ID_NUEVO(int id) {
        Siniestro siniestro = null;
        String SQL = "SELECT * FROM siniestro WHERE id_siniestro = ?";
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            ps = con.prepareStatement(SQL);
            ps.setInt(1, id);

            rs = ps.executeQuery();

            if (rs.next()) {
                siniestro = new Siniestro();
                siniestro.setId_siniestro(rs.getInt("id_siniestro"));
                siniestro.setCoord_X(rs.getDouble("coord_X"));
                siniestro.setCoord_Y(rs.getDouble("coord_Y"));
                siniestro.setFecha_siniestro(rs.getDate("fecha_siniestro").toLocalDate());
                siniestro.setTipo(rs.getString("tipo"));
                siniestro.setDetalles(rs.getString("detalles"));

                // Verificar si id_brigada es NULL antes de asignarlo a la brigada
                int idBrigada = rs.getInt("id_brigada");
                if (!rs.wasNull()) {
                    Brigada brigada = new Brigada();
                    brigada.setId_brigada(idBrigada);
                    siniestro.setBrigada(brigada);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No existe el Siniestro");
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Siniestro: " + e.getMessage());
        }

        return siniestro;
    }

    public void ModificarSiniestro(Siniestro siniestro) {
        String SQL = "UPDATE siniestro SET coord_X=?, coord_Y=?, fecha_siniestro=?, tipo=?, detalles=?, id_brigada=?, fecha_resolucion=?, calificacion=?, estado=? "
                + "WHERE id_siniestro = ?";

        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(SQL);
            ps.setDouble(1, siniestro.getCoord_X());
            ps.setDouble(2, siniestro.getCoord_Y());
            ps.setDate(3, Date.valueOf(siniestro.getFecha_siniestro()));
            ps.setString(4, siniestro.getTipo());
            ps.setString(5, siniestro.getDetalles());

            if (siniestro.getBrigada() == null) {
                ps.setString(6, null);
            } else {
                ps.setInt(6, siniestro.getBrigada().getId_brigada());//----------
            }

            // Configura fecha_resolucion y calificacion
            if (siniestro.getFecha_resolucion() != null) {
                ps.setDate(7, Date.valueOf(siniestro.getFecha_resolucion()));
                ps.setInt(8, siniestro.getCalificacion());
            } else {
                ps.setNull(7, Types.DATE);
                ps.setInt(8, 0);
            }
            ps.setBoolean(9, siniestro.isEstado());
            ps.setInt(10, siniestro.getId_siniestro());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El Siniestro no existe");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Siniestro" + ex.getMessage());
        }
    }

    public void EliminarSiniestro(int id) {
        try {
            String SQL = "UPDATE siniestro SET estado = 0 WHERE id_siniestro = ? ";

            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, id);

            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Se elimino el Siniestro. ");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Siniestro. " + e.getMessage());
        }
    }

    public List<Siniestro> ListarSiniestro() {
        List<Siniestro> siniestros = new ArrayList<>();

        try {
            String SQL = "SELECT * FROM siniestro";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Siniestro siniestro = new Siniestro();
                Brigada brigada = new Brigada();

                siniestro.setId_siniestro(rs.getInt("id_siniestro"));
                siniestro.setCoord_X(rs.getDouble("coord_X"));
                siniestro.setCoord_Y(rs.getDouble("coord_Y"));
                siniestro.setFecha_siniestro(rs.getDate("fecha_siniestro").toLocalDate());
                siniestro.setTipo(rs.getString("tipo"));
                siniestro.setDetalles(rs.getString("detalles"));
                brigada.setId_brigada(rs.getInt("id_brigada"));
                siniestro.setBrigada(brigada);
                if (rs.getDate("fecha_resolucion") != null) {
                    siniestro.setFecha_resolucion(rs.getDate("fecha_resolucion").toLocalDate());
                } else {
                    siniestro.setFecha_resolucion(null);
                }
                siniestro.setCalificacion(rs.getInt("calificacion"));
                siniestro.setEstado(rs.getBoolean("estado"));
                siniestros.add(siniestro);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Siniestro" + ex.getMessage());
        }
        return siniestros;
    }

}
