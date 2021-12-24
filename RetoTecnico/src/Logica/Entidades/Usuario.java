package Logica.Entidades;

/**
 *
 * @author Haff
 */
public class Usuario {

    //============================= ATRIBUTOS ================================//
    private Integer id;
    private String nickname;
    private Integer puntos;
    //============================= ATRIBUTOS ================================//

    //=========================== CONSTRUCTORES ==============================//
    public Usuario() {
    }

    public Usuario(Integer id, String nickname, Integer puntos) {
        this.id = id;
        this.nickname = nickname;
        this.puntos = puntos;
    }

    public Usuario(String nickname, Integer puntos) {
        this.nickname = nickname;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }
    //========================= GETTERS & SETTERS ============================//

}
