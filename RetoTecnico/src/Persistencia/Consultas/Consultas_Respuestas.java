package Persistencia.Consultas;

/**
 *
 * @author Haff
 */
public class Consultas_Respuestas {

    //Obtener las RESPUESTAS de la PREGUNTA mediante su ID
    public final String getRespuestasPorIdPregunta = "SELECT DISTINCT R.* FROM respuestas R, preguntas P WHERE P.id = R.idPregunta AND P.id = ? ORDER BY RAND() LIMIT 5";
    public final String verificarRespuesta = "SELECT * FROM preguntas P WHERE P.respuesta = ?";

    public Consultas_Respuestas() {
    }

}
