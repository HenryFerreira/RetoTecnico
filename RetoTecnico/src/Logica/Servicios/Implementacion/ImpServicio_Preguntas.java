package Logica.Servicios.Implementacion;

import Logica.Servicios.Interfaces.Servicio_Preguntas;
import Persistencia.ConexionBD;

/**
 *
 * @author Haff
 */
public class ImpServicio_Preguntas implements Servicio_Preguntas {

    //Variable estatica implementada como instancia del servicio
    private static ImpServicio_Preguntas instance;
    //Conexion a la base de datos
    private final ConexionBD conexion = new ConexionBD();

    //Obtener instancia de la IMPSERVICIO_PREGUNTAS
    public ImpServicio_Preguntas getInstance() {
        //Si la INSTANCIA es NULA
        if (null == instance) {//Se genera una nueva
            instance = new ImpServicio_Preguntas();
        }//Y se retorna
        return instance;
    }

    //Contructor por defecto
    public ImpServicio_Preguntas() {
    }
}
