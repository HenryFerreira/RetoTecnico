package Logica.Controladores.Interfaces;

import Logica.Entidades.Respuesta;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Haff
 */
public interface Controlador_Respuestas {

    //OBTENER TODOS LAS RESPUESTAS
    public List<Respuesta> getRespuestasPorIdPregunta(Integer id);

    //VERIFICAR RESPUESTA USUARIO
    public Boolean verificarRespuestaUsuario(String respuesta) throws SQLException;
    
    //ALTA DE RESPUESTA
    public void altaRespuesta(Integer idPregunta, String respuesta);
    
    //VERIFICAR PREGUNTAS
    public Boolean verificarRespuesta(String respuesta1,String respuesta2,String respuesta3);
}
