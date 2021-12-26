package Logica.Servicios.Interfaces;

import Logica.Entidades.Pregunta;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Haff
 */
public interface Servicio_Preguntas {

    //OBTENER TODOS LAS PREGUNTAS
    public List<Pregunta> getTodasLasPreguntas();

    //OBTENER TODOS LAS PREGUNTAS POR ID CATEGORIA
    public List<Pregunta> getPreguntasPorIdCategoria(Integer id);

    //ALTA PREGUNTA
    public void altaPregunta(Integer idCategoria, String pregunta, String respuesta)throws SQLException;
    
    //OBTENER ID DE PREGUNTA MEDIANTE UNA PREGUNTA
    public Pregunta getIdPreguntaPorPregunta(String pregunta);

}
