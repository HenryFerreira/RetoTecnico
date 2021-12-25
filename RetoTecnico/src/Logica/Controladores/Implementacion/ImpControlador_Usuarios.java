package Logica.Controladores.Implementacion;

import Logica.Controladores.Interfaces.Controlador_Usuarios;
import Logica.Entidades.Usuario;
import Logica.Servicios.Implementacion.ImpServicio_Usuarios;
import Logica.Servicios.Interfaces.Servicio_Usuarios;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Haff
 */
public class ImpControlador_Usuarios implements Controlador_Usuarios {

    //Variable estatica implementada como instancia del controlador
    private static ImpControlador_Usuarios instance;
    //Obtener instancia del SERVICIO DE USUARIOS
    private final Servicio_Usuarios usuarioServicio = new ImpServicio_Usuarios().getInstance();

    //Obtener instancia de la IMPCONTROLADOR_USUARIOS
    public ImpControlador_Usuarios getInstance() {
        //Si la INSTANCIA es NULA
        if (null == instance) {//Se genera una nueva
            instance = new ImpControlador_Usuarios();
        }//Y se retorna
        return instance;
    }

    @Override//Obtener todos los USUARIOS de la BD
    public List<Usuario> getTodosLosUsuarios() {
        //Se llama al SERVICIO DE USUARIOS para obtener los usuarios
        return usuarioServicio.getTodosLosUsuarios();
    }

    @Override//ALTA DE USUARIO
    public void altaUsuario(Usuario usuario) throws SQLException {
        //Verificar si se envio el parametro de nombre vasio
        if (!usuario.getNickname().isEmpty()) {
            usuarioServicio.altaUsuario(usuario);
        }
    }

    @Override//MODIFICAR PUNTOS DEL USUARIO
    public void modificarPuntos(Usuario usuario, Integer puntos) {
        //Verificar si los parametros son nulos
        if (usuario != null && puntos != null) {
            usuarioServicio.modificarPuntos(usuario, puntos);
        }
    }

    @Override//OBTENER USUARIO POR NICKNAME
    public Usuario getUsuarioPorNickname(String nickname) {
        //Verificar si los parametros son nulos
        if (!nickname.isEmpty()) {
            return usuarioServicio.getUsuarioPorNickname(nickname);
        }
        return null;
    }
}
