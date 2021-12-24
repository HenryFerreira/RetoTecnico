package Logica.Servicios.Implementacion;

import Logica.Entidades.Respuesta;
import Logica.Servicios.Interfaces.Servicio_Respuestas;
import Persistencia.ConexionBD;
import Persistencia.Consultas.Consultas_Respuestas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

/**
 *
 * @author Haff
 */
public class ImpServicio_Respuestas implements Servicio_Respuestas {

    //Variable estatica implementada como instancia del servicio
    private static ImpServicio_Respuestas instance;
    //Conexion a la base de datos
    private final ConexionBD conexion = new ConexionBD();
    //Consultas relacionadas con el RESPUESTAS
    private final Consultas_Respuestas consultasRespustas = new Consultas_Respuestas();

    //Obtener instancia de la IMPSERVICIO_RESPUESTAS
    public ImpServicio_Respuestas getInstance() {
        //Si la INSTANCIA es NULA
        if (null == instance) {//Se genera una nueva
            instance = new ImpServicio_Respuestas();
        }//Y se retorna
        return instance;
    }

    //Contructor por defecto
    public ImpServicio_Respuestas() {
    }

    //===================== OBTENER TODOS LAS RESPUESTAS =====================//
    @Override
    public List<Respuesta> getTodasLasPreguntasArte(Integer id) {
        List<Respuesta> respuestas = new ArrayList<>();//Lista de preguntas
        try {
            //Se realiza la consulta a la base de datos mediante la CONEXION antes creada
            PreparedStatement sentencia = conexion.getConexion().prepareStatement(consultasRespustas.getRespuestasPorIdPregunta);
            sentencia.setLong(1, id);
            ResultSet rs = sentencia.executeQuery();
            while (rs.next()) {
                respuestas.add(respuestaMapper(rs));//Se generan las respuestas
            }

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ImpServicio_Respuestas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return respuestas;
    }
    //===================== OBTENER TODOS LAS RESPUESTAS =====================//

    //===================== VERIFICAR RESPUESTA USUARIO ======================//
    @Override
    public Boolean verificarRespuesta(String respuesta) throws SQLException {
        //Se realiza la consulta a la base de datos mediante la CONEXION antes creada
        PreparedStatement sentencia = conexion.getConexion().prepareStatement(consultasRespustas.verificarRespuesta);
        sentencia.setString(1, respuesta);
        ResultSet rs = sentencia.executeQuery();
        while (rs.next()) {
            return true;
        }
        return false;
    }
    //===================== VERIFICAR RESPUESTA USUARIO ======================//

    //============================ MAPPER RESPUESTA ==========================//
    private Respuesta respuestaMapper(ResultSet rs) throws SQLException {
        try {//Con lo que se obtuvo de la consulta se genera un objeto USUARIO
            return new Respuesta(
                    rs.getInt("id"),
                    rs.getInt("idPregunta"),
                    rs.getString("respuesta")
            );
        } catch (SQLException ex) {
            throw new SQLException(ex.getMessage(), ex.getCause());
        }
    }
    //============================ MAPPER RESPUESTA ==========================//

}
