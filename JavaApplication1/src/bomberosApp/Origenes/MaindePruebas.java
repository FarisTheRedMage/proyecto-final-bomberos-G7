package bomberosApp.Origenes;

import bomberosApp.AccesoADatos.SiniestroData;
import bomberosApp.Entidades.Bombero;
import bomberosApp.Entidades.Brigada;
import bomberosApp.Entidades.Siniestro;
import java.time.LocalDate;
import java.util.List;

public class MaindePruebas {

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
//    //                  ----   Ver Bombero Guardado ----
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
//                         bombi2.ModificarBombero(bombero);
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
//--------------------------------------------------------Prueba ListarBomberos x ID Brigada FUNCA AHORA SI!!------------------------------------------------------------
//        BomberoData bombibis = new BomberoData();
//
//        List<Bombero> ListarBomberosxidbrig = bombibis.ListarBomberosPorBrigada(2);
//
//        if (!ListarBomberosxidbrig.isEmpty()) {
//            System.out.println("Lista de bomberos:");
//
//            for (Bombero bombero : ListarBomberosxidbrig) {
//                System.out.println("ID: " + bombero.getId_bombero());
//                System.out.println("Nombre: " + bombero.getNombre());
//                System.out.println("Apellido: " + bombero.getApellido());
//                System.out.println("DNI: " + bombero.getDni());
//                System.out.println("Fecha de Nacimiento: " + bombero.getFecha_nacimiento());
//                System.out.println("Grupo Sanguineo: " + bombero.getGrupo_sanguineo());
//                System.out.println("Celular: " + bombero.getCelular());
//                System.out.println("Estado: " + bombero.isEstado());
//                System.out.println("Nombre Clave: "+ bombero.getNombre_clave());
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
//----------------------------------------------------------------------------------------------------------------------------------------------------
//---------------------------------------------------Prueba BuscarCuartelPorId. FUNCA---------------------------------------------------      
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
//-----------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------Prueba ModificarCuartel FUNCA----------------------------------------------
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
//-----------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------Prueba EliminarCuartel FUNCA------------------------------------------------
//        CuartelData cuartelito = new CuartelData();
//        cuartelito.EliminarCuartel(3); 
//----------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------Prueba ListarCuartel - FUNCA ------------------------------------------------
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


//----------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------Prueba ListarBrigadasEnCuartel -  Funca ------------------------------------------------


//    BrigadaData brigadita = new BrigadaData();
//    List<Brigada> ListarBrigada = brigadita.ListarBrigadaPorCuartel(1);
//
//        if (!ListarBrigada.isEmpty()) {
//            System.out.println("Lista de Brigadas:");
//
//            for (Brigada brigadas : ListarBrigada) {
//                System.out.println("ID: " + brigadas.getId_brigada());
//                System.out.println("Nombre: " + brigadas.getNombre_brigada());
//                System.out.println("Especialidad: " + brigadas.getEspecialidad());
//                System.out.println("Estado: " + brigadas.isEstado());
//                System.out.println("Disponibilidad: " + brigadas.isDisponibilidad());
//                System.out.println("Cuartel: "+brigadas.getCuartel().getId_cuartel());
//                System.out.println("-----------------------------");
//            }
//        } else {
//            System.out.println("No hay Brigadas en la lista.");
//        }


//-----------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------Prueba GuardarBrigada - FUNCA --------------------------------------------
//        Brigada juan = new Brigada();                                             
//        BrigadaData b1 = new BrigadaData();                         
//        CuartelData cuartData = new CuartelData(); //--------------
//
//        Cuartel cuartel1 = cuartData.BuscarCuartelPorId(2);//--------------
//
//        
//        juan.setNombre_brigada("S.E.E.S.");
//        juan.setEspecialidad("Cazar Mounstruos");
//        juan.setEstado(true);
//        juan.setCuartel(cuartel1);
//       
//        
//        b1.GuardarBrigada(juan);
//
////                      ----   Ver Brigada Guardada ----
//
//            BrigadaData b2 = new BrigadaData();
//            Brigada BrigadaEncontrada = b2.BuscarBrigada(3);   //cambiar ID
//
//            if (BrigadaEncontrada != null) {
//                System.out.println("Brigada Encontrada: ");
//                
//                System.out.println("ID: " + BrigadaEncontrada.getId_brigada());
//                System.out.println("Nombre Brigada: " + BrigadaEncontrada.getNombre_brigada());
//                System.out.println("Especialidad: " + BrigadaEncontrada.getEspecialidad());
//                System.out.println("Estado: " + BrigadaEncontrada.isEstado());
//                System.out.println("Codigo Cuartel: " + BrigadaEncontrada.getCuartel().getId_cuartel());//------------
//                
//            } else {
//                System.out.println("No se encontró la Brigada. ");
//            }     
//-----------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------Prueba BuscarBrigada - FUNCA ----------------------------------------------
//            BrigadaData b2 = new BrigadaData();
//            Brigada BrigadaEncontrada = b2.BuscarBrigada(3);   //cambiar ID
//
//            if (BrigadaEncontrada != null) {
//                System.out.println("Brigada Encontrada: ");
//                
//                System.out.println("ID: " + BrigadaEncontrada.getId_brigada());
//                System.out.println("Nombre Brigada: " + BrigadaEncontrada.getNombre_brigada());
//                System.out.println("Especialidad: " + BrigadaEncontrada.getEspecialidad());
//                System.out.println("Estado: " + BrigadaEncontrada.isEstado());
//                System.out.println("Codigo Cuartel: " + BrigadaEncontrada.getCuartel().getId_cuartel());//------------
//                
//            } else {
//                System.out.println("No se encontró la Brigada. ");
//            }     
//-----------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------Prueba ModificarBrigada - FUNCA  ------------------------------------------
//
//                    BrigadaData bri = new BrigadaData();
//                    Brigada brigada = new Brigada();
//                    Cuartel cuartel = new Cuartel();
//                    
//                              brigada.setId_brigada(3);     
//                              brigada.setNombre_brigada("S.E.E.S.");
//                              brigada.setEspecialidad("Caza Bichos");
//                              brigada.setEstado(true);
//                              
//                              cuartel.setId_cuartel(2);//------------
//                                        
//                              brigada.setCuartel(cuartel);
//               
//                              bri.ModificarBrigada(brigada);
//-----------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------Prueba EliminarBrigada -FUNCA  ---------------------------------------------
//        BrigadaData brigadita = new BrigadaData();
//        brigadita.EliminarBrigada(1); 
//-----------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------Prueba ListarBrigadas -  --------------------------------------------------------
//    BrigadaData brigadita = new BrigadaData();
//
//        List<Brigada> ListarBrigada = brigadita.ListarBrigada();
//
//        if (!ListarBrigada.isEmpty()) {
//            System.out.println("Lista de Brigadas:");
//
//            for (Brigada brigadas : ListarBrigada) {
//                System.out.println("ID: " + brigadas.getId_brigada());
//                System.out.println("Nombre: " + brigadas.getNombre_brigada());
//                System.out.println("Direccion: " + brigadas.getEspecialidad());
//              System.out.println("Direccion: " + brigadas.getCuartel().getId_cuartel());
//                System.out.println("Estado: " + brigadas.isEstado());
//                System.out.println("-----------------------------");
//            }
//
//        } else {
//            System.out.println("No hay Brigadas en la lista.");
//        }
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------------------------------------------------------------------------------------------------------------------
//     BrigadaData brigii = new BrigadaData();
//        List<Brigada> ListarCuarteles = brigii.BomberosPorBrigada();
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
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------Prueba GuardarSiniestro-  FUNCA--------------------------------------------------------
//   
//        Siniestro s1 = new Siniestro();                                             
//        SiniestroData siniestrito = new SiniestroData();                       
//        BrigadaData brigiData = new BrigadaData(); //--------------
//        Brigada brigi2 = brigiData.BuscarBrigada(2);//--------------
//
//
//            s1.setCoord_X(123);
//            s1.setCoord_Y(112);
//            s1.setFecha_siniestro(LocalDate.of(2023, 10, 9));
//            s1.setTipo(TipoSiniestro.INCENDIO);
//            s1.setDetalles("Incendio en un edificio residencial.");
//            s1.setBrigada(brigi2);
//            
//            s1.setFecha_resolucion(LocalDate.of(2023, 10, 15)); 
//            
//            s1.setCalificacion(6);  //sin calificacion porque no termino
//            s1.setEstado(true);
//
//            siniestrito.GuardarSiniestro(s1);
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------Prueba BuscarSiniestro-  FUNCA------------------------------------------------------------
//
//            SiniestroData bombi = new SiniestroData();
//            Siniestro SiniestroEncontrado = bombi.BuscarSiniestroPorID(2);   //cambiar ID
//
//            if (SiniestroEncontrado != null) {
//                System.out.println("Siniestro encontrado:");
//                
//                System.out.println("ID Siniestro: " + SiniestroEncontrado.getId_siniestro());
//                System.out.println("Coordenada X: " + SiniestroEncontrado.getCoord_X());
//                System.out.println("Coordenada Y: " + SiniestroEncontrado.getCoord_Y());
//                System.out.println("Fecha de Inicio del Siniestro: " + SiniestroEncontrado.getFecha_siniestro());
//                System.out.println("Tipo de Siniestro: " + SiniestroEncontrado.getTipo().getIncidencia());
//                System.out.println("Detalles del Siniestro: " + SiniestroEncontrado.getDetalles());
//                System.out.println("Codigo Brigada: " + SiniestroEncontrado.getBrigada().getId_brigada());//--------------
//                System.out.println("Fecha de Resolucion del Siniestro: " + SiniestroEncontrado.getFecha_resolucion());
//                System.out.println("Calificacion: " + SiniestroEncontrado.getCalificacion());
//                System.out.println("Estado: " + SiniestroEncontrado.isEstado());
//                
//            } else {
//                System.out.println("No se encontró el Siniestro. ");
//            }     
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------            
//-------------------------------------------------------------Prueba ModificarSiniestro - FUNCA-----------------------------------------------------------           
//
//                         SiniestroData sin1 = new SiniestroData();
//                         Siniestro siniestro = new Siniestro();
//                         Brigada brigada = new Brigada();
//                         
//                      
//                         siniestro.setCoord_X(331);
//                         siniestro.setCoord_Y(211);
//                         siniestro.setFecha_siniestro(LocalDate.of(2023, 5, 15));
//                         siniestro.setTipo(TipoSiniestro.DERRUMBE);
//                         siniestro.setDetalles("Incendio en una Casa de la zona.");
//                         brigada.setId_brigada(2);//------------
//                         siniestro.setBrigada(brigada);
//                         siniestro.setFecha_resolucion(LocalDate.of(2023, 5, 16));
//                         siniestro.setCalificacion(3);
//                         siniestro.setEstado(true);
//                         siniestro.setId_siniestro(2);
//                         
//                         sin1.ModificarSiniestro(siniestro);
//
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------            
//-------------------------------------------------------------Prueba Siniestro - EliminarSiniestro-FUNCA------------------------------------------------            
//        SiniestroData siniestroD = new SiniestroData();
//        siniestroD.EliminarSiniestro(1); 
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------            
//-------------------------------------------------------------Prueba Siniestro -ListarSiniestro --------------------------------------------------------            

