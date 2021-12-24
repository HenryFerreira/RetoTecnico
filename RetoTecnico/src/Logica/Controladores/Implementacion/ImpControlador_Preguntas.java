package Logica.Controladores.Implementacion;

import Logica.Controladores.Interfaces.Controlador_Preguntas;

/**
 *
 * @author Haff
 */
public class ImpControlador_Preguntas implements Controlador_Preguntas {

    //Variable estatica implementada como instancia del controlador
    private static ImpControlador_Preguntas instance;

    //Obtener instancia de la IMPCONTROLADOR_PREGUNTAS
    public ImpControlador_Preguntas getInstance() {
        //Si la INSTANCIA es NULA
        if (null == instance) {//Se genera una nueva
            instance = new ImpControlador_Preguntas();
        }//Y se retorna
        return instance;
    }
}
