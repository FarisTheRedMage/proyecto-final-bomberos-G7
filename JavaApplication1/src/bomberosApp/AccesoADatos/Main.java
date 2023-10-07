package bomberosApp.AccesoADatos;

import bomberosApp.Entidades.Bombero;
import bomberosApp.Entidades.Brigada;
import bomberosApp.Entidades.Cuartel;
import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//------------------------------------------------------PRIMERA ENTREGA ---------------------------------------------------------------//
//--------------------------------------------Prueba GuardarBombero por id FUNCA----------------------------------------------------

//        Bombero juan = new Bombero();                                             
//        BomberoData bombi = new BomberoData();              //SALE VENTANA, pero se carga, MODIFICAR JOptionPane.             
//        BrigadaData brigiData = new BrigadaData(); //--------------
//
//        Brigada brigi2 = brigiData.BuscarBrigada(2);//--------------
//
//        juan.setNombre("Sonia");
//        juan.setApellido("Fernandez");
//        juan.setFecha_nacimiento(LocalDate.of(1990, 5, 15));
//        juan.setGrupo_sanguineo("0 - ");
//        juan.setDni("232123211"); 

//        juan.setBrigada(brigi2);//------------

//        juan.setCelular("223131223");
//        juan.setEstado(true);
//        juan.setId_bombero(1);
//
//        bombi.GuardarBombero(juan);

//                      ----   Ver Bombero Guardado ----

//            BomberoData bombi = new BomberoData();
//            Bombero BomberoEncontrado = bombi.BuscarBombero(10);   //cambiar ID
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
//                System.out.println("Codigo Brigada: " + BomberoEncontrado.getBrigada().getId_brigada());//--------------
//                System.out.println("Celular: " + BomberoEncontrado.getCelular());
//                System.out.println("Estado: " + BomberoEncontrado.isEstado());
//                
//            } else {
//                System.out.println("No se encontró el Personal. ");
//            }     

//-------------------------------------------------------------------------------------------------------------------------------------------------
//--------------------------------------------Prueba BuscarBombero por id FUNCA------------------------------------------------------

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
//            Brigada brigada = BomberoEncontrado.getBrigada();//--------------
//            System.out.println("Codigo de Brigada: " + brigada.getId_brigada());//--------------
//            
//            System.out.println("Celular: " + BomberoEncontrado.getCelular());
//            System.out.println("Estado: " + BomberoEncontrado.isEstado());
//
//        } else {
//            System.out.println("No se encontró el Personal.");
//        }

//-------------------------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------------Prueba ModificarBombero FUNCA----------------------------------------------
////
//                         BomberoData bombi2 = new BomberoData();
//                         Bombero bombero = new Bombero();
//                         Brigada brigada = new Brigada();
//                         
//                         bombero.setNombre("Rigoberto");
//                         bombero.setApellido("Chocolatoso");
//                         bombero.setFecha_nacimiento(LocalDate.of(1990, 5, 15));
//                         bombero.setGrupo_sanguineo("A+");
//
//                         brigada.setId_brigada(2);//------------
//                         
//                         bombero.setBrigada(brigada);
//
//                         bombero.setCelular("12321313");
//                         bombero.setEstado(true);
//                         bombero.setId_bombero(1);
//
//                         bombi2.ModificarBombero(bombero);// ESTABA MAL ORDEN DEL METODO XD
//                         
//-------------------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------Prueba EliminarBombero FUNCA---------------------------------------------------

//           BomberoData bombi = new BomberoData();
//           bombi.EliminarBombero(1); 
         
//-------------------------------------------------------------------------------------------------------------------------------------------------
//-----------------------------------------------Prueba BuscarBomberoPorDni FUNCA-------------------------------------------------- 
           
//           BomberoData bombi = new BomberoData();
//           Bombero BomberoEncontrado = bombi.BuscarBomberoPorDni(1111);
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
//                
//                Brigada brigada = BomberoEncontrado.getBrigada();//--------------
//                System.out.println("Codigo de Brigada: " + brigada.getId_brigada());//--------------
//                
//                System.out.println("Celular: " + BomberoEncontrado.getCelular());
//                System.out.println("Estado: " + BomberoEncontrado.isEstado());
//                
//            } else {
//                System.out.println("No se encontró el Personal. ");
//            } 

