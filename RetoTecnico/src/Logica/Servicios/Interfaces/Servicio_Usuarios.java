package Logica.Servicios.Interfaces;

import Logica.Entidades.Usuario;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Haff
 */
public interface Servicio_Usuarios {

    //OBTENER TODOS LOS USUARIOS
    public List<Usuario> getTodosLosUsuarios();
    //ALTA DE USUARIO
    public void altaUsuario(Usuario usuario) throws SQLException;
    //MODIFICAR PUNTOS DEL USUARIO
    public void modificarPuntos(Usuario usuario,Integer puntos);
    //OBTENER USUARIO POR NICKNAME
    public Usuario getUsuarioPorNickname(String nickname);
}
