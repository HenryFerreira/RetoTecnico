package Logica.Servicios.Implementacion;

import Logica.Servicios.Interfaces.Servicio_Usuarios;
import Persistencia.ConexionBD;

/**
 *
 * @author Haff
 */
public class ImpServicio_Usuarios implements Servicio_Usuarios{

    private static ImpServicio_Usuarios servicioUsuarios;
    private final ConexionBD conexion = new ConexionBD();

    public ImpServicio_Usuarios() {
    }
}
