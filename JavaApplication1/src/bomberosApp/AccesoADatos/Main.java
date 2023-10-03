/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberosApp.AccesoADatos;

import bomberosApp.Entidades.Bombero;
import java.time.LocalDate;

/**
 *
 * @author faris
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bombero juan = new Bombero("Juan", "Castro", "12345678", LocalDate.of(1996,5,13), "A+", 2, "23112412", true);
         BomberoData bombi = new BomberoData();
         bombi.GuardarBombero(juan);
         System.out.println(bombi);
    }
    
}
