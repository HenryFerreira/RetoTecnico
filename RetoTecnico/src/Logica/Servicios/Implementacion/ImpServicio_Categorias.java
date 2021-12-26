package Logica.Servicios.Implementacion;

import Logica.Entidades.Categoria;
import Logica.Servicios.Interfaces.Servicio_Categorias;
import Persistencia.ConexionBD;
import Persistencia.Consultas.Consultas_Categorias;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Haff
 */
public class ImpServicio_Categorias implements Servicio_Categorias {

    //Variable estatica implementada como instancia del servicio
    private static ImpServicio_Categorias instance;
    //Conexion a la base de datos
    private final ConexionBD conexion = new ConexionBD();
    //CONSULTAS DE CATEGORIAS
    private final Consultas_Categorias consultasCategorias = new Consultas_Categorias();

    //Obtener instancia de la IMPSERVICIO_CATEGORIAS
    public ImpServicio_Categorias getInstance() {
        //Si la INSTANCIA es NULA
        if (null == instance) {//Se genera una nueva
            instance = new ImpServicio_Categorias();
        }//Y se retorna
        return instance;
    }

    //Contructor por defecto
    public ImpServicio_Categorias() {
    }

    //================= OBTENER TODOS LAS CATEGORIA FACILES ==================//
    @Override
    public List<Categoria> getCategoriasFaciles() {
        List<Categoria> categorias = new ArrayList<>();//Lista de categorias
        try {
            //Se realiza la consulta a la base de datos mediante la CONEXION antes creada
            PreparedStatement sentencia = conexion.getConexion().prepareStatement(consultasCategorias.getCategoriasFaciles);
            ResultSet rs = sentencia.executeQuery();//Se obtiene la consulta
            while (rs.next()) {//Se recorre la consulta ontenida
                categorias.add(categoriaMapper(rs));//Se agregan los categorias a la lista
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImpServicio_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categorias;
    }
    //================= OBTENER TODOS LAS CATEGORIA FACILES ==================//

    //================ OBTENER TODOS LAS CATEGORIA NORMALES ==================//
    @Override
    public List<Categoria> getCategoriasNormales() {
        List<Categoria> categorias = new ArrayList<>();//Lista de categorias
        try {
            //Se realiza la consulta a la base de datos mediante la CONEXION antes creada
            PreparedStatement sentencia = conexion.getConexion().prepareStatement(consultasCategorias.getCategoriasNormales);
            ResultSet rs = sentencia.executeQuery();//Se obtiene la consulta
            while (rs.next()) {//Se recorre la consulta ontenida
                categorias.add(categoriaMapper(rs));//Se agregan los categorias a la lista
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImpServicio_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categorias;
    }
    //================ OBTENER TODOS LAS CATEGORIA NORMALES ==================//

    //=============== OBTENER TODOS LAS CATEGORIA DIFICILES ==================//
    @Override
    public List<Categoria> getCategoriasDificiles() {
        List<Categoria> categorias = new ArrayList<>();//Lista de categorias
        try {
            //Se realiza la consulta a la base de datos mediante la CONEXION antes creada
            PreparedStatement sentencia = conexion.getConexion().prepareStatement(consultasCategorias.getCategoriasDificiles);
            ResultSet rs = sentencia.executeQuery();//Se obtiene la consulta
            while (rs.next()) {//Se recorre la consulta ontenida
                categorias.add(categoriaMapper(rs));//Se agregan los categorias a la lista
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImpServicio_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categorias;
    }
    //=============== OBTENER TODOS LAS CATEGORIA DIFICILES ==================//
    
    //===================== OBTENER TODOS LAS CATEGORIA ======================//
    @Override
    public List<Categoria> getTodasLasCategorias() {
        List<Categoria> categorias = new ArrayList<>();//Lista de categorias
        try {
            //Se realiza la consulta a la base de datos mediante la CONEXION antes creada
            PreparedStatement sentencia = conexion.getConexion().prepareStatement(consultasCategorias.getTodasLasCategorias);
            ResultSet rs = sentencia.executeQuery();//Se obtiene la consulta
            while (rs.next()) {//Se recorre la consulta ontenida
                categorias.add(categoriaMapper(rs));//Se agregan los categorias a la lista
            }
        } catch (SQLException ex) {
            Logger.getLogger(ImpServicio_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categorias;
    }
    //===================== OBTENER TODOS LAS CATEGORIA ======================//

    //============================ MAPPER CATEGORIA ==========================//
    private Categoria categoriaMapper(ResultSet rs) throws SQLException {
        try {//Con lo que se obtuvo de la consulta se genera un objeto CATEGORIA
            return new Categoria(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getInt("dificultad")
            );
        } catch (SQLException ex) {
            throw new SQLException(ex.getMessage(), ex.getCause());
        }
    }
    //============================ MAPPER CATEGORIA ==========================//

}
