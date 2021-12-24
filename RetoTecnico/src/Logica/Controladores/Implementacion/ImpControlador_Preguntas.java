package Logica.Controladores.Implementacion;

import Logica.Controladores.Interfaces.Controlador_Preguntas;
import Logica.Entidades.Pregunta;
import Logica.Servicios.Implementacion.ImpServicio_Preguntas;
import Logica.Servicios.Interfaces.Servicio_Preguntas;
import java.util.List;

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
    
    //Obtener instancia del SERVICIO DE PREGUNTAS
    private final Servicio_Preguntas preguntaServicio = new ImpServicio_Preguntas().getInstance();

    @Override//OBTENER TODOS LAS PREGUNTAS
    public List<Pregunta> getTodasLasPreguntas() {
        //Se llama al SERVICIO DE PREGUNTAS para obtener las preguntas
        return preguntaServicio.getTodasLasPreguntas();
    }
}
