package Logica.Servicios.Implementacion;

import Logica.Entidades.Usuario;
import Logica.Servicios.Interfaces.Servicio_Usuarios;
import Persistencia.ConexionBD;
import Persistencia.Consultas.Consultas_Usuarios;
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
public class ImpServicio_Usuarios implements Servicio_Usuarios {

    //Variable estatica implementada como instancia del servicio
    private static ImpServicio_Usuarios instance;
    //Conexion a la base de datos
    private final ConexionBD conexion = new ConexionBD();
    //Consultas relacionadas con el USUARIO
    private final Consultas_Usuarios consultasUsuarios = new Consultas_Usuarios();

    //Obtener instancia de la IMPSERVICIO_USUARIOS
    public ImpServicio_Usuarios getInstance() {
        //Si la INSTANCIA es NULA
        if (null == instance) {//Se genera una nueva
            instance = new ImpServicio_Usuarios();
        }//Y se retorna
        return instance;
    }

    //Contructor por defecto
    public ImpServicio_Usuarios() {
    }

    //========================== OBTENER TODOS LOS USUARIOS ==================//
    @Override
    public List<Usuario> getTodosLosUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();//Lista de usuarios
        try {
            //Se realiza la consulta a la base de datos mediante la CONEXION antes creada
            PreparedStatement sentencia = conexion.getConexion().prepareStatement(consultasUsuarios.todosLosUsuarios);
            ResultSet rs = sentencia.executeQuery();//Se obtiene la consulta
            while (rs.next()) {//Se recorre la consulta ontenida
                usuarios.add(usuarioMapper(rs));//Se generan los usuarios
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImpServicio_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuarios;
    }
    //========================== OBTENER TODOS LOS USUARIOS ==================//

    //============================= MAPPER USUARIO ===========================//
    private Usuario usuarioMapper(ResultSet rs) throws SQLException {
        try {//Con lo que se obtuvo de la consulta se genera un objeto USUARIO
            return new Usuario(rs.getInt("id"), rs.getString("nombre"), rs.getInt("puntos"));
        } catch (SQLException ex) {
            throw new SQLException(ex.getMessage(), ex.getCause());
        }
    }
    //============================ MAPPER USUARIO ============================//
}
