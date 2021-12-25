package Persistencia.Consultas;

/**
 *
 * @author Haff
 */
public class Consultas_Categorias {

    //Obtener una CATEGORIA de DIFICULTAD 1 --> Facil
    public final String categoriasFaciles = "SELECT DISTINCT * FROM categorias C WHERE C.dificultad = 1 ORDER BY RAND() LIMIT 2";
    //Obtener una CATEGORIA de DIFICULTAD 1 --> Nornal
    public final String categoriasNormales = "SELECT DISTINCT * FROM categorias C WHERE C.dificultad = 2 ORDER BY RAND() LIMIT 2";
    //Obtener una CATEGORIA de DIFICULTAD 1 --> Dificil
    public final String categoriasDificiles = "SELECT DISTINCT * FROM categorias C WHERE C.dificultad = 3 ORDER BY RAND() LIMIT 1";

}
