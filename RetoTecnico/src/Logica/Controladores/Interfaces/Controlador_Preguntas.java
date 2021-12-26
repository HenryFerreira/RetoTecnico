package Logica.Controladores.Interfaces;

import Logica.Entidades.Pregunta;
import java.util.List;

/**
 *
 * @author Haff
 */
public interface Controlador_Preguntas {

    //OBTENER TODOS LAS PREGUNTAS
    public List<Pregunta> getTodasLasPreguntas();

    //OBTENER TODOS LAS PREGUNTAS POR ID CATEGORIA
    public List<Pregunta> getPreguntasPorIdCategoria(Integer id);

    //ALTA PREGUNTA
    public Boolean altaPregunta(Integer idCategoria, String pregunta, String respuesta);
}
