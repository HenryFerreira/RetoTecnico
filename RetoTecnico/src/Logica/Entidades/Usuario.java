package Logica.Entidades;

/**
 *
 * @author Haff
 */
public class Usuario {

    //============================= ATRIBUTOS ================================//
    private Integer id;
    private String nombre;
    private Integer puntos;
    //============================= ATRIBUTOS ================================//

    //=========================== CONSTRUCTORES ==============================//
    public Usuario() {
    }

    public Usuario(Integer id, String nombre, Integer puntos) {
        this.id = id;
        this.nombre = nombre;
        this.puntos = puntos;
    }
    //=========================== CONSTRUCTORES ==============================//

    //========================= GETTERS & SETTERS ============================//
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }
    //========================= GETTERS & SETTERS ============================//

}
