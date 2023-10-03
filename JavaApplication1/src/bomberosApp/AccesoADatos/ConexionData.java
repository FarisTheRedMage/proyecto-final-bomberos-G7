package bomberosApp.AccesoADatos;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class ConexionData {

    private static final String URL = "jdcb:mariadb://localhost:3306/";
    private static final String DB = "1-bomberos";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";

    private static Connection connection;

    private ConexionData() {
    }

    public static Connection getConexion() {
        if (connection == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection=DriverManager.getConnection(URL+DB, USUARIO, PASSWORD);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos" + e.getMessage());
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null,"Error a cargar los drivers"+ ex);
            }}
        return connection;
    }
        
}