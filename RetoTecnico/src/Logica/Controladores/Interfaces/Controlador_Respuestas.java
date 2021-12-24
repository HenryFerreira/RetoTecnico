package Logica.Controladores.Interfaces;

import Logica.Entidades.Respuesta;
import java.util.List;

/**
 *
 * @author Haff
 */
public interface Controlador_Respuestas {
    //OBTENER TODOS LAS RESPUESTAS
    public List<Respuesta> getTodasLasPreguntasArte(Integer id);
}
