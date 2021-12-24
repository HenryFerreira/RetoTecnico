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
}
