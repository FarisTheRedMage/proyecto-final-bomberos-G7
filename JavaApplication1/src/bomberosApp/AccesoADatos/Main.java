package bomberosApp.AccesoADatos;

import bomberosApp.Entidades.Bombero;
import bomberosApp.Entidades.Brigada;
import bomberosApp.Entidades.Cuartel;
import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//------------------------------------------------------PRIMERA ENTREGA --------------------------------------------------------------//
//bombero.getBrigada().getId_brigada();//-----
//--------------------------------------------Prueba GuardarBombero por id FUNCA----------------------------------------------------

             Bombero juan = new Bombero();
             BomberoData bombi = new BomberoData();
             BrigadaData brigi = new BrigadaData();
             Brigada brigi2 =new Brigada();
             
             brigi.BuscarBrigada(2);    
             brigi2.getId_brigada(brigi);
             
                juan.setNombre(" Walter");
                juan.setApellido("chocolatoso"); 
                juan.setFecha_nacimiento(LocalDate.of(1990,5,15)); 
                juan.setGrupo_sanguineo("A+"); 
                juan.getBrigada().getId_brigada();
                juan.setCelular("12321313"); 
                juan.setEstado(true); 
                juan.setId_bombero(1);
                bombi.GuardarBombero(juan);
             
             
//             Ver Bombero Guardado
//             BomberoData bombi = new BomberoData();
//            Bombero BomberoEncontrado = bombi.BuscarBombero(3);
//
//            if (BomberoEncontrado != null) {
//                System.out.println("Personal encontrado:");
//                
//                System.out.println("ID: " + BomberoEncontrado.getId_bombero());
//                System.out.println("Nombre: " + BomberoEncontrado.getNombre());
//                System.out.println("Apellido: " + BomberoEncontrado.getApellido());
//                System.out.println("DNI: " + BomberoEncontrado.getDni());
//                System.out.println("Fecha de Nacimiento: " + BomberoEncontrado.getFecha_nacimiento());
//                System.out.println("Grupo Sanguineo: " + BomberoEncontrado.getGrupo_sanguineo());
//                System.out.println("Codigo Brigada: " + BomberoEncontrado.getBrigada().getId_brigada());
//                System.out.println("Celular: " + BomberoEncontrado.getCelular());
//                System.out.println("Estado: " + BomberoEncontrado.isEstado());
//                
//            } else {
//                System.out.println("No se encontró el Personal. ");
//            }     
//---------------------------------------------------------------------------------------------------------------------------------------------------

//--------------------------------------------Prueba BuscarBombero por id FUNCA----------------------------------------------------

//        BomberoData bombi = new BomberoData();
//        Bombero BomberoEncontrado = bombi.BuscarBombero(2);
//
//        if (BomberoEncontrado != null) {
//            System.out.println("Personal encontrado:");
//
//            System.out.println("ID: " + BomberoEncontrado.getId_bombero());
//            System.out.println("Nombre: " + BomberoEncontrado.getNombre());
//            System.out.println("Apellido: " + BomberoEncontrado.getApellido());
//            System.out.println("DNI: " + BomberoEncontrado.getDni());
//            System.out.println("Fecha de Nacimiento: " + BomberoEncontrado.getFecha_nacimiento());
//            System.out.println("Grupo Sanguineo: " + BomberoEncontrado.getGrupo_sanguineo());
//
//            
//            Brigada brigada = BomberoEncontrado.getBrigada();
//            
//            if (brigada != null) {
//                System.out.println("Codigo de Brigada: " + brigada.getId_brigada());
//            } else {
//                System.out.println("Brigada no asignada.");
//            }
//
//            System.out.println("Celular: " + BomberoEncontrado.getCelular());
//            System.out.println("Estado: " + BomberoEncontrado.isEstado());
//
//        } else {
//            System.out.println("No se encontró el Personal.");
//        }
//---------------------------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------Prueba ModificarBombero-------------------------------------------------------

//                BomberoData bombi2 = new BomberoData();
//                Bombero bombero = new Bombero();
//                bombero.setNombre(" Walter");
//                bombero.setApellido("chocolatoso"); 
//                bombero.setFecha_nacimiento(LocalDate.of(1990,5,15)); 
//                bombero.setGrupo_sanguineo("A+"); 
//                bombero.getBrigada().getId_brigada();//-----
//                bombero.setCelular("12321313"); 
//                bombero.setEstado(true); 
//                bombero.setId_bombero(1);
//                bombi2.ModificarBombero(bombero);
//            Bombero BomberoEncontrado2 = bombi2.BuscarBombero(1);
//
//            if (BomberoEncontrado2 != null) {
//                System.out.println("Personal encontrado:");
//                
//                System.out.println("ID: " + BomberoEncontrado2.getId_bombero());
//                System.out.println("Nombre: " + BomberoEncontrado2.getNombre());
//                System.out.println("Apellido: " + BomberoEncontrado2.getApellido());
//                System.out.println("DNI: " + BomberoEncontrado2.getDni());
//                System.out.println("Fecha de Nacimiento: " + BomberoEncontrado2.getFecha_nacimiento());
//                System.out.println("Grupo Sanguineo: " + BomberoEncontrado2.getGrupo_sanguineo());
//                System.out.println("Codigo de Brigada: " + bombero.getBrigada().getId_brigada());//-----
//                System.out.println("Celular: " + BomberoEncontrado2.getCelular());
//                System.out.println("Estado: " + BomberoEncontrado2.isEstado());
//                
//            } else {
//                System.out.println("No se encontró el Personal. ");
//            } 
//---------------------------------------------------------------------------------------------------------------------------------------------------


