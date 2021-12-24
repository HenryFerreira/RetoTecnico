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
}
