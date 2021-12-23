package Logica.Controladores.Implementacion;

import Logica.Controladores.Interfaces.Controlador_Categorias;

/**
 *
 * @author Haff
 */
public class ImpControlador_Categorias implements Controlador_Categorias {
    private static ImpControlador_Categorias instance;

    //Obtener instancia de la IMPCONTROLADOR_CATEGORIAS
    public ImpControlador_Categorias getInstance() {
        if (null == instance) {
            instance = new ImpControlador_Categorias();
        }
        return instance;
    }
}
