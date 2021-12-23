package Logica;

import Logica.Controladores.Implementacion.ImpControlador_Categorias;
import Logica.Controladores.Implementacion.ImpControlador_Preguntas;
import Logica.Controladores.Implementacion.ImpControlador_Usuarios;
import Logica.Controladores.Interfaces.Controlador_Categorias;
import Logica.Controladores.Interfaces.Controlador_Preguntas;
import Logica.Controladores.Interfaces.Controlador_Usuarios;
import Logica.Servicios.Implementacion.ImpServicio_Categorias;
import Logica.Servicios.Implementacion.ImpServicio_Preguntas;
import Logica.Servicios.Implementacion.ImpServicio_Usuarios;
import Logica.Servicios.Interfaces.Servicio_Categorias;
import Logica.Servicios.Interfaces.Servicio_Preguntas;
import Logica.Servicios.Interfaces.Servicio_Usuarios;

/**
 *
 * @author Haff
 */
public class Fabrica {

    private static Fabrica instance;

    //Obtener instancia de la FABRICA
    public static Fabrica getInstance() {
        if (instance == null) {
            instance = new Fabrica();
        }
        return instance;
    }

    //========================================================================//
    //Obtener instancia del CONTROLADOR DE USUARIOS
    public Controlador_Usuarios getControladorUsuarios() {
        Controlador_Usuarios cont = new ImpControlador_Usuarios();
        return cont;
    }

    //Obtener instancia del CONTROLADOR DE CATEGORIAS
    public Controlador_Categorias getControladorCategorias() {
        Controlador_Categorias cont = new ImpControlador_Categorias();
        return cont;
    }

    //Obtener instancia del CONTROLADOR DE PREGUNTAS
    public Controlador_Preguntas getControladorPreguntas() {
        Controlador_Preguntas cont = new ImpControlador_Preguntas();
        return cont;
    }
    //========================================================================//

    //========================================================================//    
    //Obtener instancia del SERVICIO DE USUARIOS
    public Servicio_Usuarios getServicioUsuarios() {
        Servicio_Usuarios cont = new ImpServicio_Usuarios();
        return cont;
    }

    //Obtener instancia del SERRVICIO DE CATEGORIAS
    public Servicio_Categorias getServicioCategorias() {
        Servicio_Categorias cont = new ImpServicio_Categorias();
        return cont;
    }

    //Obtener instancia del PREGUNTAS DE PREGUNTAS
    public Servicio_Preguntas getServicioPreguntas() {
        Servicio_Preguntas cont = new ImpServicio_Preguntas();
        return cont;
    }
    //========================================================================//    

}