            SiniestroData siniestrito = new SiniestroData();
    
            List<Siniestro> ListarSiniestro = siniestrito.ListarSiniestro();
    
            if (!ListarSiniestro.isEmpty()) {
                System.out.println("Lista de Siniestros: ");
    
                for (Siniestro siniestro : ListarSiniestro) {
                    System.out.println("ID Siniestro: " + siniestro.getId_siniestro());
                    System.out.println("Coordenada X: " + siniestro.getCoord_X());
                    System.out.println("Coordenada Y: " + siniestro.getCoord_Y());  
                    System.out.println("Fecha Inicio de Siniestro: " + siniestro.getFecha_siniestro());
                    System.out.println("Tipo: " + siniestro.getTipo());
                    System.out.println("Detalles: " + siniestro.getDetalles());
                    System.out.println("Codigo de Brigada: " + siniestro.getBrigada().getId_brigada());//-----
                    System.out.println("Fecha de Resolucion: " + siniestro.getFecha_resolucion());
                    System.out.println("Calificacion: " + siniestro.getCalificacion());
                    System.out.println("Estado: " + siniestro.isEstado());
                    System.out.println("-----------------------------");
                }
    
            } else {
                System.out.println("No hay Siniestros en la lista.");
            }
//-----------------------------------------------------------------------------------------------------------------------------------------------
//------------------------------------------------------FIN SEGUNDA ENTREGA -------------------------------------------------------//
//        BrigadaData brigadaData = new BrigadaData();
//        BomberoData bomberoData = new BomberoData();
//
//        // obtener los bomberos de una brigada.
//        List<Bombero> bomberosEnBrigada = bomberoData.ListarBomberosEnBrigada(2); // id_brigada
//
//        // asignar nombres clave a los bomberos.
//        List<Bombero> bomberosRenombrados = brigadaData.RenombrarBomberosEnBrigada(1); // id_brigada
//
//        
//        
//        
//
//        System.out.println("Bomberos en la brigada:");
//        for (Bombero bombero : bomberosEnBrigada) {
//            System.out.println(" Nombre: " + bombero.getNombre() + "  Nombre Clave: " + bombero.getNombre_clave());
//        }
//        System.out.println("Bomberos renombrados en la brigada:");
//        for (Bombero bombero : bomberosRenombrados) {
//            System.out.println(" Nombre: " + bombero.getNombre() + "  Nombre Clave: " + bombero.getNombre_clave());
//        }


//-------------------------------------------------------------------------------------------------------
//probamos local date, para ordenar los siniestros:

//    public class Siniestro {
//    private Date fecha;
//
//    public Siniestro(Date fecha) {
//        this.fecha = fecha;
//    }
//
//    public Date getFecha() {
//        return fecha;
//    }

//    public static void main(String[] args) {

// Simulamos una lista de siniestros
//        List<Siniestro> siniestros = new ArrayList<>();

//        // Obtén la fecha actual
//        LocalDate fechaActual = LocalDate.now();
//
//        // Calcula la fecha del día anterior
//        LocalDate fechaAyer = fechaActual.minusDays(1);
//
//        // Filtra los siniestros del día actual y el día anterior
//        List<Siniestro> siniestrosDelDia = new ArrayList<>();
//        for (Siniestro siniestro : siniestros) {
//            LocalDate fechaSiniestro = siniestro.getFecha().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//            if (fechaSiniestro.isEqual(fechaActual) || fechaSiniestro.isEqual(fechaAyer)) {
//                siniestrosDelDia.add(siniestro);
//            }
//        }
//
//        // Ahora, 'siniestrosDelDia' contiene los siniestros del día actual y el día anterior
//        for (Siniestro siniestro : siniestrosDelDia) {
//            System.out.println("Fecha del siniestro: " + siniestro.getFecha());
//        }
//    }
//}
    }

}
