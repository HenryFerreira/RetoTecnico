package Logica.Servicios.Implementacion;

import Logica.Servicios.Interfaces.Servicio_Preguntas;
import Persistencia.ConexionBD;

/**
 *
 * @author Haff
 */
public class ImpServicio_Preguntas implements Servicio_Preguntas {

    private static ImpServicio_Preguntas servicioPreguntas;
    private final ConexionBD conexion = new ConexionBD();

    public ImpServicio_Preguntas() {
    }
}
