package Logica.Servicios.Implementacion;

import Logica.Entidades.Pregunta;
import Logica.Servicios.Interfaces.Servicio_Preguntas;
import Persistencia.ConexionBD;
import Persistencia.Consultas.Consultas_Preguntas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Haff
 */
public class ImpServicio_Preguntas implements Servicio_Preguntas {

    //Variable estatica implementada como instancia del servicio
    private static ImpServicio_Preguntas instance;
    //Conexion a la base de datos
    private final ConexionBD conexion = new ConexionBD();
    //Consultas relacionadas con el USUARIO
    private final Consultas_Preguntas consultasPreguntas = new Consultas_Preguntas();

    //Obtener instancia de la IMPSERVICIO_PREGUNTAS
    public ImpServicio_Preguntas getInstance() {
        //Si la INSTANCIA es NULA
        if (null == instance) {//Se genera una nueva
            instance = new ImpServicio_Preguntas();
        }//Y se retorna
        return instance;
    }

    //Contructor por defecto
    public ImpServicio_Preguntas() {
    }

    //========================= OBTENER TODOS LAS PREGUNTAS ==================//
    @Override
    public List<Pregunta> getTodasLasPreguntas() {
        List<Pregunta> preguntas = new ArrayList<>();//Lista de preguntas
        try {
            //Se realiza la consulta a la base de datos mediante la CONEXION antes creada
            PreparedStatement sentencia = conexion.getConexion().prepareStatement(consultasPreguntas.todosLasPreguntas);
            ResultSet rs = sentencia.executeQuery();//Se obtiene la consulta
            while (rs.next()) {//Se recorre la consulta ontenida
                preguntas.add(preguntaMapper(rs));//Se generan los usuarios
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImpServicio_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return preguntas;
    }
    //========================= OBTENER TODOS LAS PREGUNTAS ==================//

    //============== OBTENER TODOS LAS PREGUNTAS DE GEOGRAFÍA ================//
    @Override
    public List<Pregunta> getTodasLasPreguntasGeografia() {
        List<Pregunta> preguntas = new ArrayList<>();//Lista de preguntas
        try {
            //Se realiza la consulta a la base de datos mediante la CONEXION antes creada
            PreparedStatement sentencia = conexion.getConexion().prepareStatement(consultasPreguntas.randomGeografia);
            ResultSet rs = sentencia.executeQuery();//Se obtiene la consulta
            while (rs.next()) {//Se recorre la consulta ontenida
                preguntas.add(preguntaMapper(rs));//Se generan los usuarios
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImpServicio_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return preguntas;
    }
    //============== OBTENER TODOS LAS PREGUNTAS DE GEOGRAFÍA ================//

    //=============== OBTENER TODOS LAS PREGUNTAS DE HISTORIA ================//
    @Override
    public List<Pregunta> getTodasLasPreguntasHistoria() {
        List<Pregunta> preguntas = new ArrayList<>();//Lista de preguntas
        try {
            //Se realiza la consulta a la base de datos mediante la CONEXION antes creada
            PreparedStatement sentencia = conexion.getConexion().prepareStatement(consultasPreguntas.randomHistoria);
            ResultSet rs = sentencia.executeQuery();//Se obtiene la consulta
            while (rs.next()) {//Se recorre la consulta ontenida
                preguntas.add(preguntaMapper(rs));//Se generan los usuarios
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImpServicio_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return preguntas;
    }
    //=============== OBTENER TODOS LAS PREGUNTAS DE HISTORIA ================//

    //=============== OBTENER TODOS LAS PREGUNTAS DE CIENCIA =================//
    @Override
    public List<Pregunta> getTodasLasPreguntasCiencia() {
        List<Pregunta> preguntas = new ArrayList<>();//Lista de preguntas
        try {
            //Se realiza la consulta a la base de datos mediante la CONEXION antes creada
            PreparedStatement sentencia = conexion.getConexion().prepareStatement(consultasPreguntas.randomCiencia);
            ResultSet rs = sentencia.executeQuery();//Se obtiene la consulta
            while (rs.next()) {//Se recorre la consulta ontenida
                preguntas.add(preguntaMapper(rs));//Se generan los usuarios
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImpServicio_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return preguntas;
    }
    //=============== OBTENER TODOS LAS PREGUNTAS DE CIENCIA =================//

    //=============== OBTENER TODOS LAS PREGUNTAS DE DEPORTE =================//
    @Override
    public List<Pregunta> getTodasLasPreguntasDeporte() {
        List<Pregunta> preguntas = new ArrayList<>();//Lista de preguntas
        try {
            //Se realiza la consulta a la base de datos mediante la CONEXION antes creada
            PreparedStatement sentencia = conexion.getConexion().prepareStatement(consultasPreguntas.randomDeporte);
            ResultSet rs = sentencia.executeQuery();//Se obtiene la consulta
            while (rs.next()) {//Se recorre la consulta ontenida
                preguntas.add(preguntaMapper(rs));//Se generan los usuarios
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImpServicio_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return preguntas;
    }
    //=============== OBTENER TODOS LAS PREGUNTAS DE DEPORTE =================//

    //================= OBTENER TODOS LAS PREGUNTAS DE ARTE ==================//
    @Override
    public List<Pregunta> getTodasLasPreguntasArte() {
        List<Pregunta> preguntas = new ArrayList<>();//Lista de preguntas
        try {
            //Se realiza la consulta a la base de datos mediante la CONEXION antes creada
            PreparedStatement sentencia = conexion.getConexion().prepareStatement(consultasPreguntas.randomArte);
            ResultSet rs = sentencia.executeQuery();//Se obtiene la consulta
            while (rs.next()) {//Se recorre la consulta ontenida
                preguntas.add(preguntaMapper(rs));//Se generan los usuarios
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImpServicio_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return preguntas;
    }
    //================= OBTENER TODOS LAS PREGUNTAS DE ARTE ==================//
    
    //============ OBTENER TODOS LAS PREGUNTAS POR ID CATEGORIA ==============//
    @Override
    public List<Pregunta> getPreguntasPorIdCategoria(Integer id) {
        List<Pregunta> preguntas = new ArrayList<>();//Lista de preguntas
        try {
            //Se realiza la consulta a la base de datos mediante la CONEXION antes creada
            PreparedStatement sentencia = conexion.getConexion().prepareStatement(consultasPreguntas.obtenerPreguntasPorIdCategoria);
            //Se le pasan los datos que necesita la consulta
            sentencia.setInt(1, id);
            ResultSet rs = sentencia.executeQuery();//Se obtiene la consulta
            
            
            //ResultSet rs = sentencia.executeQuery();//Se obtiene la consulta
            while (rs.next()) {//Se recorre la consulta ontenida
                preguntas.add(preguntaMapper(rs));//Se agregan los preguntas
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImpServicio_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return preguntas;
    }
    //============ OBTENER TODOS LAS PREGUNTAS POR ID CATEGORIA ==============//

    //============================= MAPPER PREGUNTA ==========================//
    private Pregunta preguntaMapper(ResultSet rs) throws SQLException {
        try {//Con lo que se obtuvo de la consulta se genera un objeto USUARIO
            return new Pregunta(
                    rs.getInt("id"),
                    rs.getInt("idCategoria"),
                    rs.getString("pregunta"),
                    rs.getString("respuesta")
            );
        } catch (SQLException ex) {
            throw new SQLException(ex.getMessage(), ex.getCause());
        }
    }
    //============================= MAPPER PREGUNTA ==========================//

}
