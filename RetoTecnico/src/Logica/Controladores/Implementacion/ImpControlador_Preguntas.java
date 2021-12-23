package Logica.Controladores.Implementacion;

import Logica.Controladores.Interfaces.Controlador_Preguntas;

/**
 *
 * @author Haff
 */
public class ImpControlador_Preguntas implements Controlador_Preguntas{
    private static ImpControlador_Preguntas instance;

    //Obtener instancia de la IMPCONTROLADOR_PREGUNTAS
    public ImpControlador_Preguntas getInstance() {
        if (null == instance) {
            instance = new ImpControlador_Preguntas();
        }
        return instance;
    }
}
