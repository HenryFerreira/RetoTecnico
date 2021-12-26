package Persistencia.Consultas;

/**
 *
 * @author Haff
 */
public class Consultas_Preguntas {

    //Obtener todas las Preguntas de la base de datos
    public final String todosLasPreguntas = "SELECT * FROM preguntas";
    //OBTENER PREGUNTAS SEGUN LA ID DE LA CATEGORIA SELECCIONADA
    public final String obtenerPreguntasPorIdCategoria = "SELECT DISTINCT P.*, C.nombre FROM preguntas P, categorias C WHERE C.id = P.idCategoria AND C.id = ? ORDER BY RAND() LIMIT 5";
    //INSERTAR PREGUNTA
    public final String altaPregunta = "INSERT INTO preguntas (idCategoria, pregunta, respuesta) VALUES (?, ?, ?)";
    //OBTENER UNA ID DE PREGUNTA MEDIANTE UNA PREGUNTA
    public final String getIdPreguntaPorPregunta = "SELECT * FROM preguntas P WHERE P.pregunta = ?;";
    
    public Consultas_Preguntas() {
    }
}
