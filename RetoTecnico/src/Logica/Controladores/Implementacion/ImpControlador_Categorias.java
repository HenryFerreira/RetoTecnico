package Logica.Controladores.Implementacion;

import Logica.Controladores.Interfaces.Controlador_Categorias;

/**
 *
 * @author Haff
 */
public class ImpControlador_Categorias implements Controlador_Categorias {

    //Variable estatica implementada como instancia del controlador
    private static ImpControlador_Categorias instance;

    //Obtener instancia de la IMPCONTROLADOR_CATEGORIAS
    public ImpControlador_Categorias getInstance() {
        //Si la INSTANCIA es NULA
        if (null == instance) {//Se genera una nueva
            instance = new ImpControlador_Categorias();
        }//Y se retorna
        return instance;
    }
}
