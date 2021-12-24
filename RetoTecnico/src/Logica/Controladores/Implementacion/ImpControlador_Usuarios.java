package Logica.Controladores.Implementacion;

import Logica.Controladores.Interfaces.Controlador_Usuarios;
import Logica.Entidades.Usuario;
import Logica.Servicios.Implementacion.ImpServicio_Usuarios;
import Logica.Servicios.Interfaces.Servicio_Usuarios;
import java.util.List;

/**
 *
 * @author Haff
 */
public class ImpControlador_Usuarios implements Controlador_Usuarios {

    //Variable estatica implementada como instancia del controlador
    private static ImpControlador_Usuarios instance;

    //Obtener instancia de la IMPCONTROLADOR_USUARIOS
    public ImpControlador_Usuarios getInstance() {
        //Si la INSTANCIA es NULA
        if (null == instance) {//Se genera una nueva
            instance = new ImpControlador_Usuarios();
        }//Y se retorna
        return instance;
    }
    //Obtener instancia del SERVICIO DE USUARIOS
    private final Servicio_Usuarios usuarioServicio = new ImpServicio_Usuarios().getInstance();

    @Override//Obtener todos los USUARIOS de la BD
    public List<Usuario> getTodosLosUsuarios() {
        //Se llama al SERVICIO DE USUARIOS para obtener los usuarios
        return usuarioServicio.getTodosLosUsuarios();
    }
}
