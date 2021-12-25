package Persistencia.Consultas;

/**
 *
 * @author Haff
 */
public class Consultas_Preguntas {

    //Obtener todas las Preguntas de la base de datos
    public final String todosLasPreguntas = "SELECT * FROM preguntas";

    //Obtener las Preguntas de forma aleatoria de GEOGRAFÍA
    public final String randomGeografia = "SELECT DISTINCT P.* FROM preguntas P, categorias C WHERE C.id = P.idCategoria AND C.id = ? ORDER BY RAND() LIMIT 5";
    //Obtener las Preguntas de forma aleatoria de HISTORIA
    public final String randomHistoria = "SELECT DISTINCT P.* FROM preguntas P, categorias C WHERE  C.id = P.idCategoria AND C.id = 2 ORDER BY RAND() LIMIT 5";
    //Obtener las Preguntas de forma aleatoria de CIENCIA
    public final String randomCiencia = "SELECT DISTINCT P.* FROM preguntas P, categorias C WHERE  C.id = P.idCategoria AND C.id = 3 ORDER BY RAND() LIMIT 5";
    //Obtener las Preguntas de forma aleatoria de DEPORTE
    public final String randomDeporte = "SELECT DISTINCT P.* FROM preguntas P, categorias C WHERE  C.id = P.idCategoria AND C.id = 4 ORDER BY RAND() LIMIT 5";
    //Obtener las Preguntas de forma aleatoria de ARTE
    public final String randomArte = "SELECT DISTINCT P.* FROM preguntas P, categorias C WHERE C.id = P.idCategoria AND C.id = 5 ORDER BY RAND() LIMIT 5";

    public final String obtenerPreguntasPorIdCategoria = "SELECT DISTINCT P.* FROM preguntas P, categorias C WHERE C.id = P.idCategoria AND C.id = ? ORDER BY RAND() LIMIT 5";

    public Consultas_Preguntas() {
    }
}
