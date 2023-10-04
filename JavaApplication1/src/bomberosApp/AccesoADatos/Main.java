package bomberosApp.AccesoADatos;

import bomberosApp.Entidades.Bombero;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
          /*
          //Prueba metodo GuardarBombero - FUNCA.
             Bombero juan = new Bombero("Juan", "Castro", "12345678", LocalDate.of(1996,5,13), "A+", 2, "23112412", true);
             BomberoData bombi = new BomberoData();
             bombi.GuardarBombero(juan);
        
             BomberoData bombi = new BomberoData();
            Bombero BomberoEncontrado = bombi.BuscarBombero(1);

            if (BomberoEncontrado != null) {
                System.out.println("Personal encontrado:");
                
                System.out.println("ID: " + BomberoEncontrado.getId_bombero());
                System.out.println("Nombre: " + BomberoEncontrado.getNombre());
                System.out.println("Apellido: " + BomberoEncontrado.getApellido());
                System.out.println("DNI: " + BomberoEncontrado.getDni());
                System.out.println("Fecha de Nacimiento: " + BomberoEncontrado.getFecha_nacimiento());
                System.out.println("Grupo Sanguineo: " + BomberoEncontrado.getGrupo_sanguineo());
                System.out.println("Codigo Brigada: " + BomberoEncontrado.getCodigo_brigada());
                System.out.println("Celular: " + BomberoEncontrado.getCelular());
                System.out.println("Estado: " + BomberoEncontrado.isEstado());
                
            } else {
                System.out.println("No se encontró el Personal. ");
            }     
         */
         
          //Prueba BuscarBombero por id - FUNCA
          
            BomberoData bombi = new BomberoData();
            Bombero BomberoEncontrado = bombi.BuscarBombero(1);

            if (BomberoEncontrado != null) {
                System.out.println("Personal encontrado:");
                
                System.out.println("ID: " + BomberoEncontrado.getId_bombero());
                System.out.println("Nombre: " + BomberoEncontrado.getNombre());
                System.out.println("Apellido: " + BomberoEncontrado.getApellido());
                System.out.println("DNI: " + BomberoEncontrado.getDni());
                System.out.println("Fecha de Nacimiento: " + BomberoEncontrado.getFecha_nacimiento());
                System.out.println("Grupo Sanguineo: " + BomberoEncontrado.getGrupo_sanguineo());
                System.out.println("Codigo Brigada: " + BomberoEncontrado.getCodigo_brigada());
                System.out.println("Celular: " + BomberoEncontrado.getCelular());
                System.out.println("Estado: " + BomberoEncontrado.isEstado());
                
            } else {
                System.out.println("No se encontró el Personal. ");
            } 
          
          
           //Prueba ModificarBombero
           
                BomberoData bombi2 = new BomberoData();
                Bombero bombero = new Bombero();
                bombero.setNombre("rigoberto");
                bombero.setApellido("chocolatoso"); 
                bombero.setFecha_nacimiento(LocalDate.of(1990,5,15)); 
                bombero.setGrupo_sanguineo("A+"); 
                bombero.setCodigo_brigada(2); 
                bombero.setCelular("12321313"); 
                bombero.setEstado(true); 
                bombero.setId_bombero(1);
                bombi2.ModificarBombero(bombero);
                
                
                 Bombero BomberoEncontrado2 = bombi2.BuscarBombero(1);

            if (BomberoEncontrado2 != null) {
                System.out.println("Personal encontrado:");
                
                System.out.println("ID: " + BomberoEncontrado2.getId_bombero());
                System.out.println("Nombre: " + BomberoEncontrado2.getNombre());
                System.out.println("Apellido: " + BomberoEncontrado2.getApellido());
                System.out.println("DNI: " + BomberoEncontrado2.getDni());
                System.out.println("Fecha de Nacimiento: " + BomberoEncontrado2.getFecha_nacimiento());
                System.out.println("Grupo Sanguineo: " + BomberoEncontrado2.getGrupo_sanguineo());
                System.out.println("Codigo Brigada: " + BomberoEncontrado2.getCodigo_brigada());
                System.out.println("Celular: " + BomberoEncontrado2.getCelular());
                System.out.println("Estado: " + BomberoEncontrado2.isEstado());
                
            } else {
                System.out.println("No se encontró el Personal. ");
            } 
    }          
}
