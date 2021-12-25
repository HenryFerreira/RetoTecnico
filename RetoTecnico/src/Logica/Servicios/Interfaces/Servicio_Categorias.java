package Logica.Servicios.Interfaces;

import Logica.Entidades.Categoria;
import java.util.List;

/**
 *
 * @author Haff
 */
public interface Servicio_Categorias {

    //OBTENER TODOS LAS CATEGORIA FACILES
    public List<Categoria> getCategoriasFaciles();

    //OBTENER TODOS LAS CATEGORIA NORMALES
    public List<Categoria> getCategoriasNormales();

    //OBTENER TODOS LAS CATEGORIA DIFICILES
    public List<Categoria> getCategoriasDificiles();

}
