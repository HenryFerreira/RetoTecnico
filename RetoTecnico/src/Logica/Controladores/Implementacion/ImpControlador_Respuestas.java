package Logica.Controladores.Implementacion;

import Logica.Controladores.Interfaces.Controlador_Respuestas;
import Logica.Entidades.Respuesta;
import Logica.Servicios.Implementacion.ImpServicio_Respuestas;
import Logica.Servicios.Interfaces.Servicio_Respuestas;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Haff
 */
public class ImpControlador_Respuestas implements Controlador_Respuestas {

    //Variable estatica implementada como instancia del controlador
    private static ImpControlador_Respuestas instance;
    //Obtener instancia del SERVICIO DE PREGUNTAS
    private final Servicio_Respuestas respuestasServicio = new ImpServicio_Respuestas().getInstance();

    //Obtener instancia de la IMPCONTROLADOR_RESPUESTAS
    public ImpControlador_Respuestas getInstance() {
        //Si la INSTANCIA es NULA
        if (null == instance) {//Se genera una nueva
            instance = new ImpControlador_Respuestas();
        }//Y se retorna
        return instance;
    }

    @Override//OBTENER TODOS LAS RESPUESTAS
    public List<Respuesta> getRespuestasPorIdPregunta(Integer id) {
        return respuestasServicio.getRespuestasPorIdPregunta(id);
    }

    @Override//VERIFICAR RESPUESTA USUARIO
    public Boolean verificarRespuesta(String respuesta) throws SQLException {
        return respuestasServicio.verificarRespuesta(respuesta);
    }

}
