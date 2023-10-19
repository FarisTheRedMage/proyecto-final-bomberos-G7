package bomberosApp.Origenes;

import bomberosApp.Entidades.Bombero;
import bomberosApp.Entidades.Brigada;
import bomberosApp.Entidades.Cuartel;
import bomberosApp.Entidades.Siniestro;
import bomberosApp.Vistas.disenioGestionBomberosApp;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        
          disenioGestionBomberosApp miapp=new disenioGestionBomberosApp();
          miapp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          miapp.setLocationRelativeTo(null);
          miapp.setVisible(true);
    }
}