//-------------------------------------------------------------------------------------------------------------------------------------------------
//--------------------------------------------------------Prueba ListarBomberos------------------------------------------------------------

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

//-------------------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------SEGUNDA ENTREGA ---------------------------------------------------------------//
//------------------------------------------------Prueba metodo GuardarCuartel FUNCA-------------------------------------------------
//
//             Cuartel c1 = new Cuartel("Cuartel: Los Bomberitos.", "Goove ST", 11212, 31212, "2221111222", "groovesthome@gmail.com", true);
//             CuartelData cuart1 = new CuartelData();
//             cuart1.GuardarCuartel(c1);
//             
//
////                                 ----   Ver Cuartel Guardado ----
// 
//             CuartelData cuart2 = new CuartelData();
//             Cuartel CuartelEncontrado = cuart2.BuscarCuartelPorId(4); //Cambiar ID de cuartel 
//
//            if (CuartelEncontrado != null) {
//                System.out.println("Cuartel Encontrado:");
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

//-------------------------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------Prueba BuscarCuartelPorId. FUNCA--------------------------------------------------        

//    CuartelData cuartelito = new CuartelData();
//    Cuartel cuartelEncontrado = cuartelito.BuscarCuartelPorId(4);
//
//    if (cuartelEncontrado != null) {
//        
//        System.out.println("Cuartel encontrado:");
//        System.out.println("ID: " + cuartelEncontrado.getId_cuartel());
//        System.out.println("Nombre: " + cuartelEncontrado.getNombre_cuartel());
//        System.out.println("Dirección: " + cuartelEncontrado.getDireccion());
//        System.out.println("Coordenada X: " + cuartelEncontrado.getCoord_X());
//        System.out.println("Coordenada Y: " + cuartelEncontrado.getCoord_Y());
//        System.out.println("Teléfono: " + cuartelEncontrado.getTelefono());
//        System.out.println("Correo: " + cuartelEncontrado.getCorreo());
//        
//    } else {
//        System.out.println("No se encontró el Cuartel.");
//    }
    
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//-------------------------------------------------------------Prueba ModificarCuartel FUNCA-----------------------------------------------------------------

//        CuartelData cuartelito = new CuartelData();
//        Cuartel cuartel = new Cuartel();
//        
//        cuartel.setNombre_cuartel("Cuartel Zona Este");                                       
//        cuartel.setDireccion("Santa Clara ST");
//        cuartel.setCoord_X(10); 
//        cuartel.setCoord_Y(52); 
//        cuartel.setTelefono("7773662");
//        cuartel.setCorreo("cuartelzonaeste12@gmail.com");
//        cuartel.setEstado(true);
//        cuartel.setId_cuartel(3); 
//        
//        cuartelito.ModificarCuartel(cuartel);
        
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------Prueba EliminarCuartel FUNCA-------------------------------------------------------------------

//        CuartelData cuartelito = new CuartelData();
//        cuartelito.EliminarCuartel(3); 

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------Prueba ListarCuartel - FUNCA --------------------------------------------------------------------
        
//    CuartelData cuarteliwi = new CuartelData();
//
//        List<Cuartel> ListarCuarteles = cuarteliwi.ListarCuarteles();
//
//        if (!ListarCuarteles.isEmpty()) {
//            System.out.println("Lista de Cuarteles:");
//
//            for (Cuartel cuarteles : ListarCuarteles) {
//                System.out.println("ID: " + cuarteles.getId_cuartel());
//                System.out.println("Nombre: " + cuarteles.getNombre_cuartel());
//                System.out.println("Direccion: " + cuarteles.getDireccion());
//                System.out.println("Coordenada X: " + cuarteles.getCoord_X());
//                System.out.println("Coordenada Y: " + cuarteles.getCoord_Y());
//                System.out.println("Telefono: " + cuarteles.getTelefono());
//                System.out.println("Correo: " + cuarteles.getCorreo());
//                System.out.println("Estado: " + cuarteles.isEstado());
//                System.out.println("-----------------------------");
//            }
//
//        } else {
//            System.out.println("No hay Cuarteles en la lista.");
//        }

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------Prueba  -  --------------------------------------------------------------------



















    }
}
