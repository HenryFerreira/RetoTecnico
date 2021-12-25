package Logica.Controladores.Implementacion;

import Logica.Controladores.Interfaces.Controlador_Categorias;
import Logica.Entidades.Categoria;
import Logica.Servicios.Implementacion.ImpServicio_Categorias;
import Logica.Servicios.Interfaces.Servicio_Categorias;
import java.util.List;

/**
 *
 * @author Haff
 */
public class ImpControlador_Categorias implements Controlador_Categorias {

    //Variable estatica implementada como instancia del controlador
    private static ImpControlador_Categorias instance;

    //Obtener instancia del SERVICIO DE USUARIOS
    private final Servicio_Categorias categoriaServicio = new ImpServicio_Categorias().getInstance();

    //Obtener instancia de la IMPCONTROLADOR_CATEGORIAS
    public ImpControlador_Categorias getInstance() {
        //Si la INSTANCIA es NULA
        if (null == instance) {//Se genera una nueva
            instance = new ImpControlador_Categorias();
        }//Y se retorna
        return instance;
    }

    @Override//OBTENER TODOS LAS CATEGORIA FACILES
    public List<Categoria> getCategoriasFaciles() {
        return categoriaServicio.getCategoriasFaciles();
    }

    @Override//OBTENER TODOS LAS CATEGORIA NORMALES
    public List<Categoria> getCategoriasNormales() {
        return categoriaServicio.getCategoriasNormales();
    }

    @Override//OBTENER TODOS LAS CATEGORIA DIFICILES
    public List<Categoria> getCategoriasDificiles() {
        return categoriaServicio.getCategoriasDificiles();
    }

}
