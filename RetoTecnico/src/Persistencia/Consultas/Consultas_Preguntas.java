package Persistencia.Consultas;

/**
 *
 * @author Haff
 */
public class Consultas_Preguntas {

    //Obtener todas las Preguntas de la base de datos
    public final String todosLasPreguntas = "SELECT * FROM preguntas";
    //Obtener las Preguntas de forma aleatoria
    public final String preguntasRandom = "SELECT DISTINCT P.pregunta FROM preguntas P WHERE P.IdPregunta = 1 ORDER BY RAND() LIMIT 5;";

    public Consultas_Preguntas() {
    }
}
