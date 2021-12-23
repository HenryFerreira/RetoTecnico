package Logica.Servicios.Implementacion;

import Logica.Servicios.Interfaces.Servicio_Categorias;
import Persistencia.ConexionBD;

/**
 *
 * @author Haff
 */
public class ImpServicio_Categorias implements Servicio_Categorias {

    private static ImpServicio_Categorias servicioCategorias;
    private final ConexionBD conexion = new ConexionBD();

    public ImpServicio_Categorias() {
    }

}
