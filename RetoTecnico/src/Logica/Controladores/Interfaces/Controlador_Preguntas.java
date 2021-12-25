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

    //OBTENER TODOS LAS PREGUNTAS DE GEOGRAFÍA
    public List<Pregunta> getTodasLasPreguntasGeografia();

    //OBTENER TODOS LAS PREGUNTAS DE HISTORIA
    public List<Pregunta> getTodasLasPreguntasHistoria();

    //OBTENER TODOS LAS PREGUNTAS DE CIENCIA
    public List<Pregunta> getTodasLasPreguntasCiencia();

    //OBTENER TODOS LAS PREGUNTAS DE DEPORTE
    public List<Pregunta> getTodasLasPreguntasDeporte();

    //OBTENER TODOS LAS PREGUNTAS DE ARTE
    public List<Pregunta> getTodasLasPreguntasArte();

    //OBTENER TODOS LAS PREGUNTAS POR ID CATEGORIA
    public List<Pregunta> getPreguntasPorIdCategoria(Integer id);
}
