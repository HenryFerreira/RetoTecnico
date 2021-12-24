package Logica.Controladores.Interfaces;

import Logica.Entidades.Usuario;
import java.util.List;

/**
 *
 * @author Haff
 */
public interface Controlador_Usuarios {

    //Obtener todos los USUARIOS de la BD
    public List<Usuario> getTodosLosUsuarios();
    //ALTA DE USUARIO
    public void altaUsuario(Usuario usuario);
    //MODIFICAR PUNTOS DEL USUARIO
    public void modificarPuntos(Usuario usuario,Integer puntos);
    //OBTENER USUARIO POR NICKNAME
    public Usuario getUsuarioPorNickname(String nickname);
}