//------------------------------------------------------Prueba EliminarBombero------------------------------------------------------------

//           BomberoData bombi = new BomberoData();
//           bombi.EliminarBombero(1); 
//         //Probamos Buscar x dni /// FUNCA. xD
//           BomberoData bombi = new BomberoData();
//            Bombero BomberoEncontrado = bombi.BuscarBomberoPorDni(1111);
//
//            if (BomberoEncontrado != null) {
//                System.out.println("Personal encontrado:");
//                
//                System.out.println("ID: " + BomberoEncontrado.getId_bombero());
//                System.out.println("Nombre: " + BomberoEncontrado.getNombre());
//                System.out.println("Apellido: " + BomberoEncontrado.getApellido());
//                System.out.println("DNI: " + BomberoEncontrado.getDni());
//                System.out.println("Fecha de Nacimiento: " + BomberoEncontrado.getFecha_nacimiento());
//                System.out.println("Grupo Sanguineo: " + BomberoEncontrado.getGrupo_sanguineo());
//                 System.out.println("Codigo de Brigada: " + bombero.getBrigada().getId_brigada());//-----
//                System.out.println("Celular: " + BomberoEncontrado.getCelular());
//                System.out.println("Estado: " + BomberoEncontrado.isEstado());
//                
//            } else {
//                System.out.println("No se encontró el Personal. ");
//            } 
//---------------------------------------------------------------------------------------------------------------------------------------------------

//--------------------------------------------------------Prueba ListarBomberos-----------------------------------------------------------

//        BomberoData bombibis = new BomberoData();
//
//        List<Bombero> ListarBomberos = bombibis.ListarBomberos();
//
//        if (!ListarBomberos.isEmpty()) {
//            System.out.println("Lista de bomberos:");
//
//            for (Bombero bombero : ListarBomberos) {
//                System.out.println("ID: " + bombero.getId_bombero());
//                System.out.println("Nombre: " + bombero.getNombre());
//                System.out.println("Apellido: " + bombero.getApellido());
//                System.out.println("DNI: " + bombero.getDni());
//                System.out.println("Fecha de Nacimiento: " + bombero.getFecha_nacimiento());
//                System.out.println("Grupo Sanguineo: " + bombero.getGrupo_sanguineo());
//                System.out.println("Codigo de Brigada: " + bombero.getBrigada().getId_brigada());//-----
//                System.out.println("Celular: " + bombero.getCelular());
//                System.out.println("Estado: " + bombero.isEstado());
//                System.out.println("-----------------------------");
//            }
//
//        } else {
//            System.out.println("No hay Personal en la lista.");
//        }
//---------------------------------------------------------------------------------------------------------------------------------------------------

//------------------------------------------------------SEGUNDA ENTREGA ---------------------------------------------------------------//

//------------------------------------------------Prueba metodo GuardarBombero-------------------------------------------------------

//             Cuartel c1 = new Cuartel("Cuartel General","Santa Cecilia ST ", 12, 14, "1234532", "cuartelgeneral@gmail.com");
//             CuartelData cuart1 = new CuartelData();
//             cuart1.GuardarCuartel(c1);
///////////////
//        
//             CuartelData cuart1 = new CuartelData();
//             Cuartel CuartelEncontrado = cuart1.BuscarCuartel(2);
//
//            if (CuartelEncontrado != null) {
//                System.out.println("Personal encontrado:");
//                
//                System.out.println("ID: " + CuartelEncontrado.getId_cuartel());
//                System.out.println("Nombre: " + CuartelEncontrado.getNombre_cuartel());
//                System.out.println("Direccion: " + CuartelEncontrado.getDireccion());
//                System.err.println("Coordenada X: " + CuartelEncontrado.getCoord_X());
//                System.err.println("Coordenada Y: " + CuartelEncontrado.getCoord_Y()); 
//                System.out.println("Telefono: " + CuartelEncontrado.getTelefono());
//                System.out.println("Correo: " + CuartelEncontrado.getCorreo());
//                
//            } else {
//                System.out.println("No se encontró el Cuartel. ");
//            }     
//---------------------------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------Prueba BuscarBombero por id - FUNCA.------------------------------------------        

        /*    BomberoData bombi = new BomberoData();
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
//---------------------------------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------------------------------
         */
    }
}
