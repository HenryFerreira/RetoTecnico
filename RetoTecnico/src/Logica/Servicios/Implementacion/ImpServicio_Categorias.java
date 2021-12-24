package Logica.Servicios.Implementacion;

import Logica.Servicios.Interfaces.Servicio_Categorias;
import Persistencia.ConexionBD;

/**
 *
 * @author Haff
 */
public class ImpServicio_Categorias implements Servicio_Categorias {

    //Variable estatica implementada como instancia del servicio
    private static ImpServicio_Categorias instance;
    //Conexion a la base de datos
    private final ConexionBD conexion = new ConexionBD();

    //Obtener instancia de la IMPSERVICIO_CATEGORIAS
    public ImpServicio_Categorias getInstance() {
        //Si la INSTANCIA es NULA
        if (null == instance) {//Se genera una nueva
            instance = new ImpServicio_Categorias();
        }//Y se retorna
        return instance;
    }

    //Contructor por defecto
    public ImpServicio_Categorias() {
    }

}
