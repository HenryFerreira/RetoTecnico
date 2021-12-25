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
    //Obtener instancia del SERVICIO DE PREGUNTAS
    private final Servicio_Preguntas preguntaServicio = new ImpServicio_Preguntas().getInstance();

    //Obtener instancia de la IMPCONTROLADOR_PREGUNTAS
    public ImpControlador_Preguntas getInstance() {
        //Si la INSTANCIA es NULA
        if (null == instance) {//Se genera una nueva
            instance = new ImpControlador_Preguntas();
        }//Y se retorna
        return instance;
    }

    @Override//OBTENER TODOS LAS PREGUNTAS
    public List<Pregunta> getTodasLasPreguntas() {
        //Se llama al SERVICIO DE PREGUNTAS para obtener las preguntas
        return preguntaServicio.getTodasLasPreguntas();
    }

    @Override//OBTENER TODOS LAS PREGUNTAS DE GEOGRAFÍA
    public List<Pregunta> getTodasLasPreguntasGeografia() {
        //Se llama al SERVICIO DE PREGUNTAS para obtener las preguntas
        return preguntaServicio.getTodasLasPreguntasGeografia();
    }

    @Override//OBTENER TODOS LAS PREGUNTAS DE HISTORIA
    public List<Pregunta> getTodasLasPreguntasHistoria() {
        //Se llama al SERVICIO DE PREGUNTAS para obtener las preguntas
        return preguntaServicio.getTodasLasPreguntasHistoria();
    }

    @Override//OBTENER TODOS LAS PREGUNTAS DE CIENCIA
    public List<Pregunta> getTodasLasPreguntasCiencia() {
        //Se llama al SERVICIO DE PREGUNTAS para obtener las preguntas
        return preguntaServicio.getTodasLasPreguntasCiencia();
    }

    @Override//OBTENER TODOS LAS PREGUNTAS DE DEPORTE
    public List<Pregunta> getTodasLasPreguntasDeporte() {
        //Se llama al SERVICIO DE PREGUNTAS para obtener las preguntas
        return preguntaServicio.getTodasLasPreguntasDeporte();
    }

    @Override//OBTENER TODOS LAS PREGUNTAS DE ARTE
    public List<Pregunta> getTodasLasPreguntasArte() {
        //Se llama al SERVICIO DE PREGUNTAS para obtener las preguntas
        return preguntaServicio.getTodasLasPreguntasArte();
    }

    @Override//OBTENER TODOS LAS PREGUNTAS POR ID CATEGORIA
    public List<Pregunta> getPreguntasPorIdCategoria(Integer id) {
        //Se llama al SERVICIO DE PREGUNTAS para obtener las preguntas
        return preguntaServicio.getPreguntasPorIdCategoria(id);
    }

}
