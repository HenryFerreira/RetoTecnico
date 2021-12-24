package Logica.Servicios.Interfaces;

import Logica.Entidades.Respuesta;
import java.util.List;

/**
 *
 * @author Haff
 */
public interface Servicio_Respuestas {
    //OBTENER TODOS LAS RESPUESTAS
    public List<Respuesta> getTodasLasPreguntasArte(Integer id);
}
