package Logica.Controladores.Implementacion;

import Logica.Controladores.Interfaces.Controlador_Usuarios;

/**
 *
 * @author Haff
 */
public class ImpControlador_Usuarios implements Controlador_Usuarios {

    private static ImpControlador_Usuarios instance;

    //Obtener instancia de la IMPCONTROLADOR_USUARIOS
    public ImpControlador_Usuarios getInstance() {
        if (null == instance) {
            instance = new ImpControlador_Usuarios();
        }
        return instance;
    }
}
