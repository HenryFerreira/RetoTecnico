package Logica.Controladores.Implementacion;

import Logica.Controladores.Interfaces.Controlador_Preguntas;
import Logica.Entidades.Pregunta;
import Logica.Servicios.Implementacion.ImpServicio_Preguntas;
import Logica.Servicios.Interfaces.Servicio_Preguntas;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Haff
 */
public class ImpControlador_Preguntas implements Controlador_Preguntas {

    //Variable estatica implementada como instancia del controlador
    private static ImpControlador_Preguntas instance;
    //Obtener instancia del SERVICIO DE PREGUNTAS
    private final Servicio_Preguntas preguntaServicio = new ImpServicio_Preguntas().getInstance();

    //Obtener instancia de la IMPCONTROLADOR_PREGUNTAS
    public ImpControlador_Preguntas getInstance() {
        //Si la INSTANCIA es NULA
        if (null == instance) {//Se genera una nueva
            instance = new ImpControlador_Preguntas();
        }//Y se retorna
        return instance;
    }

    @Override//OBTENER TODOS LAS PREGUNTAS
    public List<Pregunta> getTodasLasPreguntas() {
        //Se llama al SERVICIO DE PREGUNTAS para obtener las preguntas
        return preguntaServicio.getTodasLasPreguntas();
    }

    @Override//OBTENER TODOS LAS PREGUNTAS POR ID CATEGORIA
    public List<Pregunta> getPreguntasPorIdCategoria(Integer id) {
        //Se llama al SERVICIO DE PREGUNTAS para obtener las preguntas
        return preguntaServicio.getPreguntasPorIdCategoria(id);
    }

    @Override
    public void altaPregunta(Integer idCategoria, String pregunta, String respuesta) throws SQLException{
        //Se llama al SERVICIO DE PREGUNTAS para hacer el alta
        preguntaServicio.altaPregunta(idCategoria, pregunta, respuesta);
    }

    @Override
    public Pregunta getIdPreguntaPorPregunta(String pregunta) {
        if (!pregunta.isEmpty()) {
            return preguntaServicio.getIdPreguntaPorPregunta(pregunta);
        }
        return null;
    }

    @Override
    public Boolean verificarPregunta(Integer idCategoria, String pregunta, String respuesta) {
        //SE VERIFICA QUE NO ESTEN VASIOS LOS PARAMETROS
        if (idCategoria != null && !pregunta.isEmpty() && !respuesta.isEmpty()) {
            return true;
        }
        return false;
    }
}
